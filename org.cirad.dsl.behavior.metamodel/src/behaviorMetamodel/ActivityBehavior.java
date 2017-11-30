/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.ActivityBehavior#getPrimitiveaactivities <em>Primitiveaactivities</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getActivityBehavior()
 * @model
 * @generated
 */
public interface ActivityBehavior extends Behavior
{
	/**
	 * Returns the value of the '<em><b>Primitiveaactivities</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.PrimitiveActivities}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitiveaactivities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitiveaactivities</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getActivityBehavior_Primitiveaactivities()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimitiveActivities> getPrimitiveaactivities();

} // ActivityBehavior
