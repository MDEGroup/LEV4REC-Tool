/**
 * generated by Xtext 2.29.0
 */
package org.xtext.lev4recgrammar.first.lowcoders.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage;
import org.xtext.lev4recgrammar.first.lowcoders.WebIService;
import org.xtext.lev4recgrammar.first.lowcoders.WebInterfaceLibrary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web IService</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.WebIServiceImpl#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebIServiceImpl extends PresentationLayerImpl implements WebIService
{
  /**
   * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibrary()
   * @generated
   * @ordered
   */
  protected static final WebInterfaceLibrary LIBRARY_EDEFAULT = WebInterfaceLibrary.FLASK;

  /**
   * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibrary()
   * @generated
   * @ordered
   */
  protected WebInterfaceLibrary library = LIBRARY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WebIServiceImpl()
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
    return LowcodersPackage.Literals.WEB_ISERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WebInterfaceLibrary getLibrary()
  {
    return library;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLibrary(WebInterfaceLibrary newLibrary)
  {
    WebInterfaceLibrary oldLibrary = library;
    library = newLibrary == null ? LIBRARY_EDEFAULT : newLibrary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.WEB_ISERVICE__LIBRARY, oldLibrary, library));
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
      case LowcodersPackage.WEB_ISERVICE__LIBRARY:
        return getLibrary();
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
      case LowcodersPackage.WEB_ISERVICE__LIBRARY:
        setLibrary((WebInterfaceLibrary)newValue);
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
      case LowcodersPackage.WEB_ISERVICE__LIBRARY:
        setLibrary(LIBRARY_EDEFAULT);
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
      case LowcodersPackage.WEB_ISERVICE__LIBRARY:
        return library != LIBRARY_EDEFAULT;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (library: ");
    result.append(library);
    result.append(')');
    return result.toString();
  }

} //WebIServiceImpl
