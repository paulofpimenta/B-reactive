/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.FunctionCallExpression#getArguments <em>Arguments</em>}</li>
 *   <li>{@link behaviorMetamodel.FunctionCallExpression#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getFunctionCallExpression()
 * @model
 * @generated
 */
public interface FunctionCallExpression extends Expression
{
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getFunctionCallExpression_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Function)
	 * @see behaviorMetamodel.MetamodelPackage#getFunctionCallExpression_Function()
	 * @model containment="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.FunctionCallExpression#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

} // FunctionCallExpression
