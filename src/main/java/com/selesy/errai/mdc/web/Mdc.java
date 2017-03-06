/**
 * 
 */
package com.selesy.errai.mdc.web;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * @author smoyer1
 *
 */
@JsType(isNative = true)
public class Mdc {
	
	@JsMethod(namespace = "mdc")
	public static native void autoInit();
	
//	public static void autoInit() {
//		autoInit(Window.getDocument().getDocumentElement());
//	}
//	
//	public static void autoInit(Element element) {
//		autoInit(element, Optional.empty());
//	}
//	
//	@JsMethod
//	public static native void autoInit(Element element, @JsOptional Optional<Consumer<String>> alternateLogger);

}
