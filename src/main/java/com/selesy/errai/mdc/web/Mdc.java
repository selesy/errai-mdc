/**
 * 
 */
package com.selesy.errai.mdc.web;

import org.jboss.errai.common.client.dom.HTMLElement;

import com.selesy.errai.mdc.MdcCheckbox;
import com.selesy.errai.mdc.base.MdcLogger;

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
	
	@JsMethod(namespace = "mdc")
	public static native void autoInit(HTMLElement element);
	
	@JsMethod(namespace = "mdc")
	public static native void autoInit(HTMLElement element, MdcLogger warn);
	
	@JsMethod(namespace = "mdc")
	public static native void autoInit(MdcLogger warn);
	
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
	
	@JsMethod(namespace = "mdc.checkbox", name = "MDCCheckbox")
	public static native MdcCheckbox createMdcCheckbox(HTMLElement htmlElement);

}
