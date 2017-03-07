package com.selesy.errai.mdc.fab;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.HTMLElement;

import com.selesy.errai.mdc.base.Component;
import com.selesy.errai.mdc.base.MdcComponent;
import com.selesy.errai.mdc.web.Mdc;

//@Element("button")
@Component(MdcComponent.class)
public class MdcFab implements IsElement {
  
  @Inject
  MdcFabView view;
  
  MdcComponent component;
  
  @PostConstruct
  public void postConstruct() {
    //component = new MdcComponent(view.getElement());
    //component = MdcComponent.attachTo(view.getElement());
    //component = Mdc.createMdcComponent(view.getElement());
    component = Mdc.attachMdcComponentTo(view.getElement());
  }

  @Override
  public HTMLElement getElement() {
    // TODO Auto-generated method stub
    return view.getElement();
  }

}
