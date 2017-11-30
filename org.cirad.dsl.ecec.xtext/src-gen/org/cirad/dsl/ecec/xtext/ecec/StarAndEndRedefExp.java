/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Star And End Redef Exp</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getStarAndEndRedefExp()
 * @model
 * @generated
 */
public enum StarAndEndRedefExp implements Enumerator
{
  /**
   * The '<em><b>When</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WHEN_VALUE
   * @generated
   * @ordered
   */
  WHEN(0, "when", "when");

  /**
   * The '<em><b>When</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>When</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WHEN
   * @model name="when"
   * @generated
   * @ordered
   */
  public static final int WHEN_VALUE = 0;

  /**
   * An array of all the '<em><b>Star And End Redef Exp</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final StarAndEndRedefExp[] VALUES_ARRAY =
    new StarAndEndRedefExp[]
    {
      WHEN,
    };

  /**
   * A public read-only list of all the '<em><b>Star And End Redef Exp</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<StarAndEndRedefExp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Star And End Redef Exp</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StarAndEndRedefExp get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StarAndEndRedefExp result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Star And End Redef Exp</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StarAndEndRedefExp getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StarAndEndRedefExp result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Star And End Redef Exp</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StarAndEndRedefExp get(int value)
  {
    switch (value)
    {
      case WHEN_VALUE: return WHEN;
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
  private StarAndEndRedefExp(int value, String name, String literal)
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
  
} //StarAndEndRedefExp
