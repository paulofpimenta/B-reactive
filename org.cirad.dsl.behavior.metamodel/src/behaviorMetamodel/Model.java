/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Model#getEntities <em>Entities</em>}</li>
 *   <li>{@link behaviorMetamodel.Model#getName <em>Name</em>}</li>
 *   <li>{@link behaviorMetamodel.Model#getInit <em>Init</em>}</li>
 *   <li>{@link behaviorMetamodel.Model#getMainBehavior <em>Main Behavior</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getModel_Entities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entity> getEntities();

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
	 * @see behaviorMetamodel.MetamodelPackage#getModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.Init}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getModel_Init()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Init> getInit();

	/**
	 * Returns the value of the '<em><b>Main Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Behavior</em>' containment reference.
	 * @see #setMainBehavior(Behavior)
	 * @see behaviorMetamodel.MetamodelPackage#getModel_MainBehavior()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Behavior getMainBehavior();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Model#getMainBehavior <em>Main Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Behavior</em>' containment reference.
	 * @see #getMainBehavior()
	 * @generated
	 */
	void setMainBehavior(Behavior value);

} // Model
