/**
 */
package behaviorMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reproduce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorMetamodel.Reproduce#getOffspring_quantity <em>Offspring quantity</em>}</li>
 *   <li>{@link behaviorMetamodel.Reproduce#getInitial_location <em>Initial location</em>}</li>
 *   <li>{@link behaviorMetamodel.Reproduce#getDeclaredattributes <em>Declaredattributes</em>}</li>
 *   <li>{@link behaviorMetamodel.Reproduce#getOccupiedExpression <em>Occupied Expression</em>}</li>
 * </ul>
 *
 * @see behaviorMetamodel.MetamodelPackage#getReproduce()
 * @model
 * @generated
 */
public interface Reproduce extends PrimitiveActivities
{
	/**
	 * Returns the value of the '<em><b>Offspring quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offspring quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offspring quantity</em>' containment reference.
	 * @see #setOffspring_quantity(ConstantExpression)
	 * @see behaviorMetamodel.MetamodelPackage#getReproduce_Offspring_quantity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstantExpression getOffspring_quantity();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Reproduce#getOffspring_quantity <em>Offspring quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offspring quantity</em>' containment reference.
	 * @see #getOffspring_quantity()
	 * @generated
	 */
	void setOffspring_quantity(ConstantExpression value);

	/**
	 * Returns the value of the '<em><b>Initial location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial location</em>' containment reference.
	 * @see #setInitial_location(Expression)
	 * @see behaviorMetamodel.MetamodelPackage#getReproduce_Initial_location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getInitial_location();

	/**
	 * Sets the value of the '{@link behaviorMetamodel.Reproduce#getInitial_location <em>Initial location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial location</em>' containment reference.
	 * @see #getInitial_location()
	 * @generated
	 */
	void setInitial_location(Expression value);

	/**
	 * Returns the value of the '<em><b>Declaredattributes</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaredattributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaredattributes</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getReproduce_Declaredattributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getDeclaredattributes();

	/**
	 * Returns the value of the '<em><b>Occupied Expression</b></em>' containment reference list.
	 * The list contents are of type {@link behaviorMetamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupied Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupied Expression</em>' containment reference list.
	 * @see behaviorMetamodel.MetamodelPackage#getReproduce_OccupiedExpression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getOccupiedExpression();

} // Reproduce
