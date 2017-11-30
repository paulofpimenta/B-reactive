/**
 */
package behaviorMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Type#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"string"</code>.
	 * The literals are from the enumeration {@link behaviorMetamodel.TypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see behaviorMetamodel.TypeEnum
	 * @see #setType(TypeEnum)
	 * @see behaviorMetamodel.MetamodelPackage#getType_Type()
	 * @model default="string" required="true"
	 * @generated
	 */
	TypeEnum getType();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Type#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see behaviorMetamodel.TypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeEnum value);

} // Type
