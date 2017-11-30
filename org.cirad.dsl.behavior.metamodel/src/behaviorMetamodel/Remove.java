/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Remove#getFrom <em>From</em>}</li>
 *   <li>{@link behaviorMetamodel.Remove#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getRemove()
 * @model
 * @generated
 */
public interface Remove extends PrimitiveActivities
{
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Expression)
	 * @see behaviorMetamodel.MetamodelPackage#getRemove_From()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getFrom();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Remove#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Expression value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getRemove_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // Remove
