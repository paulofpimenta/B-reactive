/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Behavior#getParameters <em>Parameters</em>}</li>
 *   <li>{@link behaviorMetamodel.Behavior#getName <em>Name</em>}</li>
 *   <li>{@link behaviorMetamodel.Behavior#getLocalvariable <em>Localvariable</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends EObject
{
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
	 * @see behaviorMetamodel.MetamodelPackage#getBehavior_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterClass> getParameters();

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
	 * @see behaviorMetamodel.MetamodelPackage#getBehavior_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Behavior#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Localvariable</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.LocalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localvariable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localvariable</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getBehavior_Localvariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocalVariable> getLocalvariable();

} // Behavior
