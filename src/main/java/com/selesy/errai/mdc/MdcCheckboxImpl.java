/**
 * 
 */
package com.selesy.errai.mdc;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.ui.client.local.api.IsElement;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.selesy.errai.mdc.web.Mdc;

/**
 * @author smoyer1
 *
 */
@Templated("#component")
public class MdcCheckboxImpl implements IsElement {
	
	@Inject
	@Named("div")
	@DataField
	Div component;
	
	MdcCheckbox mdcCheckbox;
	
	@PostConstruct
	public void postConstruct() {
		mdcCheckbox = new MdcCheckbox(component);
		//mdcCheckbox = Mdc.createMdcCheckbox(component);
	}

}
