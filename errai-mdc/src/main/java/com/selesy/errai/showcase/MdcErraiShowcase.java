/**
 * 
 */
package com.selesy.errai.showcase;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.errai.common.client.dom.Button;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Document;
import org.jboss.errai.common.client.dom.Event;
import org.jboss.errai.common.client.dom.EventListener;
import org.jboss.errai.common.client.dom.Window;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.slf4j.Logger;

import com.selesy.errai.mdc.MdcRippleComponent;
import com.selesy.errai.mdc.MdcSnackbarComponent;
import com.selesy.errai.mdc.MdcSnackbarData;
import com.selesy.errai.mdc.autoinit.MdcAutoInitComponent;
import com.selesy.errai.mdc.button.MdcButton;
import com.selesy.errai.mdc.checkbox.MdcCheckbox;
import com.selesy.errai.mdc.fab.MdcFab;
import com.selesy.errai.mdc.fab.MdcFabView;
import com.selesy.errai.mdc.icon.Icon;
import com.selesy.errai.mdc.icon.IconFamily;
import com.selesy.errai.mdc.icon.MdcIcon;
import com.selesy.errai.mdc.list.MdcList;
import com.selesy.errai.showcase.views.DrawerView;

/**
 * @author smoyer1
 *
 */
@EntryPoint
public class MdcErraiShowcase {

  @Inject
  Logger logger;

  @Inject
  Document document;

  // @Inject
  // Navigation navigation;

  @Inject
  DrawerView drawerView;

  @Inject
  MdcCheckbox mdcCheckbox;
  
  @Inject
  MdcList mdcList;

  @Inject
  @Named("button")
  MdcButton mdcButton;
  
  @Inject
  @Named("i")
  @Icon(family = IconFamily.MATERIAL_ICONS, label = "Happy", content="mood")
  MdcIcon smileyIcon;

  @Inject
  @Named("i")
  @Icon(family = IconFamily.MATERIAL_ICONS, label = "Sad", content="mood_bad")
  MdcIcon frownyIcon;

  // @Inject
  // Sumptin sumptin;

  // @Inject
  // @Named("line")
  // @Block(element = "span", style = "sumptin")
  // SubSumptin subSumptin;

  // @Inject
  // @Named("span")
  // @Block(element = "span", style = "sumptin")
  // SvgElement svgElement;

  @Inject
  MdcFab fab;

  @Inject
  MdcFabView fabView;

  @PostConstruct
  public void start() {
    logger.trace("start()");
    logger.debug("Is mdcList null: {}", mdcList == null);
    // logger.debug("Is mdcButton null: {}", mdcButton == null);
    // navigation.
    Div root = (Div) document.getElementById("mdcErraiShowcase");
    // document.getBody().appendChild(drawerView.getElement());
    root.appendChild(drawerView.getElement());
    // Mdc.autoInit(drawerView);
    // NativeMdcAutoInit.mdcAutoInit(drawerView.getElement());

    root.appendChild(mdcCheckbox.getElement());

    Button button = (Button) document.createElement("button");
    button.setAttribute("class", "mdc-button mdc-button--raised mdc-button--primary");
    button.setAttribute("data-mdc-auto-init", "MDCRipple");
    button.setInnerHTML("Press me!");
    root.appendChild(button);
    MdcAutoInitComponent.autoInit();
    // Mdc.autoInit(String::hashCode);
    
    Button button2 = (Button) document.createElement("button");
    button2.setAttribute("class", "mdc-button mdc-button--raised mdc-button--accent");
    button2.setAttribute("data-mdc-auto-init", "MDCRipple");
    button2.setInnerHTML("Press me instead!");
    root.appendChild(button2);
    MdcAutoInitComponent.autoInit(button2);
    MdcAutoInitComponent.autoInit();

    // root.appendChild((HTMLElement) mdcButton);
    // root.appendChild(sumptin.getElement());
    // root.appendChild(subSumptin.getElement());

    //root.appendChild(mdcButton);
    
    root.appendChild(smileyIcon);
    root.appendChild(frownyIcon);

    root.appendChild(fab.getElement());
    root.appendChild(fabView.getElement());
    MdcRippleComponent.attachTo(fabView.getElement());

    Div rippleSquare = (Div) Window.getDocument().createElement("div");
    rippleSquare.setAttribute("class", "mdc-ripple-surface");
    rippleSquare.setAttribute("style", "height: 200px; width: 200px; border: 1px solid black");
    MdcRippleComponent rippleComponent = MdcRippleComponent.attachTo(rippleSquare);
    // MdcRippleComponent rippleComponent = new
    // MdcRippleComponent(rippleSquare);
    // rippleComponent.setUnbounded(true);
    root.appendChild(rippleSquare);
    rippleComponent.activate();
    
    fab.getElement().addEventListener("click", new EventListener<Event>() {

      @Override
      public void call(Event event) {
        rippleComponent.deactivate();
      }

    }, true);
    
    
    root.appendChild(mdcCheckbox.getElement());
    
    fabView.getElement().addEventListener("click", new EventListener<Event>() {

      @Override
      public void call(Event event) {
        rippleComponent.activate();
        mdcCheckbox.setIndeterminate(true);
      }

    }, true);
    
    Div snackbar = (Div) document.createElement("div");
    snackbar.setAttribute("class", "mdc-snackbar");
    Div snackbarText = (Div) document.createElement("div");
    snackbarText.setAttribute("class", "mdc-snackbar__text");
    snackbar.appendChild(snackbarText);
    Div snackbarActionWrapper = (Div) document.createElement("div");
    snackbarActionWrapper.setAttribute("class", "mdc-snackbar__action-wrapper");
    Button snackbarActionButton = (Button) document.createElement("button");
    snackbarActionButton.setAttribute("class", "mdc-button mdc-snackbar__action-button");
    snackbarActionButton.setAttribute("type", "button");
    snackbarActionWrapper.appendChild(snackbarActionButton);
    snackbar.appendChild(snackbarActionWrapper);
    
//    MdcSnackbarComponent snackbarComponent = new MdcSnackbarComponent(snackbar);
    MdcSnackbarComponent snackbarComponent = MdcSnackbarComponent.attachTo(snackbar);
    MdcSnackbarData snackbarData = new MdcSnackbarData();
    //snackbarData.setMessage("This is a test");
    snackbarData.message = "This is a test";
    
//    Map<String, String> snackbarData = new HashMap<>();
//    snackbarData.put("message", "This is a test");
    //EJObject snackbarData = new ErraiJSON
    
//    final JSONObject snackbarData = new JSONObject();
//    snackbarData.put("message", new JSONString("This is a test"));

    button2.addEventListener("click", new EventListener<Event>() {

      @Override
      public void call(Event event) {
        logger.trace("call(Event)");
        logger.debug("JSONObject: {}", snackbarData);
        snackbarComponent.show(snackbarData);
      }
      
    }, true);
    
  }

}
