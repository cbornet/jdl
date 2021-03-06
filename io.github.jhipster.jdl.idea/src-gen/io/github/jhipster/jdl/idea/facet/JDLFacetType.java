/*
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.idea.facet;

import com.intellij.facet.Facet;
import com.intellij.facet.FacetTypeId;
import io.github.jhipster.jdl.idea.lang.JDLLanguage;
import org.eclipse.xtext.idea.facet.AbstractFacetType;

public class JDLFacetType extends AbstractFacetType<JDLFacetConfiguration> {

	public static final FacetTypeId<Facet<JDLFacetConfiguration>> TYPEID = new FacetTypeId<Facet<JDLFacetConfiguration>>("io.github.jhipster.jdl.JDL");

	public JDLFacetType() {
		super(TYPEID, "io.github.jhipster.jdl.JDL", "JDL");
		JDLLanguage.INSTANCE.injectMembers(this);
	}
}
