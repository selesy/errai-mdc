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

import com.selesy.errai.mdc.MdcCheckboxImpl;
import com.selesy.errai.mdc.button.MdcButton;
import com.selesy.errai.mdc.fab.MdcFab;
import com.selesy.errai.mdc.fab.MdcFabView;
import com.selesy.errai.mdc.ripple.MdcRippleComponent;
import com.selesy.errai.mdc.ripple.MdcRippleFoundation;
import com.selesy.errai.mdc.web.Mdc;
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
  MdcCheckboxImpl mdcCheckboxImpl;

  @Inject
  @Named("button")
  MdcButton mdcButton;

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
    // logger.debug("Is mdcButton null: {}", mdcButton == null);
    // navigation.
    Div root = (Div) document.getElementById("mdcErraiShowcase");
    // document.getBody().appendChild(drawerView.getElement());
    root.appendChild(drawerView.getElement());
    // Mdc.autoInit(drawerView);
    // NativeMdcAutoInit.mdcAutoInit(drawerView.getElement());

    root.appendChild(mdcCheckboxImpl.getElement());

    Button button = (Button) document.createElement("button");
    button.setAttribute("class", "mdc-button mdc-button--raised mdc-button--primary");
    button.setAttribute("data-mdc-auto-init", "MDCRipple");
    button.setInnerHTML("Press me!");
    root.appendChild(button);
    Mdc.autoInit();
    // Mdc.autoInit(String::hashCode);

    // root.appendChild((HTMLElement) mdcButton);
    // root.appendChild(sumptin.getElement());
    // root.appendChild(subSumptin.getElement());

    root.appendChild(mdcButton);

    root.appendChild(fab.getElement());
    root.appendChild(fabView.getElement());

    Div rippleSquare = (Div) Window.getDocument().createElement("div");
    rippleSquare.setAttribute("class", "mdc-ripple-surface");
    rippleSquare.setAttribute("style", "height: 200px; width: 200px; border: 1px solid black");
    MdcRippleComponent rippleComponent = MdcRippleComponent.attachTo(rippleSquare);
    // MdcRippleComponent rippleComponent = new
    // MdcRippleComponent(rippleSquare);
    // rippleComponent.setUnbounded(true);
    root.appendChild(rippleSquare);
    rippleComponent.activate();
    MdcRippleFoundation rippleFoundation = rippleComponent.getDefaultFoundation();

    fab.getElement().addEventListener("click", new EventListener<Event>() {

      @Override
      public void call(Event event) {
        rippleComponent.deactivate();
      }

    }, true);
  }

}
