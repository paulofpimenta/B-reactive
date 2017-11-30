/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Init#getAssingnments <em>Assingnments</em>}</li>
 *   <li>{@link behaviorMetamodel.Init#getEntity <em>Entity</em>}</li>
 *   <li>{@link behaviorMetamodel.Init#getInitFunctionCall <em>Init Function Call</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getInit()
 * @model
 * @generated
 */
public interface Init extends EObject
{
	/**
	 * Returns the value of the '<em><b>Assingnments</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assingnments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assingnments</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getInit_Assingnments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignment> getAssingnments();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference list.
	 * The list contents are of type {@link behaviorMetamodel.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getInit_Entity()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Init Function Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Function Call</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Function Call</em>' containment reference.
	 * @see #setInitFunctionCall(Expression)
	 * @see behaviorMetamodel.MetamodelPackage#getInit_InitFunctionCall()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getInitFunctionCall();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Init#getInitFunctionCall <em>Init Function Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Function Call</em>' containment reference.
	 * @see #getInitFunctionCall()
	 * @generated
	 */
	void setInitFunctionCall(Expression value);

} // Init
