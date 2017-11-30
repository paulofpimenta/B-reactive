/**
 */
package org.cirad.dsl.ecec.xtext.ecec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Between Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getR <em>R</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF <em>F</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF1 <em>F1</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF2 <em>F2</em>}</li>
 *   <li>{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF3 <em>F3</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getRandomBetweenExpression()
 * @model
 * @generated
 */
public interface RandomBetweenExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>R</b></em>' attribute.
   * The literals are from the enumeration {@link org.cirad.dsl.ecec.xtext.ecec.MathFunctionsEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' attribute.
   * @see org.cirad.dsl.ecec.xtext.ecec.MathFunctionsEnum
   * @see #setR(MathFunctionsEnum)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getRandomBetweenExpression_R()
   * @model
   * @generated
   */
  MathFunctionsEnum getR();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getR <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>R</em>' attribute.
   * @see org.cirad.dsl.ecec.xtext.ecec.MathFunctionsEnum
   * @see #getR()
   * @generated
   */
  void setR(MathFunctionsEnum value);

  /**
   * Returns the value of the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' containment reference.
   * @see #setF(FLOAT)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getRandomBetweenExpression_F()
   * @model containment="true"
   * @generated
   */
  FLOAT getF();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' containment reference.
   * @see #getF()
   * @generated
   */
  void setF(FLOAT value);

  /**
   * Returns the value of the '<em><b>F1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F1</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F1</em>' reference.
   * @see #setF1(ParameterExpression)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getRandomBetweenExpression_F1()
   * @model
   * @generated
   */
  ParameterExpression getF1();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF1 <em>F1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F1</em>' reference.
   * @see #getF1()
   * @generated
   */
  void setF1(ParameterExpression value);

  /**
   * Returns the value of the '<em><b>F2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F2</em>' containment reference.
   * @see #setF2(FLOAT)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getRandomBetweenExpression_F2()
   * @model containment="true"
   * @generated
   */
  FLOAT getF2();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF2 <em>F2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F2</em>' containment reference.
   * @see #getF2()
   * @generated
   */
  void setF2(FLOAT value);

  /**
   * Returns the value of the '<em><b>F3</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F3</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F3</em>' reference.
   * @see #setF3(ParameterExpression)
   * @see org.cirad.dsl.ecec.xtext.ecec.EcecPackage#getRandomBetweenExpression_F3()
   * @model
   * @generated
   */
  ParameterExpression getF3();

  /**
   * Sets the value of the '{@link org.cirad.dsl.ecec.xtext.ecec.RandomBetweenExpression#getF3 <em>F3</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F3</em>' reference.
   * @see #getF3()
   * @generated
   */
  void setF3(ParameterExpression value);

} // RandomBetweenExpression
