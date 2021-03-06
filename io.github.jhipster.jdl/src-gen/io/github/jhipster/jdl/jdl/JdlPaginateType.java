/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.jdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paginate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.jhipster.jdl.jdl.JdlPaginateType#isPagination <em>Pagination</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.jdl.JdlPaginateType#isInfiniteScroll <em>Infinite Scroll</em>}</li>
 * </ul>
 *
 * @see io.github.jhipster.jdl.jdl.JdlPackage#getJdlPaginateType()
 * @model
 * @generated
 */
public interface JdlPaginateType extends EObject
{
  /**
   * Returns the value of the '<em><b>Pagination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pagination</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pagination</em>' attribute.
   * @see #setPagination(boolean)
   * @see io.github.jhipster.jdl.jdl.JdlPackage#getJdlPaginateType_Pagination()
   * @model
   * @generated
   */
  boolean isPagination();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.jdl.JdlPaginateType#isPagination <em>Pagination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pagination</em>' attribute.
   * @see #isPagination()
   * @generated
   */
  void setPagination(boolean value);

  /**
   * Returns the value of the '<em><b>Infinite Scroll</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infinite Scroll</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infinite Scroll</em>' attribute.
   * @see #setInfiniteScroll(boolean)
   * @see io.github.jhipster.jdl.jdl.JdlPackage#getJdlPaginateType_InfiniteScroll()
   * @model
   * @generated
   */
  boolean isInfiniteScroll();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.jdl.JdlPaginateType#isInfiniteScroll <em>Infinite Scroll</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Infinite Scroll</em>' attribute.
   * @see #isInfiniteScroll()
   * @generated
   */
  void setInfiniteScroll(boolean value);

} // JdlPaginateType
