/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Function#getDomain <em>Domain</em>}</li>
 *   <li>{@link behaviorMetamodel.Function#getCodomain <em>Codomain</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getFunction_Domain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getDomain();

	/**
	 * Returns the value of the '<em><b>Codomain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codomain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codomain</em>' containment reference.
	 * @see #setCodomain(Type)
	 * @see behaviorMetamodel.MetamodelPackage#getFunction_Codomain()
	 * @model containment="true"
	 * @generated
	 */
	Type getCodomain();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Function#getCodomain <em>Codomain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codomain</em>' containment reference.
	 * @see #getCodomain()
	 * @generated
	 */
	void setCodomain(Type value);

} // Function
