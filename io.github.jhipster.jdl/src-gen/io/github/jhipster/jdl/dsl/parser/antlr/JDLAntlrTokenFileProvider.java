/*
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class JDLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("io/github/jhipster/jdl/dsl/parser/antlr/internal/InternalJDL.tokens");
	}
}