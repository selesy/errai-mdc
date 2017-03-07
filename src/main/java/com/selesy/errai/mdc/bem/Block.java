package com.selesy.errai.mdc.bem;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

@Retention(RUNTIME)
@Qualifier
public @interface Block {

  String element();
  String style();

}
