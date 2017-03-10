package com.selesy.errai.mdc.fab;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.common.client.ui.HasValue;

import com.selesy.errai.mdc.MdcBaseComponent;
import com.selesy.errai.mdc.base.Component;
import com.selesy.errai.mdc.icon.MdcIcon;

//@Element("button")
@Component(MdcBaseComponent.class)
public class MdcFab implements IsElement, HasValue<MdcIcon> {
  
  @Inject
  MdcFabView view;
  
  MdcBaseComponent component;
  
  @PostConstruct
  public void postConstruct() {
    //component = new MdcComponent(view.getElement());
    //component = MdcComponent.attachTo(view.getElement());
    //component = Mdc.createMdcComponent(view.getElement());
    //component = Mdc.attachMdcComponentTo(view.getElement());
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
public MdcIcon getValue() {
	// TODO Auto-generated method stub
	return null;
}

/* (non-Javadoc)
 * @see org.jboss.errai.common.client.ui.HasValue#setValue(java.lang.Object)
 */
@Override
public void setValue(MdcIcon value) {
	// TODO Auto-generated method stub
	
}

}
