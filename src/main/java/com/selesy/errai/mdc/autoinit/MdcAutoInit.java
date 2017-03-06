/**
 * 
 */
package com.selesy.errai.mdc.autoinit;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * @author smoyer1
 *
 */
@JsType(isNative = true, namespace = "mdc")
public interface MdcAutoInit {
	
	@JsMethod
	void autoInit();

}
