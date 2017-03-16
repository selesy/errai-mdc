package com.selesy.errai.mdc;

import org.jboss.errai.common.client.dom.HTMLElement;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;

public class MdcInputComponent<F extends MdcBaseFoundation> extends MdcBaseComponent<F> {

  @JsConstructor
  public MdcInputComponent(HTMLElement element) {
    // This method body is really only here to satisfy Java syntax
    // requirements. If the underlying Javascript class didn't
    // have a constructor, this class could be an interface. No code
    // in this block is ever executed.
    super(element);
  }

  @JsProperty(name = "disabled")
  public native boolean getDisabled();

  @JsProperty(name = "disabled")
  public native boolean setDisabled();

}
