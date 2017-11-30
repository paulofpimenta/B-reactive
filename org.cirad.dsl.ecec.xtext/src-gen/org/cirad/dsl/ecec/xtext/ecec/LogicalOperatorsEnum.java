/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Logical Operators Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getLogicalOperatorsEnum()
 * @model
 * @generated
 */
public enum LogicalOperatorsEnum implements Enumerator
{
  /**
   * The '<em><b>Biggerthan</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIGGERTHAN_VALUE
   * @generated
   * @ordered
   */
  BIGGERTHAN(0, "biggerthan", "bigger than"),

  /**
   * The '<em><b>Lessthan</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESSTHAN_VALUE
   * @generated
   * @ordered
   */
  LESSTHAN(1, "lessthan", "less than"),

  /**
   * The '<em><b>Equal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUAL_VALUE
   * @generated
   * @ordered
   */
  EQUAL(2, "equal", "equal"),

  /**
   * The '<em><b>Biggerorequalthan</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIGGEROREQUALTHAN_VALUE
   * @generated
   * @ordered
   */
  BIGGEROREQUALTHAN(3, "biggerorequalthan", "bigger or equal than"),

  /**
   * The '<em><b>Lessorequalthan</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESSOREQUALTHAN_VALUE
   * @generated
   * @ordered
   */
  LESSOREQUALTHAN(4, "lessorequalthan", "less or equal than");

  /**
   * The '<em><b>Biggerthan</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Biggerthan</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BIGGERTHAN
   * @model name="biggerthan" literal="bigger than"
   * @generated
   * @ordered
   */
  public static final int BIGGERTHAN_VALUE = 0;

  /**
   * The '<em><b>Lessthan</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lessthan</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LESSTHAN
   * @model name="lessthan" literal="less than"
   * @generated
   * @ordered
   */
  public static final int LESSTHAN_VALUE = 1;

  /**
   * The '<em><b>Equal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EQUAL
   * @model name="equal"
   * @generated
   * @ordered
   */
  public static final int EQUAL_VALUE = 2;

  /**
   * The '<em><b>Biggerorequalthan</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Biggerorequalthan</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BIGGEROREQUALTHAN
   * @model name="biggerorequalthan" literal="bigger or equal than"
   * @generated
   * @ordered
   */
  public static final int BIGGEROREQUALTHAN_VALUE = 3;

  /**
   * The '<em><b>Lessorequalthan</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lessorequalthan</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LESSOREQUALTHAN
   * @model name="lessorequalthan" literal="less or equal than"
   * @generated
   * @ordered
   */
  public static final int LESSOREQUALTHAN_VALUE = 4;

  /**
   * An array of all the '<em><b>Logical Operators Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LogicalOperatorsEnum[] VALUES_ARRAY =
    new LogicalOperatorsEnum[]
    {
      BIGGERTHAN,
      LESSTHAN,
      EQUAL,
      BIGGEROREQUALTHAN,
      LESSOREQUALTHAN,
    };

  /**
   * A public read-only list of all the '<em><b>Logical Operators Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LogicalOperatorsEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Logical Operators Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LogicalOperatorsEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LogicalOperatorsEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Logical Operators Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LogicalOperatorsEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LogicalOperatorsEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Logical Operators Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LogicalOperatorsEnum get(int value)
  {
    switch (value)
    {
      case BIGGERTHAN_VALUE: return BIGGERTHAN;
      case LESSTHAN_VALUE: return LESSTHAN;
      case EQUAL_VALUE: return EQUAL;
      case BIGGEROREQUALTHAN_VALUE: return BIGGEROREQUALTHAN;
      case LESSOREQUALTHAN_VALUE: return LESSOREQUALTHAN;
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
  private LogicalOperatorsEnum(int value, String name, String literal)
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
  
} //LogicalOperatorsEnum
