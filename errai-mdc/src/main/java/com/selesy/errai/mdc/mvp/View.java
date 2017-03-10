package com.selesy.errai.mdc.mvp;

import org.jboss.errai.ui.client.local.api.IsElement;

public interface View<T> extends IsElement {
  
  void setListener(T listener);

}
