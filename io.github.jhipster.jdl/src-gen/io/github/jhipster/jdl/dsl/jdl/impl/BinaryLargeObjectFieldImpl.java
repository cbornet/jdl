/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.jdl.impl;

import io.github.jhipster.jdl.dsl.jdl.BinaryLargeObjectField;
import io.github.jhipster.jdl.dsl.jdl.BlobValidators;
import io.github.jhipster.jdl.dsl.jdl.JdlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Large Object Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.jhipster.jdl.dsl.jdl.impl.BinaryLargeObjectFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.dsl.jdl.impl.BinaryLargeObjectFieldImpl#getValidators <em>Validators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryLargeObjectFieldImpl extends FieldImpl implements BinaryLargeObjectField
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getValidators() <em>Validators</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidators()
   * @generated
   * @ordered
   */
  protected BlobValidators validators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinaryLargeObjectFieldImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JdlPackage.Literals.BINARY_LARGE_OBJECT_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.BINARY_LARGE_OBJECT_FIELD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlobValidators getValidators()
  {
    return validators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValidators(BlobValidators newValidators, NotificationChain msgs)
  {
    BlobValidators oldValidators = validators;
    validators = newValidators;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JdlPackage.BINARY_LARGE_OBJECT_FIELD__VALIDATORS, oldValidators, newValidators);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValidators(BlobValidators newValidators)
  {
    if (newValidators != validators)
    {
      NotificationChain msgs = null;
      if (validators != null)
        msgs = ((InternalEObject)validators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JdlPackage.BINARY_LARGE_OBJECT_FIELD__VALIDATORS, null, msgs);
      if (newValidators != null)
        msgs = ((InternalEObject)newValidators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JdlPackage.BINARY_LARGE_OBJECT_FIELD__VALIDATORS, null, msgs);
      msgs = basicSetValidators(newValidators, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.BINARY_LARGE_OBJECT_FIELD__VALIDATORS, newValidators, newValidators));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JdlPackage.BINARY_LARGE_OBJECT_FIELD__VALIDATORS:
        return basicSetValidators(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JdlPackage.BINARY_LARGE_OBJECT_FIELD__NAME:
        return getName();
      case JdlPackage.BINARY_LARGE_OBJECT_FIELD__VALIDATORS:
        return getValidators();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JdlPackage.BINARY_LARGE_OBJECT_FIELD__NAME:
        setName((String)newValue);
        return;
      case JdlPackage.BINARY_LARGE_OBJECT_FIELD__VALIDATORS:
        setValidators((BlobValidators)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JdlPackage.BINARY_LARGE_OBJECT_FIELD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JdlPackage.BINARY_LARGE_OBJECT_FIELD__VALIDATORS:
        setValidators((BlobValidators)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JdlPackage.BINARY_LARGE_OBJECT_FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JdlPackage.BINARY_LARGE_OBJECT_FIELD__VALIDATORS:
        return validators != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BinaryLargeObjectFieldImpl