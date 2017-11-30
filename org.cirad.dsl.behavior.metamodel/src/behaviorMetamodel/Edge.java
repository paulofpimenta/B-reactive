/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Edge#getTarget_node <em>Target node</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends Element
{
	/**
	 * Returns the value of the '<em><b>Target node</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target node</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getEdge_Target_node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getTarget_node();

} // Edge
