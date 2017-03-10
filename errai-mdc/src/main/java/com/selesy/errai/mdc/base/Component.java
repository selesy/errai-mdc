/**
 * 
 */
package com.selesy.errai.mdc.base;

import com.selesy.errai.mdc.MdcBaseComponent;

/**
 * @author smoyer1
 *
 */
public @interface Component {

  Class<? extends MdcBaseComponent> value();

}
