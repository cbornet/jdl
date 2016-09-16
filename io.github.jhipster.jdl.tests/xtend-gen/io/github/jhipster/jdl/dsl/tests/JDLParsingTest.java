/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.tests;

import com.google.inject.Inject;
import io.github.jhipster.jdl.dsl.jdl.DomainModel;
import io.github.jhipster.jdl.dsl.tests.JDLInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(JDLInjectorProvider.class)
@SuppressWarnings("all")
public class JDLParsingTest {
  @Inject
  private ParseHelper<DomainModel> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final DomainModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}