package com.selesy.errai.mdc;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL)
//@Data
public class MdcSnackbarData {
  
  @JsProperty(name = "message")
  public String message;
  
//  @JsProperty(name = "message")
//  public String getMessage() {
//    return message;
//  }
//  
//  @JsProperty(name = "message")
//  public void setMessage(String message) {
//    this.message = message;
//  }
  
  
//  @JsProperty(name = "message")
//  public native void setMessage(String message);
  
}
