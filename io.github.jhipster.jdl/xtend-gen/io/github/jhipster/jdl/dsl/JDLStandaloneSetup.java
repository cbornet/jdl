/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl;

import io.github.jhipster.jdl.dsl.JDLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class JDLStandaloneSetup extends JDLStandaloneSetupGenerated {
  public static void doSetup() {
    JDLStandaloneSetup _jDLStandaloneSetup = new JDLStandaloneSetup();
    _jDLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}