/**
 * 
 */
package com.selesy.errai.showcase.views;

import com.selesy.errai.showcase.views.DrawerView.Listener;

/**
 * @author smoyer1
 *
 */
public interface DrawerView extends View<Listener> {
	
	public interface Listener {
		void onClick(String title);
	}
	
	void addDemoPageLink(String title, String icon);
	void setHomePageLink(String title, String icon);

}
