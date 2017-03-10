/**
 * 
 */
package com.selesy.errai.mdc.bem;

/**
 * @author smoyer1
 *
 */
public @interface Bem {
	
	String block();
	String element() default "";
	String[] modifiers() default {};

}
