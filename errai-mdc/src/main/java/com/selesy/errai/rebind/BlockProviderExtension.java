/**
 * 
 */
package com.selesy.errai.rebind;

import org.jboss.errai.codegen.meta.MetaClass;
import org.jboss.errai.ioc.client.api.IOCExtension;
import org.jboss.errai.ioc.rebind.ioc.bootstrapper.IOCProcessingContext;
import org.jboss.errai.ioc.rebind.ioc.extension.IOCExtensionConfigurator;
import org.jboss.errai.ioc.rebind.ioc.graph.api.CustomFactoryInjectable;
import org.jboss.errai.ioc.rebind.ioc.graph.api.InjectionSite;
import org.jboss.errai.ioc.rebind.ioc.graph.api.Qualifier;
import org.jboss.errai.ioc.rebind.ioc.graph.impl.FactoryNameGenerator;
import org.jboss.errai.ioc.rebind.ioc.graph.impl.InjectableHandle;
import org.jboss.errai.ioc.rebind.ioc.injector.api.ExtensionTypeCallback;
import org.jboss.errai.ioc.rebind.ioc.injector.api.InjectableProvider;
import org.jboss.errai.ioc.rebind.ioc.injector.api.InjectionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.selesy.errai.mdc.bem.Block;

/**
 * @author swm16
 *         https://github.com/errai/errai/blob/master/errai-ui/src/main/java/org/jboss/errai/ui/rebind/ElementProviderExtension.java
 
 *(02:21:37 PM) mbarkley__: smoyer: for elements where there is a 1-1 mapping of interfaces to tag names, you can just @Inject them without a qualifier
(02:21:47 PM) mbarkley__: smoyer: so `@Inject Div div;` is valid
(02:22:26 PM) smoyer: yes ... I'm trying to write a ContextualTypeProvider that works for a whole range of elements
(02:23:25 PM) mbarkley__: smoyer: okay, so you can't use a ContextualTypeProvider for native JsTypes because there is no class info for them at runtime
(02:24:13 PM) smoyer: how does HTMLElement provider get called for some of the JsTypes (when @Name is required)?
(02:24:39 PM) smoyer: I'm guessing that I need a FactoryGenerator so they're created during rebind?
(02:25:11 PM) mbarkley__: smoyer: this is the IOC extension that generates factories for all the element wrappers in Errai: https://github.com/errai/errai/blob/master/errai-ui/src/main/java/org/jboss/errai/ui/rebind/ElementProviderExtension.java
(02:25:22 PM) mbarkley__: be warned, it's not an easy read
(02:26:25 PM) smoyer: I've been trawling through the IOC module looking for that!
(02:27:43 PM) smoyer: thank you so much! ... an activity diagram, sequence diagram or even an old fashioned flowchart would have helped immensely and I've been drawing on my whiteboard as I went
(02:28:03 PM) smoyer: but mostly I went down rabbit holes that led elsewhere ;)
(02:28:20 PM) mbarkley__: hehe that's the downside of loosely-coupled components
(02:28:48 PM) smoyer: isn't that the truth ... the beauty is all outside the container
(02:31:29 PM) smoyer: what types does this class actually handle? ... anything that's a native JsType?
(02:31:58 PM) smoyer: or that extends HTMLElement/Element?
(02:32:12 PM) mbarkley__: all the GWT element types, and any native @JsType annotated with Errai's @Element
(02:32:35 PM) mbarkley__: smoyer: so if you just want to make your own element wrapper and you don't need any other special behaviour, you can just annotate your wrapper with @Element
(02:33:12 PM) smoyer: I've got about 30 of them and most have extra qualifiers
(02:33:40 PM) smoyer: I started off creating a hand-coded provider for each but realized there should be something more elegant
(02:34:31 PM) smoyer: I'm creating two sets of element annotations ... one for BEM and another for ARIA
(02:35:25 PM) smoyer: and the ContextualTypeProvider seemed perfect except I had to create one for each element
(02:35:45 PM) smoyer: (if I didn't want the HTMLElementProvider to handle it instead)
(02:44:29 PM) conan [~conan@mdproctor.plus.com] entered the room.
(02:56:00 PM) conan left the room (quit: Quit: Computer has gone to sleep.).
(02:57:29 PM) conan [~conan@mdproctor.plus.com] entered the room.
(03:00:58 PM) paulovmr left the room (quit: Ping timeout: 264 seconds).
(03:16:31 PM) paulovmr [~paulovmr@redhat/jboss/paulovmr] entered the room.
(03:18:22 PM) smoyer: @mbarkley:  thanks again ... after looking at the ElementProviderExtension it's exactly what I was looking for
(03:26:25 PM) mbarkley__: smoyer: you're welcome! glad you got what you needed :)
(03:37:20 PM) sr_pere left the room (quit: Ping timeout: 260 seconds).
(04:01:59 PM) smoyer: @mbarkley: If you have time for one more question - how do I handle types that have optional qualifiers?  It looks like registerExactTypeInjectableProvider would require that I register every possible combination of qualifiers?
(04:04:17 PM) mbarkley__: smoyer: the qualifier factory has a "universal" qualifier... this matches any set of qualifiers
(04:04:40 PM) mbarkley__: this is what is used under the hood to match injection sites for ContextualTypeProviders
(04:05:55 PM) smoyer: ah ... so even if some of the qualifiers are required, I delegate that to a run-time provider
 */
@IOCExtension
public class BlockProviderExtension implements IOCExtensionConfigurator {

  static final Logger LOGGER = LoggerFactory.getLogger(BlockProviderExtension.class);

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.jboss.errai.ioc.rebind.ioc.extension.IOCExtensionConfigurator#configure
   * (org.jboss.errai.ioc.rebind.ioc.bootstrapper.IOCProcessingContext,
   * org.jboss.errai.ioc.rebind.ioc.injector.api.InjectionContext)
   */
  @Override
  public void configure(IOCProcessingContext context, InjectionContext injectionContext) {
    // TODO Auto-generated method stub
    LOGGER.trace("configure(IOCProcessingContext, InjectionContext)");
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.jboss.errai.ioc.rebind.ioc.extension.IOCExtensionConfigurator#
   * afterInitialization(org.jboss.errai.ioc.rebind.ioc.bootstrapper.
   * IOCProcessingContext,
   * org.jboss.errai.ioc.rebind.ioc.injector.api.InjectionContext)
   */
  @Override
  public void afterInitialization(IOCProcessingContext context, InjectionContext injectionContext) {
    LOGGER.trace("afterInitialization(IOCProcessingContext, InjectionContext)");
    // TODO Auto-generated method stub
    injectionContext.registerExtensionTypeCallback(new ExtensionTypeCallback() {

      @Override
      public void callback(MetaClass type) {
        if(type.isAnnotationPresent(Block.class)) {
          System.out.println("MetaClass type: " + type.getName());
          
          Qualifier universal = injectionContext.getQualifierFactory().forUniversallyQualified();
          final InjectableHandle handle = new InjectableHandle(type, universal);
              
          injectionContext.registerExactTypeInjectableProvider(handle, new InjectableProvider() {
            
            CustomFactoryInjectable injectable;
            
            @Override
            public CustomFactoryInjectable getInjectable(InjectionSite injectionSite, FactoryNameGenerator nameGenerator) {
              // TODO Auto-generated method stub
              return null;
            }
            
          });
        }
        
      }

    });

  }

}
