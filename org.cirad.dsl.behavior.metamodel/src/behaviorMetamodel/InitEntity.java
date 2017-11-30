/**
 */
package behaviorMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.InitEntity#getInitialLocation <em>Initial Location</em>}</li>
 *   <li>{@link behaviorMetamodel.InitEntity#getInitName <em>Init Name</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getInitEntity()
 * @model
 * @generated
 */
public interface InitEntity extends Init
{
	/**
	 * Returns the value of the '<em><b>Initial Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Location</em>' containment reference.
	 * @see #setInitialLocation(Expression)
	 * @see behaviorMetamodel.MetamodelPackage#getInitEntity_InitialLocation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getInitialLocation();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.InitEntity#getInitialLocation <em>Initial Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Location</em>' containment reference.
	 * @see #getInitialLocation()
	 * @generated
	 */
	void setInitialLocation(Expression value);

	/**
	 * Returns the value of the '<em><b>Init Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Name</em>' attribute.
	 * @see #setInitName(String)
	 * @see behaviorMetamodel.MetamodelPackage#getInitEntity_InitName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getInitName();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.InitEntity#getInitName <em>Init Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Name</em>' attribute.
	 * @see #getInitName()
	 * @generated
	 */
	void setInitName(String value);

} // InitEntity
