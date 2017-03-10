package com.selesy.errai.mdc.list;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import org.slf4j.Logger;

public class MdcListInjector {
  
  @Inject
  Logger logger;
   
  @Produces
  public MdcList produceMdcList() { //InjectionPoint injectionPoint) {
    logger.trace("produceMdcList(InjectionPoint)");
    return new MdcList("nav");
  }
  

}
