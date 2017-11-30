/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Add#getToAttribute <em>To Attribute</em>}</li>
 *   <li>{@link behaviorMetamodel.Add#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getAdd()
 * @model
 * @generated
 */
public interface Add extends PrimitiveActivities
{
	/**
	 * Returns the value of the '<em><b>To Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Attribute</em>' containment reference.
	 * @see #setToAttribute(DeclaredAttributes)
	 * @see behaviorMetamodel.MetamodelPackage#getAdd_ToAttribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeclaredAttributes getToAttribute();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Add#getToAttribute <em>To Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Attribute</em>' containment reference.
	 * @see #getToAttribute()
	 * @generated
	 */
	void setToAttribute(DeclaredAttributes value);

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
	 * @see behaviorMetamodel.MetamodelPackage#getAdd_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // Add
