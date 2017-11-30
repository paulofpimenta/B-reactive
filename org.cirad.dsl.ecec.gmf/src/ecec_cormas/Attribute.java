/**
 */
package ecec_cormas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecec_cormas.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link ecec_cormas.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link ecec_cormas.Attribute#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link ecec_cormas.Attribute#getNotifyObservers <em>Notify Observers</em>}</li>
 *   <li>{@link ecec_cormas.Attribute#getSetterAcessor <em>Setter Acessor</em>}</li>
 *   <li>{@link ecec_cormas.Attribute#getGetterAcessor <em>Getter Acessor</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecec_cormas.Ecec_cormasPackage#getAttribute()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/org.cirad.dsl.ecec.gmf/icons/svg/attribute.svg' label.icon='false' label='Name,value' label.pattern='{0}:{1}' label.placement='external' size='40,40' resizable='false'"
 * @generated
 */
public interface Attribute extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see ecec_cormas.Ecec_cormasPackage#getAttribute_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ecec_cormas.Attribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see ecec_cormas.Ecec_cormasPackage#getAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecec_cormas.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ecec_cormas.BooleanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' attribute.
	 * @see ecec_cormas.BooleanType
	 * @see #setInstanceType(BooleanType)
	 * @see ecec_cormas.Ecec_cormasPackage#getAttribute_InstanceType()
	 * @model
	 * @generated
	 */
	BooleanType getInstanceType();

	/**
	 * Sets the value of the '{@link ecec_cormas.Attribute#getInstanceType <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' attribute.
	 * @see ecec_cormas.BooleanType
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(BooleanType value);

	/**
	 * Returns the value of the '<em><b>Notify Observers</b></em>' attribute.
	 * The literals are from the enumeration {@link ecec_cormas.BooleanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notify Observers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notify Observers</em>' attribute.
	 * @see ecec_cormas.BooleanType
	 * @see #setNotifyObservers(BooleanType)
	 * @see ecec_cormas.Ecec_cormasPackage#getAttribute_NotifyObservers()
	 * @model
	 * @generated
	 */
	BooleanType getNotifyObservers();

	/**
	 * Sets the value of the '{@link ecec_cormas.Attribute#getNotifyObservers <em>Notify Observers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notify Observers</em>' attribute.
	 * @see ecec_cormas.BooleanType
	 * @see #getNotifyObservers()
	 * @generated
	 */
	void setNotifyObservers(BooleanType value);

	/**
	 * Returns the value of the '<em><b>Setter Acessor</b></em>' attribute.
	 * The literals are from the enumeration {@link ecec_cormas.BooleanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter Acessor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter Acessor</em>' attribute.
	 * @see ecec_cormas.BooleanType
	 * @see #setSetterAcessor(BooleanType)
	 * @see ecec_cormas.Ecec_cormasPackage#getAttribute_SetterAcessor()
	 * @model
	 * @generated
	 */
	BooleanType getSetterAcessor();

	/**
	 * Sets the value of the '{@link ecec_cormas.Attribute#getSetterAcessor <em>Setter Acessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter Acessor</em>' attribute.
	 * @see ecec_cormas.BooleanType
	 * @see #getSetterAcessor()
	 * @generated
	 */
	void setSetterAcessor(BooleanType value);

	/**
	 * Returns the value of the '<em><b>Getter Acessor</b></em>' attribute.
	 * The literals are from the enumeration {@link ecec_cormas.BooleanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter Acessor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter Acessor</em>' attribute.
	 * @see ecec_cormas.BooleanType
	 * @see #setGetterAcessor(BooleanType)
	 * @see ecec_cormas.Ecec_cormasPackage#getAttribute_GetterAcessor()
	 * @model
	 * @generated
	 */
	BooleanType getGetterAcessor();

	/**
	 * Sets the value of the '{@link ecec_cormas.Attribute#getGetterAcessor <em>Getter Acessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter Acessor</em>' attribute.
	 * @see ecec_cormas.BooleanType
	 * @see #getGetterAcessor()
	 * @generated
	 */
	void setGetterAcessor(BooleanType value);

} // Attribute
