/*
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.ui;

import com.google.inject.Injector;
import io.github.jhipster.jdl.ui.internal.JdlActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class JDLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return JdlActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return JdlActivator.getInstance().getInjector(JdlActivator.IO_GITHUB_JHIPSTER_JDL_JDL);
	}
	
}
