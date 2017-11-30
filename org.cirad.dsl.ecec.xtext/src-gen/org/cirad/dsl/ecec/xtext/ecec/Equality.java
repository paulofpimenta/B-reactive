/**
 */
package org.cirad.dsl.ecec.xtext.ecec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Equality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getEquality()
 * @model
 * @generated
 */
public enum Equality implements Enumerator
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
  EQUAL(2, "equal", "equal to"),

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
  LESSOREQUALTHAN(4, "lessorequalthan", "less or equal than"),

  /**
   * The '<em><b>Notequalto</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOTEQUALTO_VALUE
   * @generated
   * @ordered
   */
  NOTEQUALTO(5, "notequalto", "not equal to"),

  /**
   * The '<em><b>Smallest</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SMALLEST_VALUE
   * @generated
   * @ordered
   */
  SMALLEST(6, "smallest", "is the smallest"),

  /**
   * The '<em><b>Highest</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HIGHEST_VALUE
   * @generated
   * @ordered
   */
  HIGHEST(7, "highest", "is the highest");

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
   * @model name="equal" literal="equal to"
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
   * The '<em><b>Notequalto</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Notequalto</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOTEQUALTO
   * @model name="notequalto" literal="not equal to"
   * @generated
   * @ordered
   */
  public static final int NOTEQUALTO_VALUE = 5;

  /**
   * The '<em><b>Smallest</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Smallest</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SMALLEST
   * @model name="smallest" literal="is the smallest"
   * @generated
   * @ordered
   */
  public static final int SMALLEST_VALUE = 6;

  /**
   * The '<em><b>Highest</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Highest</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HIGHEST
   * @model name="highest" literal="is the highest"
   * @generated
   * @ordered
   */
  public static final int HIGHEST_VALUE = 7;

  /**
   * An array of all the '<em><b>Equality</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Equality[] VALUES_ARRAY =
    new Equality[]
    {
      BIGGERTHAN,
      LESSTHAN,
      EQUAL,
      BIGGEROREQUALTHAN,
      LESSOREQUALTHAN,
      NOTEQUALTO,
      SMALLEST,
      HIGHEST,
    };

  /**
   * A public read-only list of all the '<em><b>Equality</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Equality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Equality</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Equality get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Equality result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Equality</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Equality getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Equality result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Equality</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Equality get(int value)
  {
    switch (value)
    {
      case BIGGERTHAN_VALUE: return BIGGERTHAN;
      case LESSTHAN_VALUE: return LESSTHAN;
      case EQUAL_VALUE: return EQUAL;
      case BIGGEROREQUALTHAN_VALUE: return BIGGEROREQUALTHAN;
      case LESSOREQUALTHAN_VALUE: return LESSOREQUALTHAN;
      case NOTEQUALTO_VALUE: return NOTEQUALTO;
      case SMALLEST_VALUE: return SMALLEST;
      case HIGHEST_VALUE: return HIGHEST;
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
  private Equality(int value, String name, String literal)
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
  
} //Equality
