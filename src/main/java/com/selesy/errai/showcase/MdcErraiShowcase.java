/**
 * 
 */
package com.selesy.errai.showcase;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.errai.common.client.dom.Button;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Document;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.slf4j.Logger;

import com.selesy.errai.mdc.MdcCheckboxImpl;
import com.selesy.errai.mdc.button.MdcButton;
import com.selesy.errai.mdc.web.Mdc;
import com.selesy.errai.showcase.views.DrawerView;

/**
 * @author smoyer1
 *
 */
@EntryPoint
public class MdcErraiShowcase {
	
	@Inject
	Logger logger;
	
	@Inject
	Document document;
	
//	@Inject
//	Navigation navigation;
	
	@Inject
	DrawerView drawerView;
	
	@Inject
	MdcCheckboxImpl mdcCheckboxImpl;
	
	@Inject
	//@Named("button")
	MdcButton mdcButton;
	
	@PostConstruct
	public void start() {
		logger.trace("start()");
		logger.debug("Is mdcButton null: {}", mdcButton == null);
		//navigation.
		Div root = (Div) document.getElementById("mdcErraiShowcase");
		//document.getBody().appendChild(drawerView.getElement());
		root.appendChild(drawerView.getElement());
		//Mdc.autoInit(drawerView);
		//NativeMdcAutoInit.mdcAutoInit(drawerView.getElement());
		
		root.appendChild(mdcCheckboxImpl.getElement());
		
		Button button = (Button) document.createElement("button");
		button.setAttribute("class", "mdc-button mdc-button--raised mdc-button--primary");
		button.setAttribute("data-mdc-auto-init", "MDCRipple");
		button.setInnerHTML("Press me!");
		root.appendChild(button);
		Mdc.autoInit();
		//Mdc.autoInit(String::hashCode);
		
		root.appendChild((HTMLElement) mdcButton);
		
	}

}
