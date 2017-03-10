package com.selesy.errai.mdc.icon;

public enum IconFamily {

  FONT_AWESOME("fa"),
  MATERIAL_ICONS("material-icons"),
  SVG(""),
  ;
  
  String styleClassName;
  
  private IconFamily(String styleClassName) {
    this.styleClassName = styleClassName;
  }
  
  public String getStyleClassName() {
    return styleClassName;
  }

}
