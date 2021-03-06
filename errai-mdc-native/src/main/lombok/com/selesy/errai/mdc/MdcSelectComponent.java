package com.selesy.errai.mdc;

import org.jboss.errai.common.client.dom.HTMLElement;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * This class is a native wrapper for the base MDCRipple from the
 * material-components-web (MCD) project. This class, and any sub-classes
 * faithfully follow the underlying model of the MCD project with the exception
 * of Java adapting to recognized coding conventions where possible.
 * 
 * MDC Component classes provide overlay methods when a method argument is an
 * HTML element for easy use with the Errai IsElement interface. MDC Foundation
 * classes and Adapter classes are not implemented but are stubbed out so that
 * the Component classes can be as complete as possible.
 * 
 * References:
 * 
 * @see https://github.com/material-components/material-components-web/tree/master/packages/mdc-select
 * @see https://github.com/material-components/material-components-web/blob/master/packages/mdc-select/index.js
 * @see http://material-components-web.appspot.com/select.html
 * 
 * @see https://github.com/material-components/material-components-web
 * @see http://material-components-web.appspot.com/
 * 
 * @see https://www.material.io/
 * @see https://www.material.io/guidelines/
 * @see https://www.material.io/components/
 * @see https://www.material.io/icons/
 */
@JsType(isNative = true, namespace = "mdc.select", name = "MDCSelect")
public class MdcSelectComponent extends MdcInputComponent<MdcSelectFoundation> {

  @JsConstructor
  public MdcSelectComponent(HTMLElement element) {
    // This method body is really only here to satisfy Java syntax
    // requirements. If the underlying Javascript class didn't
    // have a constructor, this class could be an interface. No code
    // in this block is ever executed.
    super(element);
  }

  // This method needs to be overriden in every subclass since it's static
  // and we can't use a class-level generic to resolve the return type.
  @JsMethod
  public static native MdcSelectComponent attachTo(HTMLElement element);
  
  @JsProperty(name = "value")
  public native String getValue();
  
  @JsProperty(name = "options")
  public native String[] getOptions();
  
  @JsProperty(name = "selectedOptions")
  public native String[] getSelectedOptions();
  
  @JsProperty(name = "selectedIndex")
  public native int getSelectedIndex();
  
  @JsProperty(name = "selectedIndex")
  public native void setSelectedIndex(int selectedIndex);
  
  @JsMethod(name = "item")
  public native void getItem(int index);
  
  @JsMethod(name = "namedItem")
  public native void getNamedItem(String key);

}
