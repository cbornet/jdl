/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.jdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wildcard Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.jhipster.jdl.jdl.JdlWildcardPredicate#isWildcard <em>Wildcard</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.jdl.JdlWildcardPredicate#isAll <em>All</em>}</li>
 * </ul>
 *
 * @see io.github.jhipster.jdl.jdl.JdlPackage#getJdlWildcardPredicate()
 * @model
 * @generated
 */
public interface JdlWildcardPredicate extends EObject
{
  /**
   * Returns the value of the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wildcard</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wildcard</em>' attribute.
   * @see #setWildcard(boolean)
   * @see io.github.jhipster.jdl.jdl.JdlPackage#getJdlWildcardPredicate_Wildcard()
   * @model
   * @generated
   */
  boolean isWildcard();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.jdl.JdlWildcardPredicate#isWildcard <em>Wildcard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wildcard</em>' attribute.
   * @see #isWildcard()
   * @generated
   */
  void setWildcard(boolean value);

  /**
   * Returns the value of the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All</em>' attribute.
   * @see #setAll(boolean)
   * @see io.github.jhipster.jdl.jdl.JdlPackage#getJdlWildcardPredicate_All()
   * @model
   * @generated
   */
  boolean isAll();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.jdl.JdlWildcardPredicate#isAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #isAll()
   * @generated
   */
  void setAll(boolean value);

} // JdlWildcardPredicate
