package com.selesy.errai.mdc.fab;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.slf4j.Logger;

@Templated("#view")
public class MdcFabViewImpl implements MdcFabView {
  
  @Inject
  Logger logger;
  
  @Inject
  @DataField("mdc-fab__icon")
  Span icon;
  
  @PostConstruct
  public void postConstruct() {
    logger.trace("postConstruct()");
  }

}
