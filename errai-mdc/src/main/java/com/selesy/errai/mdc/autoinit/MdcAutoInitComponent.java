/**
 * 
 */
package com.selesy.errai.mdc.autoinit;

import org.jboss.errai.common.client.dom.Element;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * @author smoyer1
 *
 */
@JsType(isNative = true)
public class MdcAutoInitComponent {

// The causes the GWT transpiler to fail but should be allowed since this
// is definitely a utility class
//  private MdcAutoInitComponent() {
//    // Utility class
//  }
	
  @JsMethod(namespace = "mdc")
  public static native void autoInit();
  
  @JsMethod(namespace = "mdc")
  public static native void autoInit(Element element);
  
//  @JsMethod(namespace = "mdc")
//  public static native void autoInit(HTMLElement element, MdcLogger warn);
  
//  @JsMethod(namespace = "mdc")
//  public static native void autoInit(MdcLogger warn);
	
}
