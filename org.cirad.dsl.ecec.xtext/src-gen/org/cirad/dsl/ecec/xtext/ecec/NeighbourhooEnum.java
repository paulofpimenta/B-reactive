/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Neighbourhoo Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getNeighbourhooEnum()
 * @model
 * @generated
 */
public enum NeighbourhooEnum implements Enumerator
{
  /**
   * The '<em><b>Neighcell</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEIGHCELL_VALUE
   * @generated
   * @ordered
   */
  NEIGHCELL(0, "neighcell", "neighbor cell where"),

  /**
   * The '<em><b>Currentcell</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CURRENTCELL_VALUE
   * @generated
   * @ordered
   */
  CURRENTCELL(1, "currentcell", "current cell where"),

  /**
   * The '<em><b>Search</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SEARCH_VALUE
   * @generated
   * @ordered
   */
  SEARCH(2, "search", "search neighborhood where");

  /**
   * The '<em><b>Neighcell</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Neighcell</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEIGHCELL
   * @model name="neighcell" literal="neighbor cell where"
   * @generated
   * @ordered
   */
  public static final int NEIGHCELL_VALUE = 0;

  /**
   * The '<em><b>Currentcell</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Currentcell</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CURRENTCELL
   * @model name="currentcell" literal="current cell where"
   * @generated
   * @ordered
   */
  public static final int CURRENTCELL_VALUE = 1;

  /**
   * The '<em><b>Search</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Search</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SEARCH
   * @model name="search" literal="search neighborhood where"
   * @generated
   * @ordered
   */
  public static final int SEARCH_VALUE = 2;

  /**
   * An array of all the '<em><b>Neighbourhoo Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final NeighbourhooEnum[] VALUES_ARRAY =
    new NeighbourhooEnum[]
    {
      NEIGHCELL,
      CURRENTCELL,
      SEARCH,
    };

  /**
   * A public read-only list of all the '<em><b>Neighbourhoo Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<NeighbourhooEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Neighbourhoo Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NeighbourhooEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NeighbourhooEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Neighbourhoo Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NeighbourhooEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NeighbourhooEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Neighbourhoo Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NeighbourhooEnum get(int value)
  {
    switch (value)
    {
      case NEIGHCELL_VALUE: return NEIGHCELL;
      case CURRENTCELL_VALUE: return CURRENTCELL;
      case SEARCH_VALUE: return SEARCH;
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
  private NeighbourhooEnum(int value, String name, String literal)
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
  public int getValue()
  {
    return value;
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
  
} //NeighbourhooEnum
