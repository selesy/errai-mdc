/**
 * 
 */
package com.selesy.errai.mdc.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.jboss.errai.common.client.dom.HTMLElement;

/**
 * @author smoyer1
 *
 */
public class StyleUtils {

  static final String ATTRIBUTE_NAME = "class";

  private StyleUtils() {
    // Utility class
  }

  public static void addStyleClass(HTMLElement element, String styleClassName) {
    Set<String> styles = getStyleClasses(element);
    styles.add(styleClassName);
    setStyleClasses(element, styles);
  }

  public static void addStyleClasses(HTMLElement element, Set<String> styleClassNames) {
    Set<String> styles = getStyleClasses(element);
    styles.addAll(styleClassNames);
    setStyleClasses(element, styles);
  }

  public static void removeStyleClass(HTMLElement element, String styleClassName) {
    Set<String> styles = getStyleClasses(element);
    styles.remove(styleClassName);
    setStyleClasses(element, styles);
  }

  public static void removeStyleClasses(HTMLElement element, Set<String> styleClassNames) {
    Set<String> styles = getStyleClasses(element);
    styles.removeAll(styleClassNames);
    setStyleClasses(element, styles);
  }

  static Set<String> getStyleClasses(HTMLElement element) {
    String classAttribute = element.getAttribute(ATTRIBUTE_NAME);

    Set<String> styles = new HashSet<>();
    if (classAttribute != null && !classAttribute.isEmpty()) {
      styles = new HashSet<>(Arrays.asList(classAttribute.split(" ")));
    }

    return styles;
  }

  static void setStyleClasses(HTMLElement element, Set<String> styleClasses) {
    element.setAttribute(ATTRIBUTE_NAME, String.join(" ", styleClasses));
  }

}
