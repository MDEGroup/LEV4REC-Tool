/**
 * generated by Xtext 2.23.0
 */
package org.xtext.lev4recgrammar.first.rsDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.lev4recgrammar.first.rsDsl.FilteringRS;
import org.xtext.lev4recgrammar.first.rsDsl.FilteringRSAlgorithm;
import org.xtext.lev4recgrammar.first.rsDsl.RsDslPackage;
import org.xtext.lev4recgrammar.first.rsDsl.SimilarityFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filtering RS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.FilteringRSImpl#getFilteringRSAlgorithm <em>Filtering RS Algorithm</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.FilteringRSImpl#getSimilarityCalculator <em>Similarity Calculator</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.FilteringRSImpl#getCutoff <em>Cutoff</em>}</li>
 *   <li>{@link org.xtext.lev4recgrammar.first.rsDsl.impl.FilteringRSImpl#getNeighborhood <em>Neighborhood</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilteringRSImpl extends RecommendationSystemImpl implements FilteringRS
{
  /**
   * The default value of the '{@link #getFilteringRSAlgorithm() <em>Filtering RS Algorithm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilteringRSAlgorithm()
   * @generated
   * @ordered
   */
  protected static final FilteringRSAlgorithm FILTERING_RS_ALGORITHM_EDEFAULT = FilteringRSAlgorithm.CONTENT_BASED;

  /**
   * The cached value of the '{@link #getFilteringRSAlgorithm() <em>Filtering RS Algorithm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilteringRSAlgorithm()
   * @generated
   * @ordered
   */
  protected FilteringRSAlgorithm filteringRSAlgorithm = FILTERING_RS_ALGORITHM_EDEFAULT;

  /**
   * The default value of the '{@link #getSimilarityCalculator() <em>Similarity Calculator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimilarityCalculator()
   * @generated
   * @ordered
   */
  protected static final SimilarityFunction SIMILARITY_CALCULATOR_EDEFAULT = SimilarityFunction.COSINE_SIMILARITY;

  /**
   * The cached value of the '{@link #getSimilarityCalculator() <em>Similarity Calculator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimilarityCalculator()
   * @generated
   * @ordered
   */
  protected SimilarityFunction similarityCalculator = SIMILARITY_CALCULATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getCutoff() <em>Cutoff</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCutoff()
   * @generated
   * @ordered
   */
  protected static final int CUTOFF_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCutoff() <em>Cutoff</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCutoff()
   * @generated
   * @ordered
   */
  protected int cutoff = CUTOFF_EDEFAULT;

  /**
   * The default value of the '{@link #getNeighborhood() <em>Neighborhood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeighborhood()
   * @generated
   * @ordered
   */
  protected static final int NEIGHBORHOOD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNeighborhood() <em>Neighborhood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeighborhood()
   * @generated
   * @ordered
   */
  protected int neighborhood = NEIGHBORHOOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilteringRSImpl()
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
    return RsDslPackage.Literals.FILTERING_RS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilteringRSAlgorithm getFilteringRSAlgorithm()
  {
    return filteringRSAlgorithm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFilteringRSAlgorithm(FilteringRSAlgorithm newFilteringRSAlgorithm)
  {
    FilteringRSAlgorithm oldFilteringRSAlgorithm = filteringRSAlgorithm;
    filteringRSAlgorithm = newFilteringRSAlgorithm == null ? FILTERING_RS_ALGORITHM_EDEFAULT : newFilteringRSAlgorithm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RsDslPackage.FILTERING_RS__FILTERING_RS_ALGORITHM, oldFilteringRSAlgorithm, filteringRSAlgorithm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimilarityFunction getSimilarityCalculator()
  {
    return similarityCalculator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSimilarityCalculator(SimilarityFunction newSimilarityCalculator)
  {
    SimilarityFunction oldSimilarityCalculator = similarityCalculator;
    similarityCalculator = newSimilarityCalculator == null ? SIMILARITY_CALCULATOR_EDEFAULT : newSimilarityCalculator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RsDslPackage.FILTERING_RS__SIMILARITY_CALCULATOR, oldSimilarityCalculator, similarityCalculator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getCutoff()
  {
    return cutoff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCutoff(int newCutoff)
  {
    int oldCutoff = cutoff;
    cutoff = newCutoff;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RsDslPackage.FILTERING_RS__CUTOFF, oldCutoff, cutoff));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNeighborhood()
  {
    return neighborhood;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNeighborhood(int newNeighborhood)
  {
    int oldNeighborhood = neighborhood;
    neighborhood = newNeighborhood;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RsDslPackage.FILTERING_RS__NEIGHBORHOOD, oldNeighborhood, neighborhood));
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
      case RsDslPackage.FILTERING_RS__FILTERING_RS_ALGORITHM:
        return getFilteringRSAlgorithm();
      case RsDslPackage.FILTERING_RS__SIMILARITY_CALCULATOR:
        return getSimilarityCalculator();
      case RsDslPackage.FILTERING_RS__CUTOFF:
        return getCutoff();
      case RsDslPackage.FILTERING_RS__NEIGHBORHOOD:
        return getNeighborhood();
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
      case RsDslPackage.FILTERING_RS__FILTERING_RS_ALGORITHM:
        setFilteringRSAlgorithm((FilteringRSAlgorithm)newValue);
        return;
      case RsDslPackage.FILTERING_RS__SIMILARITY_CALCULATOR:
        setSimilarityCalculator((SimilarityFunction)newValue);
        return;
      case RsDslPackage.FILTERING_RS__CUTOFF:
        setCutoff((Integer)newValue);
        return;
      case RsDslPackage.FILTERING_RS__NEIGHBORHOOD:
        setNeighborhood((Integer)newValue);
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
      case RsDslPackage.FILTERING_RS__FILTERING_RS_ALGORITHM:
        setFilteringRSAlgorithm(FILTERING_RS_ALGORITHM_EDEFAULT);
        return;
      case RsDslPackage.FILTERING_RS__SIMILARITY_CALCULATOR:
        setSimilarityCalculator(SIMILARITY_CALCULATOR_EDEFAULT);
        return;
      case RsDslPackage.FILTERING_RS__CUTOFF:
        setCutoff(CUTOFF_EDEFAULT);
        return;
      case RsDslPackage.FILTERING_RS__NEIGHBORHOOD:
        setNeighborhood(NEIGHBORHOOD_EDEFAULT);
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
      case RsDslPackage.FILTERING_RS__FILTERING_RS_ALGORITHM:
        return filteringRSAlgorithm != FILTERING_RS_ALGORITHM_EDEFAULT;
      case RsDslPackage.FILTERING_RS__SIMILARITY_CALCULATOR:
        return similarityCalculator != SIMILARITY_CALCULATOR_EDEFAULT;
      case RsDslPackage.FILTERING_RS__CUTOFF:
        return cutoff != CUTOFF_EDEFAULT;
      case RsDslPackage.FILTERING_RS__NEIGHBORHOOD:
        return neighborhood != NEIGHBORHOOD_EDEFAULT;
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
    result.append(" (filteringRSAlgorithm: ");
    result.append(filteringRSAlgorithm);
    result.append(", similarityCalculator: ");
    result.append(similarityCalculator);
    result.append(", cutoff: ");
    result.append(cutoff);
    result.append(", neighborhood: ");
    result.append(neighborhood);
    result.append(')');
    return result.toString();
  }

} //FilteringRSImpl
