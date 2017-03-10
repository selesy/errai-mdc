/**
 * 
 */
package com.selesy.errai.mdc.checkbox;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.HTMLElement;

/**
 * @author swm16
 *
 */
public class MdcCheckbox extends MdcCheckboxComponent implements IsElement {

  MdcCheckboxView view;

  @Inject
  public MdcCheckbox(MdcCheckboxView view) {
    super(view.getElement());
    this.view = view;
  }

  @Override
  public HTMLElement getElement() {
    return view.getElement();
  }

}
