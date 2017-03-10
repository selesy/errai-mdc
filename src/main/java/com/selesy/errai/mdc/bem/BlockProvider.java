/**
 * 
 */
package com.selesy.errai.mdc.bem;

import java.lang.annotation.Annotation;

import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.api.Disposer;
import org.jboss.errai.ioc.client.api.IOCProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author smoyer1
 *
 */
@IOCProvider
public class BlockProvider implements ContextualTypeProvider<IsBlock>, Disposer<IsBlock> {
    
    static final Logger LOGGER = LoggerFactory.getLogger(BlockProvider.class);

    /* (non-Javadoc)
     * @see org.jboss.errai.ioc.client.api.Disposer#dispose(java.lang.Object)
     */
    @Override
    public void dispose(IsBlock beanInstance) {
	LOGGER.trace("dispose(T)");
	// TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.jboss.errai.ioc.client.api.ContextualTypeProvider#provide(java.lang.Class[], java.lang.annotation.Annotation[])
     */
    @Override
    public IsBlock provide(Class<?>[] typeargs, Annotation[] qualifiers) {
	LOGGER.trace("provide(Class[], Annoation[]");
	// TODO Auto-generated method stub
	return null;
    }
    
}
