package com.selesy.errai.mdc.icon;

import java.lang.annotation.Annotation;
import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.api.IOCProvider;
import org.jboss.errai.ui.client.local.producer.HTMLElementProvider;
import org.slf4j.Logger;

import com.selesy.errai.mdc.utils.AnnotationUtils;
import com.selesy.errai.mdc.utils.StyleUtils;

@IOCProvider
public class MdcIconProvider implements ContextualTypeProvider<MdcIcon> {
  
  static final String MESSAGE_NEED_ICON_QUALIFIER = "You must provide an @Icon annotation to @Inject an MdcIcon.";
  static final String MESSAGE_TOO_MANY_QUALIFIERS = "Only one @Icon is allowed when @Inject(ing) an MdcIon.";
  
  @Inject
  Logger logger;
  
  HTMLElementProvider htmlElementProvider = new HTMLElementProvider();

  @Override
  public MdcIcon provide(Class<?>[] typeargs, Annotation[] qualifiers) {
    HTMLElement element = htmlElementProvider.provide(typeargs, qualifiers);
    
    List<Icon> icons = AnnotationUtils.findQualifiers(qualifiers, Icon.class);
    if(icons.size() < 1) {
      throw new RuntimeException(MESSAGE_NEED_ICON_QUALIFIER);
    } else if(icons.size() > 1) {
      throw new RuntimeException(MESSAGE_TOO_MANY_QUALIFIERS);
    }
    
    Icon icon = icons.get(0);
    IconFamily family = icon.family();
    
    StyleUtils.addStyleClass(element, family.getStyleClassName());
    
    if(family.equals(IconFamily.FONT_AWESOME)) {
      StyleUtils.addStyleClass(element, icon.content());
    } else {
      element.setInnerHTML(icon.content());
    }
    
    return (MdcIcon) element;
  }

}
