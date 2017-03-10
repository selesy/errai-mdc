package com.selesy.errai.mdc.utils;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnnotationUtils {

  static final Logger LOGGER = LoggerFactory.getLogger(AnnotationUtils.class);

  private AnnotationUtils() {
    // Utility class
  }

  @SuppressWarnings("unchecked")
  public static <T> List<T> findQualifiers(Annotation[] qualifiers, Class<T> selectedQualifier) {

    LOGGER.debug("Selected qualifier type: {}", selectedQualifier.getSimpleName());

    return Stream.of(qualifiers)
        .filter(q -> q.annotationType().equals(selectedQualifier))
        .map(q -> (T) q)
        .collect(Collectors.toList());
  }

}
