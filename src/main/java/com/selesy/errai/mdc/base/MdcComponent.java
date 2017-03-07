/**
 * 
 */
package com.selesy.errai.mdc.base;

import java.util.Set;

import org.jboss.errai.common.client.dom.HTMLElement;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * @author smoyer1
 *
 */
@JsType(isNative = true, name = "MDCComponent")
public class MdcComponent {
	
	@JsConstructor
	public MdcComponent(HTMLElement element) {}

	@JsMethod(name = "cssClasses")
	public static native Set<String> getCssClasses();
}
