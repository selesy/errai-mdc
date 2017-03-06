/**
 * 
 */
package com.selesy.errai.showcase;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Document;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.slf4j.Logger;

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
	
	@Inject
	Navigation navigation;
	
	@Inject
	DrawerView drawerView;
	
	@PostConstruct
	public void start() {
		logger.trace("start()");
		//navigation.
		Div root = (Div) document.getElementById("mdcErraiShowcase");
		//document.getBody().appendChild(drawerView.getElement());
		root.appendChild(drawerView.getElement());
		Mdc.autoInit();
		
		
	}

}
