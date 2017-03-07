/**
 * 
 */
package com.selesy.errai.mdc.ioc;

import java.lang.annotation.Annotation;

import javax.inject.Inject;

import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.dom.Window;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.api.Disposer;
import org.slf4j.Logger;

import com.selesy.errai.mdc.base.MdcComponent;
import com.selesy.errai.mdc.base.MdcElement;

/**
 * @author smoyer1
 *
 */
public abstract class MdcElementProvider<T extends MdcElement<MdcComponent>>
    implements ContextualTypeProvider<T>, Disposer<T> {

  @Inject
  Logger logger;
  
  T element;

  @Override
  public void dispose(T beanInstance) {
    logger.trace("dispose(T extends MdcElement)");
    // TODO Auto-generated method stub

  }

  @Override
  public T provide(Class<?>[] typeargs, Annotation[] qualifiers) {
    logger.trace("provide(Class[], Annotation[]");
    getElements();
    // TODO Auto-generated method stub
    Span span = (Span) Window.getDocument().createElement("span");
    span.setInnerHTML("Sumptin else!");
    return (T) span;
  }
  
  String[] getElements() {
    logger.trace("getElements()");
    //Class<T> clazz = (Class<T>) element.getClass();
    //logger.debug("Element type: {}", clazz.getSimpleName());
    return new String[0];
  }

}
