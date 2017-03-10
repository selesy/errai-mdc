/**
 * 
 */
package com.selesy.errai.mdc.base;

import jsinterop.annotations.JsFunction;

/**
 * @author smoyer1
 *
 */
@FunctionalInterface
@JsFunction
public interface MdcLogger {
	
	void warn(String message);

}
