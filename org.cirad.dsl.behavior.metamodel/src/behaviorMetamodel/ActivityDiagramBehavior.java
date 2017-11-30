/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Diagram Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.ActivityDiagramBehavior#getStart <em>Start</em>}</li>
 *   <li>{@link behaviorMetamodel.ActivityDiagramBehavior#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getActivityDiagramBehavior()
 * @model
 * @generated
 */
public interface ActivityDiagramBehavior extends Behavior
{
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Start)
	 * @see behaviorMetamodel.MetamodelPackage#getActivityDiagramBehavior_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.ActivityDiagramBehavior#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getActivityDiagramBehavior_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // ActivityDiagramBehavior
