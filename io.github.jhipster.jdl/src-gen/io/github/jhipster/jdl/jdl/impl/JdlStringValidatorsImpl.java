/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.jdl.impl;

import io.github.jhipster.jdl.jdl.JdlMaxLengthValidator;
import io.github.jhipster.jdl.jdl.JdlMinLengthValidator;
import io.github.jhipster.jdl.jdl.JdlPackage;
import io.github.jhipster.jdl.jdl.JdlPatternValidator;
import io.github.jhipster.jdl.jdl.JdlStringValidators;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Validators</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.jhipster.jdl.jdl.impl.JdlStringValidatorsImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.jdl.impl.JdlStringValidatorsImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.jdl.impl.JdlStringValidatorsImpl#getMaxlength <em>Maxlength</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.jdl.impl.JdlStringValidatorsImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JdlStringValidatorsImpl extends MinimalEObjectImpl.Container implements JdlStringValidators
{
  /**
   * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected static final boolean REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected boolean required = REQUIRED_EDEFAULT;

  /**
   * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinLength()
   * @generated
   * @ordered
   */
  protected JdlMinLengthValidator minLength;

  /**
   * The cached value of the '{@link #getMaxlength() <em>Maxlength</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxlength()
   * @generated
   * @ordered
   */
  protected JdlMaxLengthValidator maxlength;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected JdlPatternValidator pattern;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JdlStringValidatorsImpl()
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
    return JdlPackage.Literals.JDL_STRING_VALIDATORS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRequired()
  {
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequired(boolean newRequired)
  {
    boolean oldRequired = required;
    required = newRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.JDL_STRING_VALIDATORS__REQUIRED, oldRequired, required));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JdlMinLengthValidator getMinLength()
  {
    return minLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMinLength(JdlMinLengthValidator newMinLength, NotificationChain msgs)
  {
    JdlMinLengthValidator oldMinLength = minLength;
    minLength = newMinLength;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JdlPackage.JDL_STRING_VALIDATORS__MIN_LENGTH, oldMinLength, newMinLength);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinLength(JdlMinLengthValidator newMinLength)
  {
    if (newMinLength != minLength)
    {
      NotificationChain msgs = null;
      if (minLength != null)
        msgs = ((InternalEObject)minLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JdlPackage.JDL_STRING_VALIDATORS__MIN_LENGTH, null, msgs);
      if (newMinLength != null)
        msgs = ((InternalEObject)newMinLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JdlPackage.JDL_STRING_VALIDATORS__MIN_LENGTH, null, msgs);
      msgs = basicSetMinLength(newMinLength, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.JDL_STRING_VALIDATORS__MIN_LENGTH, newMinLength, newMinLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JdlMaxLengthValidator getMaxlength()
  {
    return maxlength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaxlength(JdlMaxLengthValidator newMaxlength, NotificationChain msgs)
  {
    JdlMaxLengthValidator oldMaxlength = maxlength;
    maxlength = newMaxlength;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JdlPackage.JDL_STRING_VALIDATORS__MAXLENGTH, oldMaxlength, newMaxlength);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxlength(JdlMaxLengthValidator newMaxlength)
  {
    if (newMaxlength != maxlength)
    {
      NotificationChain msgs = null;
      if (maxlength != null)
        msgs = ((InternalEObject)maxlength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JdlPackage.JDL_STRING_VALIDATORS__MAXLENGTH, null, msgs);
      if (newMaxlength != null)
        msgs = ((InternalEObject)newMaxlength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JdlPackage.JDL_STRING_VALIDATORS__MAXLENGTH, null, msgs);
      msgs = basicSetMaxlength(newMaxlength, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.JDL_STRING_VALIDATORS__MAXLENGTH, newMaxlength, newMaxlength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JdlPatternValidator getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPattern(JdlPatternValidator newPattern, NotificationChain msgs)
  {
    JdlPatternValidator oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JdlPackage.JDL_STRING_VALIDATORS__PATTERN, oldPattern, newPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(JdlPatternValidator newPattern)
  {
    if (newPattern != pattern)
    {
      NotificationChain msgs = null;
      if (pattern != null)
        msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JdlPackage.JDL_STRING_VALIDATORS__PATTERN, null, msgs);
      if (newPattern != null)
        msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JdlPackage.JDL_STRING_VALIDATORS__PATTERN, null, msgs);
      msgs = basicSetPattern(newPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.JDL_STRING_VALIDATORS__PATTERN, newPattern, newPattern));
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
      case JdlPackage.JDL_STRING_VALIDATORS__MIN_LENGTH:
        return basicSetMinLength(null, msgs);
      case JdlPackage.JDL_STRING_VALIDATORS__MAXLENGTH:
        return basicSetMaxlength(null, msgs);
      case JdlPackage.JDL_STRING_VALIDATORS__PATTERN:
        return basicSetPattern(null, msgs);
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
      case JdlPackage.JDL_STRING_VALIDATORS__REQUIRED:
        return isRequired();
      case JdlPackage.JDL_STRING_VALIDATORS__MIN_LENGTH:
        return getMinLength();
      case JdlPackage.JDL_STRING_VALIDATORS__MAXLENGTH:
        return getMaxlength();
      case JdlPackage.JDL_STRING_VALIDATORS__PATTERN:
        return getPattern();
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
      case JdlPackage.JDL_STRING_VALIDATORS__REQUIRED:
        setRequired((Boolean)newValue);
        return;
      case JdlPackage.JDL_STRING_VALIDATORS__MIN_LENGTH:
        setMinLength((JdlMinLengthValidator)newValue);
        return;
      case JdlPackage.JDL_STRING_VALIDATORS__MAXLENGTH:
        setMaxlength((JdlMaxLengthValidator)newValue);
        return;
      case JdlPackage.JDL_STRING_VALIDATORS__PATTERN:
        setPattern((JdlPatternValidator)newValue);
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
      case JdlPackage.JDL_STRING_VALIDATORS__REQUIRED:
        setRequired(REQUIRED_EDEFAULT);
        return;
      case JdlPackage.JDL_STRING_VALIDATORS__MIN_LENGTH:
        setMinLength((JdlMinLengthValidator)null);
        return;
      case JdlPackage.JDL_STRING_VALIDATORS__MAXLENGTH:
        setMaxlength((JdlMaxLengthValidator)null);
        return;
      case JdlPackage.JDL_STRING_VALIDATORS__PATTERN:
        setPattern((JdlPatternValidator)null);
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
      case JdlPackage.JDL_STRING_VALIDATORS__REQUIRED:
        return required != REQUIRED_EDEFAULT;
      case JdlPackage.JDL_STRING_VALIDATORS__MIN_LENGTH:
        return minLength != null;
      case JdlPackage.JDL_STRING_VALIDATORS__MAXLENGTH:
        return maxlength != null;
      case JdlPackage.JDL_STRING_VALIDATORS__PATTERN:
        return pattern != null;
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
    result.append(" (required: ");
    result.append(required);
    result.append(')');
    return result.toString();
  }

} //JdlStringValidatorsImpl
