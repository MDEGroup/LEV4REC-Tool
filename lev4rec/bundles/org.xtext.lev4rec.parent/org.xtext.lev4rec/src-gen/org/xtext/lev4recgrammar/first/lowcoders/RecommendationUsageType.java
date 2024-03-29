/**
 * generated by Xtext 2.29.0
 */
package org.xtext.lev4recgrammar.first.lowcoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Recommendation Usage Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.lev4recgrammar.first.lowcoders.LowcodersPackage#getRecommendationUsageType()
 * @model
 * @generated
 */
public enum RecommendationUsageType implements Enumerator
{
  /**
   * The '<em><b>Transformative</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRANSFORMATIVE_VALUE
   * @generated
   * @ordered
   */
  TRANSFORMATIVE(0, "Transformative", "Transformative"),

  /**
   * The '<em><b>Visualization</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VISUALIZATION_VALUE
   * @generated
   * @ordered
   */
  VISUALIZATION(1, "Visualization", "Visualization");

  /**
   * The '<em><b>Transformative</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRANSFORMATIVE
   * @model name="Transformative"
   * @generated
   * @ordered
   */
  public static final int TRANSFORMATIVE_VALUE = 0;

  /**
   * The '<em><b>Visualization</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VISUALIZATION
   * @model name="Visualization"
   * @generated
   * @ordered
   */
  public static final int VISUALIZATION_VALUE = 1;

  /**
   * An array of all the '<em><b>Recommendation Usage Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RecommendationUsageType[] VALUES_ARRAY =
    new RecommendationUsageType[]
    {
      TRANSFORMATIVE,
      VISUALIZATION,
    };

  /**
   * A public read-only list of all the '<em><b>Recommendation Usage Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RecommendationUsageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Recommendation Usage Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RecommendationUsageType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RecommendationUsageType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Recommendation Usage Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RecommendationUsageType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RecommendationUsageType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Recommendation Usage Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RecommendationUsageType get(int value)
  {
    switch (value)
    {
      case TRANSFORMATIVE_VALUE: return TRANSFORMATIVE;
      case VISUALIZATION_VALUE: return VISUALIZATION;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private RecommendationUsageType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //RecommendationUsageType
