/**
 * 
 */
package com.selesy.errai.mdc;

import org.jboss.errai.common.client.dom.HTMLElement;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;

/**
 * @author smoyer1
 *
 */
@JsType(isNative = true, namespace = "mdc.checkbox", name = "MDCCheckbox")
public class MdcCheckbox {
	
	@JsConstructor
	public MdcCheckbox(HTMLElement htmlElement) {};
	
}
