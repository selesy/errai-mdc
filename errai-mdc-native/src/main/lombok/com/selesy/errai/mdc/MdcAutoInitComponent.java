/**
 * 
 */
package com.selesy.errai.mdc;

import org.jboss.errai.common.client.dom.Element;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * @author smoyer1
 *
 */
@JsType(isNative = true)
public class MdcAutoInitComponent {

  // Adding a private constructor causes the GWT transpiler to fail but should
  // be allowed since this is definitely a utility class

  @JsMethod(namespace = "mdc")
  public static native void autoInit();

  @JsMethod(namespace = "mdc")
  public static native void autoInit(Element element);

  // TODO - Add a method with this signature:
  // @JsMethod(namespace = "mdc")
  // public static native void autoInit(HTMLElement element, MdcLogger warn);

  // TODO - Add a method with this signature:
  // @JsMethod(namespace = "mdc")
  // public static native void autoInit(MdcLogger warn);

}
