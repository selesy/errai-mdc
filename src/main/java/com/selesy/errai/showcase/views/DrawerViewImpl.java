/**
 * 
 */
package com.selesy.errai.showcase.views;

import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author smoyer1
 *
 */
@Templated("#component")
public class DrawerViewImpl implements DrawerView {
	
	@Inject
	@Named("header")
	@DataField
	HTMLElement header;

	/* (non-Javadoc)
	 * @see com.selesy.errai.showcase.views.View#setListener(java.lang.Object)
	 */
	@Override
	public void setListener(Listener listener) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.selesy.errai.showcase.views.DrawerView#addDemoPageLink(java.lang.String, java.lang.String)
	 */
	@Override
	public void addDemoPageLink(String title, String icon) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.selesy.errai.showcase.views.DrawerView#setHomePageLink(java.lang.String, java.lang.String)
	 */
	@Override
	public void setHomePageLink(String title, String icon) {
		// TODO Auto-generated method stub

	}

}
