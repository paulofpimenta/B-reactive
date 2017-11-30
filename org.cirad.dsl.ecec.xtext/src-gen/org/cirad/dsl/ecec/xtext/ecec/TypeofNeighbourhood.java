/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Typeof Neighbourhood</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getTypeofNeighbourhood()
 * @model
 * @generated
 */
public enum TypeofNeighbourhood implements Enumerator
{
  /**
   * The '<em><b>Vonneuman</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VONNEUMAN_VALUE
   * @generated
   * @ordered
   */
  VONNEUMAN(0, "vonneuman", "Von Nuenman"),

  /**
   * The '<em><b>Moore</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOORE_VALUE
   * @generated
   * @ordered
   */
  MOORE(1, "moore", "Moore");

  /**
   * The '<em><b>Vonneuman</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Vonneuman</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VONNEUMAN
   * @model name="vonneuman" literal="Von Nuenman"
   * @generated
   * @ordered
   */
  public static final int VONNEUMAN_VALUE = 0;

  /**
   * The '<em><b>Moore</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Moore</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MOORE
   * @model name="moore" literal="Moore"
   * @generated
   * @ordered
   */
  public static final int MOORE_VALUE = 1;

  /**
   * An array of all the '<em><b>Typeof Neighbourhood</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TypeofNeighbourhood[] VALUES_ARRAY =
    new TypeofNeighbourhood[]
    {
      VONNEUMAN,
      MOORE,
    };

  /**
   * A public read-only list of all the '<em><b>Typeof Neighbourhood</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TypeofNeighbourhood> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Typeof Neighbourhood</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypeofNeighbourhood get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TypeofNeighbourhood result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Typeof Neighbourhood</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypeofNeighbourhood getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TypeofNeighbourhood result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Typeof Neighbourhood</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypeofNeighbourhood get(int value)
  {
    switch (value)
    {
      case VONNEUMAN_VALUE: return VONNEUMAN;
      case MOORE_VALUE: return MOORE;
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
  private TypeofNeighbourhood(int value, String name, String literal)
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
  
} //TypeofNeighbourhood
