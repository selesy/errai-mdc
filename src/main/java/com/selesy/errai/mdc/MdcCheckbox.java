/**
 * 
 */
package com.selesy.errai.mdc;

import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * @author smoyer1
 *
 */
@Templated
@JsType(isNative = true)
public interface MdcCheckbox {
	
	@JsMethod
	MdcCheckbox MdcCheckbox(IsElement element);
	
}
