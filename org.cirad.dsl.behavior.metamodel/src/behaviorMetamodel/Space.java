/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Space#getLocation <em>Location</em>}</li>
 *   <li>{@link behaviorMetamodel.Space#getX <em>X</em>}</li>
 *   <li>{@link behaviorMetamodel.Space#getY <em>Y</em>}</li>
 *   <li>{@link behaviorMetamodel.Space#getDeclaredentitites <em>Declaredentitites</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getSpace()
 * @model
 * @generated
 */
public interface Space extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.DeclaredLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getSpace_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaredLocation> getLocation();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see behaviorMetamodel.MetamodelPackage#getSpace_X()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Space#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see behaviorMetamodel.MetamodelPackage#getSpace_Y()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Space#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Declaredentitites</b></em>' reference list.
	 * The list contents are of type {@link behaviorMetamodel.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaredentitites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaredentitites</em>' reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getSpace_Declaredentitites()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getDeclaredentitites();

} // Space
