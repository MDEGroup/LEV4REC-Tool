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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage;
import org.xtext.lev4recgrammar.first.lowcoders.Tree;
import org.xtext.lev4recgrammar.first.lowcoders.Variable;
import org.xtext.lev4recgrammar.first.lowcoders.VariableRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.TreeImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.lowcoders.impl.TreeImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreeImpl extends DataStructureImpl implements Tree
{
  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<Variable> nodes;

  /**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
  protected VariableRelation relations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TreeImpl()
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
    return LowcodersPackage.Literals.TREE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectResolvingEList<Variable>(Variable.class, this, LowcodersPackage.TREE__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableRelation getRelations()
  {
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelations(VariableRelation newRelations, NotificationChain msgs)
  {
    VariableRelation oldRelations = relations;
    relations = newRelations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.TREE__RELATIONS, oldRelations, newRelations);
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
  public void setRelations(VariableRelation newRelations)
  {
    if (newRelations != relations)
    {
      NotificationChain msgs = null;
      if (relations != null)
        msgs = ((InternalEObject)relations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.TREE__RELATIONS, null, msgs);
      if (newRelations != null)
        msgs = ((InternalEObject)newRelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.TREE__RELATIONS, null, msgs);
      msgs = basicSetRelations(newRelations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.TREE__RELATIONS, newRelations, newRelations));
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
      case LowcodersPackage.TREE__RELATIONS:
        return basicSetRelations(null, msgs);
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
      case LowcodersPackage.TREE__NODES:
        return getNodes();
      case LowcodersPackage.TREE__RELATIONS:
        return getRelations();
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
      case LowcodersPackage.TREE__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends Variable>)newValue);
        return;
      case LowcodersPackage.TREE__RELATIONS:
        setRelations((VariableRelation)newValue);
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
      case LowcodersPackage.TREE__NODES:
        getNodes().clear();
        return;
      case LowcodersPackage.TREE__RELATIONS:
        setRelations((VariableRelation)null);
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
      case LowcodersPackage.TREE__NODES:
        return nodes != null && !nodes.isEmpty();
      case LowcodersPackage.TREE__RELATIONS:
        return relations != null;
    }
    return super.eIsSet(featureID);
  }

} //TreeImpl
