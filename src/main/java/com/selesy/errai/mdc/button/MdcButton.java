/**
 * 
 */
package com.selesy.errai.mdc.button;

import org.jboss.errai.common.client.api.annotations.Element;

import com.selesy.errai.mdc.base.MdcComponent;
import com.selesy.errai.mdc.base.MdcElement;
import com.selesy.errai.mdc.bem.Bem;

import jsinterop.annotations.JsType;

/**
 * @author smoyer1
 *
 */
@JsType(isNative = true)
@Element({ "button", "a" })
@Bem(block = "mdc-button", modifiers = { "dense", "raised", "compact", "primary", "accent" })
public interface MdcButton extends MdcElement<MdcComponent> {

}
