/*
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.tests

import com.google.inject.Inject
import io.github.jhipster.jdl.dsl.jdl.DomainModel
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(JDLInjectorProvider)
class JDLParsingTest{

	@Inject
	ParseHelper<DomainModel> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}