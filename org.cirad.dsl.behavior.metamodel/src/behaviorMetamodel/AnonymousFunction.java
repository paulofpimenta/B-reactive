/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.AnonymousFunction#getExpression <em>Expression</em>}</li>
 *   <li>{@link behaviorMetamodel.AnonymousFunction#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getAnonymousFunction()
 * @model
 * @generated
 */
public interface AnonymousFunction extends Function
{
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see behaviorMetamodel.MetamodelPackage#getAnonymousFunction_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.AnonymousFunction#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.ParameterClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getAnonymousFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterClass> getParameters();

} // AnonymousFunction
