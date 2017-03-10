package com.selesy.errai.mdc.icon;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;

@Qualifier
@Repeatable(Icons.class)
@Retention(RUNTIME)
@Target({ FIELD, CONSTRUCTOR })
public @interface Icon {

  IconFamily family() default IconFamily.MATERIAL_ICONS;
  @Nonbinding String content();
  IconRole role() default IconRole.ON_STATE;
  String label();

}
