/**
 * 
 */
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
 * @see https://github.com/material-components/material-components-web/tree/master/packages/mdc-ripple
 * @see https://github.com/material-components/material-components-web/blob/master/packages/mdc-ripple/index.js
 * @see http://material-components-web.appspot.com/ripple.html
 * 
 * @see https://github.com/material-components/material-components-web
 * @see http://material-components-web.appspot.com/
 * 
 * @see https://www.material.io/
 * @see https://www.material.io/guidelines/
 * @see https://www.material.io/components/
 * @see https://www.material.io/icons/
 */
@JsType(isNative = true, namespace = "mdc.ripple", name = "MDCRipple")
public class MdcRippleComponent extends MdcBaseComponent<MdcRippleFoundation> {

  @JsConstructor
  public MdcRippleComponent(HTMLElement element) {
    // This method body is really only here to satisfy Java syntax
    // requirements. If the underlying Javascript class didn't
    // have a constructor, this class could be an interface. No code
    // in this block is ever executed.
    super(element);
  }

  // This method needs to be overriden in every subclass since it's static
  // and we can't use a class-level generic to resolve the return type.
  @JsMethod
  public static native MdcRippleComponent attachTo(HTMLElement element);

  @JsProperty(name = "unbounded")
  public native boolean isUnbounded();

  @JsProperty(name = "unbounded")
  public native void setUnbounded(boolean unbounded);

  @JsMethod
  public native void activate();

  @JsMethod
  public native void deactivate();

}
