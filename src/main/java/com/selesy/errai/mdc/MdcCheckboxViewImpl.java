package com.selesy.errai.mdc;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.ui.client.local.api.IsElement;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.selesy.errai.mdc.web.Mdc;

@Templated("#component")
public class MdcCheckboxViewImpl implements IsElement {
  
  @Inject
  @Named("div")
  @DataField
  Div component;
  
  @PostConstruct
  public void postConstruct() {
    new MdcCheckbox(component);
  }

}
