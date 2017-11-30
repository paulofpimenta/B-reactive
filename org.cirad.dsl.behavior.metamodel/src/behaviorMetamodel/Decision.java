/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Decision#getBooleanexpression <em>Booleanexpression</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getDecision()
 * @model
 * @generated
 */
public interface Decision extends ControlNode
{
	/**
	 * Returns the value of the '<em><b>Booleanexpression</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booleanexpression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanexpression</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getDecision_Booleanexpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getBooleanexpression();

} // Decision
