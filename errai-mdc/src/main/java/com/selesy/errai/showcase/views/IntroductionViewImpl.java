/**
 * 
 */
package com.selesy.errai.showcase.views;

import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;

/**
 * @author smoyer1
 *
 */
@Page(path = "introduction", role = DefaultPage.class)
public class IntroductionViewImpl implements IntroductionView {

	/* (non-Javadoc)
	 * @see com.selesy.errai.showcase.views.View#setListener(java.lang.Object)
	 */
	@Override
	public void setListener(com.selesy.errai.showcase.views.DrawerView.Listener listener) {
		// TODO Auto-generated method stub

	}

}
