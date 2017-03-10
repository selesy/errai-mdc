/**
 * 
 */
package com.selesy.errai.showcase.views;

import org.jboss.errai.ui.client.local.api.IsElement;

/**
 * @author smoyer1
 *
 */
public interface View<T> extends IsElement {
	
	void setListener(T listener);

}
