/**
 */
package behaviorMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.DeclaredBehavior#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getDeclaredBehavior()
 * @model
 * @generated
 */
public interface DeclaredBehavior extends Node
{
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see behaviorMetamodel.MetamodelPackage#getDeclaredBehavior_Behavior()
	 * @model
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.DeclaredBehavior#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // DeclaredBehavior
