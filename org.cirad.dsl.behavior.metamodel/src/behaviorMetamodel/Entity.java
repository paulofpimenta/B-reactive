/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Entity#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link behaviorMetamodel.Entity#getName <em>Name</em>}</li>
 *   <li>{@link behaviorMetamodel.Entity#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
{
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getEntity_Behavior()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehavior();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see behaviorMetamodel.MetamodelPackage#getEntity_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.AttributeClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeClass> getAttributes();

} // Entity
