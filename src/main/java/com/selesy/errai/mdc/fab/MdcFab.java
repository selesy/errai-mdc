package com.selesy.errai.mdc.fab;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.common.client.ui.HasValue;

import com.selesy.errai.mdc.base.Component;
import com.selesy.errai.mdc.base.MdcBaseComponent;
import com.selesy.errai.mdc.icon.Icon;
import com.selesy.errai.mdc.web.Mdc;

//@Element("button")
@Component(MdcBaseComponent.class)
public class MdcFab implements IsElement, HasValue<Icon> {
  
  @Inject
  MdcFabView view;
  
  MdcBaseComponent component;
  
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

/* (non-Javadoc)
 * @see org.jboss.errai.common.client.ui.HasValue#getValue()
 */
@Override
public Icon getValue() {
	// TODO Auto-generated method stub
	return null;
}

/* (non-Javadoc)
 * @see org.jboss.errai.common.client.ui.HasValue#setValue(java.lang.Object)
 */
@Override
public void setValue(Icon value) {
	// TODO Auto-generated method stub
	
}

}
