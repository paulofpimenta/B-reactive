/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Algebric Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getAlgebricEnum()
 * @model
 * @generated
 */
public enum AlgebricEnum implements Enumerator
{
  /**
   * The '<em><b>Plus</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLUS_VALUE
   * @generated
   * @ordered
   */
  PLUS(0, "plus", "+"),

  /**
   * The '<em><b>Minus</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MINUS_VALUE
   * @generated
   * @ordered
   */
  MINUS(1, "minus", "-"),

  /**
   * The '<em><b>Division</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIVISION_VALUE
   * @generated
   * @ordered
   */
  DIVISION(2, "division", "\u00f7"),

  /**
   * The '<em><b>Times</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIMES_VALUE
   * @generated
   * @ordered
   */
  TIMES(3, "times", "*"),

  /**
   * The '<em><b>Sqrt</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SQRT_VALUE
   * @generated
   * @ordered
   */
  SQRT(4, "sqrt", "\u221a"),

  /**
   * The '<em><b>Function</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FUNCTION_VALUE
   * @generated
   * @ordered
   */
  FUNCTION(5, "function", "\u0192"),

  /**
   * The '<em><b>Notequal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOTEQUAL_VALUE
   * @generated
   * @ordered
   */
  NOTEQUAL(6, "notequal", "\u2260"),

  /**
   * The '<em><b>Plusorminus</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLUSORMINUS_VALUE
   * @generated
   * @ordered
   */
  PLUSORMINUS(7, "plusorminus", "\u00b1");

  /**
   * The '<em><b>Plus</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Plus</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLUS
   * @model name="plus" literal="+"
   * @generated
   * @ordered
   */
  public static final int PLUS_VALUE = 0;

  /**
   * The '<em><b>Minus</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Minus</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MINUS
   * @model name="minus" literal="-"
   * @generated
   * @ordered
   */
  public static final int MINUS_VALUE = 1;

  /**
   * The '<em><b>Division</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Division</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIVISION
   * @model name="division" literal="\367"
   * @generated
   * @ordered
   */
  public static final int DIVISION_VALUE = 2;

  /**
   * The '<em><b>Times</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Times</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIMES
   * @model name="times" literal="*"
   * @generated
   * @ordered
   */
  public static final int TIMES_VALUE = 3;

  /**
   * The '<em><b>Sqrt</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sqrt</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SQRT
   * @model name="sqrt" literal="\u221a"
   * @generated
   * @ordered
   */
  public static final int SQRT_VALUE = 4;

  /**
   * The '<em><b>Function</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Function</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FUNCTION
   * @model name="function" literal="\u0192"
   * @generated
   * @ordered
   */
  public static final int FUNCTION_VALUE = 5;

  /**
   * The '<em><b>Notequal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Notequal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOTEQUAL
   * @model name="notequal" literal="\u2260"
   * @generated
   * @ordered
   */
  public static final int NOTEQUAL_VALUE = 6;

  /**
   * The '<em><b>Plusorminus</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Plusorminus</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLUSORMINUS
   * @model name="plusorminus" literal="\261"
   * @generated
   * @ordered
   */
  public static final int PLUSORMINUS_VALUE = 7;

  /**
   * An array of all the '<em><b>Algebric Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AlgebricEnum[] VALUES_ARRAY =
    new AlgebricEnum[]
    {
      PLUS,
      MINUS,
      DIVISION,
      TIMES,
      SQRT,
      FUNCTION,
      NOTEQUAL,
      PLUSORMINUS,
    };

  /**
   * A public read-only list of all the '<em><b>Algebric Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AlgebricEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Algebric Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AlgebricEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AlgebricEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Algebric Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AlgebricEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AlgebricEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Algebric Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AlgebricEnum get(int value)
  {
    switch (value)
    {
      case PLUS_VALUE: return PLUS;
      case MINUS_VALUE: return MINUS;
      case DIVISION_VALUE: return DIVISION;
      case TIMES_VALUE: return TIMES;
      case SQRT_VALUE: return SQRT;
      case FUNCTION_VALUE: return FUNCTION;
      case NOTEQUAL_VALUE: return NOTEQUAL;
      case PLUSORMINUS_VALUE: return PLUSORMINUS;
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
  private AlgebricEnum(int value, String name, String literal)
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
  
} //AlgebricEnum
