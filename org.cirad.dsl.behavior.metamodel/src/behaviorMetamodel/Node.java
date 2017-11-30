/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Node#getOutcome_edge <em>Outcome edge</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Element
{
	/**
	 * Returns the value of the '<em><b>Outcome edge</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome edge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome edge</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getNode_Outcome_edge()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getOutcome_edge();

} // Node
