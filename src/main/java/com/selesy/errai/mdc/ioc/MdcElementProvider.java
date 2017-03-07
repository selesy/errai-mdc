/**
 * 
 */
package com.selesy.errai.mdc.ioc;

import java.lang.annotation.Annotation;
import java.util.stream.Stream;

import javax.inject.Inject;

import org.jboss.errai.common.client.dom.Button;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.dom.Window;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.api.IOCProvider;
import org.slf4j.Logger;

import com.selesy.errai.mdc.base.MdcElement;

/**
 * @author smoyer1
 *
 */
@IOCProvider
public class MdcElementProvider implements ContextualTypeProvider<MdcElement> { // <?
																				// extends
																				// MdcComponent,
																				// ?
																				// extends
																				// MdcFoundation>>
																				// {

	@Inject
	Logger logger;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jboss.errai.ioc.client.api.ContextualTypeProvider#provide(java.lang.
	 * Class[], java.lang.annotation.Annotation[])
	 */
	@SuppressWarnings("rawtypes")
	@Override
	// public MdcElement<? extends MdcComponent, ? extends MdcFoundation>
	// provide(Class<?>[] typeargs,
	// Annotation[] qualifiers) {
	public MdcElement provide(Class<?>[] typeArgs, Annotation[] qualifiers) {
		logger.trace("provide(Class[], Annotation[])");

		if (logger.isDebugEnabled()) {
			Stream.of(typeArgs).forEach(c -> logger.debug(c.getSimpleName()));
			Stream.of(qualifiers).forEach(c -> logger.debug(c.annotationType().getSimpleName()));
		}

		// TODO Auto-generated method stub
		Span text = (Span) Window.getDocument().createElement("span");
		text.setInnerHTML("Press me harder!");
		Button button = (Button) Window.getDocument().createElement("button");
		button.appendChild(text);
		return (MdcElement) button;
	}
	
}
