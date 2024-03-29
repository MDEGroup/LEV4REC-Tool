/**
 * generated by Xtext 2.29.0
 */
package org.xtext.lev4recgrammar.first.lowcoders.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.lev4recgrammar.first.lowcoders.DataStructure;
import org.xtext.lev4recgrammar.first.lowcoders.Dataset;
import org.xtext.lev4recgrammar.first.lowcoders.DatasetManipulationLibrary;
import org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage;
import org.xtext.lev4recgrammar.first.lowcoders.PreprocessingTechnique;
import org.xtext.lev4recgrammar.first.lowcoders.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.DatasetImpl#isIsBuiltIn <em>Is Built In</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.DatasetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.DatasetImpl#getPreprocessing <em>Preprocessing</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.DatasetImpl#getDatasetManipulationLibrary <em>Dataset Manipulation Library</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.DatasetImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.DatasetImpl#getIndipendentVariables <em>Indipendent Variables</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.DatasetImpl#getDataStructure <em>Data Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetImpl extends MinimalEObjectImpl.Container implements Dataset
{
  /**
   * The default value of the '{@link #isIsBuiltIn() <em>Is Built In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsBuiltIn()
   * @generated
   * @ordered
   */
  protected static final boolean IS_BUILT_IN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsBuiltIn() <em>Is Built In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsBuiltIn()
   * @generated
   * @ordered
   */
  protected boolean isBuiltIn = IS_BUILT_IN_EDEFAULT;

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
   * The cached value of the '{@link #getPreprocessing() <em>Preprocessing</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreprocessing()
   * @generated
   * @ordered
   */
  protected EList<PreprocessingTechnique> preprocessing;

  /**
   * The cached value of the '{@link #getDatasetManipulationLibrary() <em>Dataset Manipulation Library</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatasetManipulationLibrary()
   * @generated
   * @ordered
   */
  protected EList<DatasetManipulationLibrary> datasetManipulationLibrary;

  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The cached value of the '{@link #getIndipendentVariables() <em>Indipendent Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndipendentVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> indipendentVariables;

  /**
   * The cached value of the '{@link #getDataStructure() <em>Data Structure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataStructure()
   * @generated
   * @ordered
   */
  protected DataStructure dataStructure;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatasetImpl()
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
    return LowcodersPackage.Literals.DATASET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIsBuiltIn()
  {
    return isBuiltIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsBuiltIn(boolean newIsBuiltIn)
  {
    boolean oldIsBuiltIn = isBuiltIn;
    isBuiltIn = newIsBuiltIn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.DATASET__IS_BUILT_IN, oldIsBuiltIn, isBuiltIn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.DATASET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PreprocessingTechnique> getPreprocessing()
  {
    if (preprocessing == null)
    {
      preprocessing = new EDataTypeEList<PreprocessingTechnique>(PreprocessingTechnique.class, this, LowcodersPackage.DATASET__PREPROCESSING);
    }
    return preprocessing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DatasetManipulationLibrary> getDatasetManipulationLibrary()
  {
    if (datasetManipulationLibrary == null)
    {
      datasetManipulationLibrary = new EDataTypeEList<DatasetManipulationLibrary>(DatasetManipulationLibrary.class, this, LowcodersPackage.DATASET__DATASET_MANIPULATION_LIBRARY);
    }
    return datasetManipulationLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.DATASET__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getIndipendentVariables()
  {
    if (indipendentVariables == null)
    {
      indipendentVariables = new EObjectContainmentEList<Variable>(Variable.class, this, LowcodersPackage.DATASET__INDIPENDENT_VARIABLES);
    }
    return indipendentVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataStructure getDataStructure()
  {
    return dataStructure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataStructure(DataStructure newDataStructure, NotificationChain msgs)
  {
    DataStructure oldDataStructure = dataStructure;
    dataStructure = newDataStructure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.DATASET__DATA_STRUCTURE, oldDataStructure, newDataStructure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDataStructure(DataStructure newDataStructure)
  {
    if (newDataStructure != dataStructure)
    {
      NotificationChain msgs = null;
      if (dataStructure != null)
        msgs = ((InternalEObject)dataStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.DATASET__DATA_STRUCTURE, null, msgs);
      if (newDataStructure != null)
        msgs = ((InternalEObject)newDataStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.DATASET__DATA_STRUCTURE, null, msgs);
      msgs = basicSetDataStructure(newDataStructure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.DATASET__DATA_STRUCTURE, newDataStructure, newDataStructure));
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
      case LowcodersPackage.DATASET__INDIPENDENT_VARIABLES:
        return ((InternalEList<?>)getIndipendentVariables()).basicRemove(otherEnd, msgs);
      case LowcodersPackage.DATASET__DATA_STRUCTURE:
        return basicSetDataStructure(null, msgs);
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
      case LowcodersPackage.DATASET__IS_BUILT_IN:
        return isIsBuiltIn();
      case LowcodersPackage.DATASET__NAME:
        return getName();
      case LowcodersPackage.DATASET__PREPROCESSING:
        return getPreprocessing();
      case LowcodersPackage.DATASET__DATASET_MANIPULATION_LIBRARY:
        return getDatasetManipulationLibrary();
      case LowcodersPackage.DATASET__PATH:
        return getPath();
      case LowcodersPackage.DATASET__INDIPENDENT_VARIABLES:
        return getIndipendentVariables();
      case LowcodersPackage.DATASET__DATA_STRUCTURE:
        return getDataStructure();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LowcodersPackage.DATASET__IS_BUILT_IN:
        setIsBuiltIn((Boolean)newValue);
        return;
      case LowcodersPackage.DATASET__NAME:
        setName((String)newValue);
        return;
      case LowcodersPackage.DATASET__PREPROCESSING:
        getPreprocessing().clear();
        getPreprocessing().addAll((Collection<? extends PreprocessingTechnique>)newValue);
        return;
      case LowcodersPackage.DATASET__DATASET_MANIPULATION_LIBRARY:
        getDatasetManipulationLibrary().clear();
        getDatasetManipulationLibrary().addAll((Collection<? extends DatasetManipulationLibrary>)newValue);
        return;
      case LowcodersPackage.DATASET__PATH:
        setPath((String)newValue);
        return;
      case LowcodersPackage.DATASET__INDIPENDENT_VARIABLES:
        getIndipendentVariables().clear();
        getIndipendentVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case LowcodersPackage.DATASET__DATA_STRUCTURE:
        setDataStructure((DataStructure)newValue);
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
      case LowcodersPackage.DATASET__IS_BUILT_IN:
        setIsBuiltIn(IS_BUILT_IN_EDEFAULT);
        return;
      case LowcodersPackage.DATASET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LowcodersPackage.DATASET__PREPROCESSING:
        getPreprocessing().clear();
        return;
      case LowcodersPackage.DATASET__DATASET_MANIPULATION_LIBRARY:
        getDatasetManipulationLibrary().clear();
        return;
      case LowcodersPackage.DATASET__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case LowcodersPackage.DATASET__INDIPENDENT_VARIABLES:
        getIndipendentVariables().clear();
        return;
      case LowcodersPackage.DATASET__DATA_STRUCTURE:
        setDataStructure((DataStructure)null);
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
      case LowcodersPackage.DATASET__IS_BUILT_IN:
        return isBuiltIn != IS_BUILT_IN_EDEFAULT;
      case LowcodersPackage.DATASET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LowcodersPackage.DATASET__PREPROCESSING:
        return preprocessing != null && !preprocessing.isEmpty();
      case LowcodersPackage.DATASET__DATASET_MANIPULATION_LIBRARY:
        return datasetManipulationLibrary != null && !datasetManipulationLibrary.isEmpty();
      case LowcodersPackage.DATASET__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case LowcodersPackage.DATASET__INDIPENDENT_VARIABLES:
        return indipendentVariables != null && !indipendentVariables.isEmpty();
      case LowcodersPackage.DATASET__DATA_STRUCTURE:
        return dataStructure != null;
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
    result.append(" (isBuiltIn: ");
    result.append(isBuiltIn);
    result.append(", name: ");
    result.append(name);
    result.append(", preprocessing: ");
    result.append(preprocessing);
    result.append(", datasetManipulationLibrary: ");
    result.append(datasetManipulationLibrary);
    result.append(", path: ");
    result.append(path);
    result.append(')');
    return result.toString();
  }

} //DatasetImpl
