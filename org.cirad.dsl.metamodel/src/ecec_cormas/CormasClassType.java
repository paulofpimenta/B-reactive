/**
 */
package ecec_cormas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cormas Class Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ecec_cormas.Ecec_cormasPackage#getCormasClassType()
 * @model
 * @generated
 */
public enum CormasClassType implements Enumerator {
	/**
	 * The '<em><b>Agent Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGENT_LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	AGENT_LOCATION(0, "AgentLocation", "AgentLocation"),

	/**
	 * The '<em><b>Spatial Entity Cell</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPATIAL_ENTITY_CELL_VALUE
	 * @generated
	 * @ordered
	 */
	SPATIAL_ENTITY_CELL(0, "SpatialEntityCell", "SpatialEntityCell"),

	/**
	 * The '<em><b>Initializator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALIZATOR_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALIZATOR(0, "Initializator", "Initializator");

	/**
	 * The '<em><b>Agent Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Agent Location</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGENT_LOCATION
	 * @model name="AgentLocation"
	 * @generated
	 * @ordered
	 */
	public static final int AGENT_LOCATION_VALUE = 0;

	/**
	 * The '<em><b>Spatial Entity Cell</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spatial Entity Cell</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPATIAL_ENTITY_CELL
	 * @model name="SpatialEntityCell"
	 * @generated
	 * @ordered
	 */
	public static final int SPATIAL_ENTITY_CELL_VALUE = 0;

	/**
	 * The '<em><b>Initializator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initializator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIALIZATOR
	 * @model name="Initializator"
	 * @generated
	 * @ordered
	 */
	public static final int INITIALIZATOR_VALUE = 0;

	/**
	 * An array of all the '<em><b>Cormas Class Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CormasClassType[] VALUES_ARRAY =
		new CormasClassType[] {
			AGENT_LOCATION,
			SPATIAL_ENTITY_CELL,
			INITIALIZATOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Cormas Class Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CormasClassType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cormas Class Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CormasClassType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CormasClassType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cormas Class Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CormasClassType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CormasClassType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cormas Class Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CormasClassType get(int value) {
		switch (value) {
			case AGENT_LOCATION_VALUE: return AGENT_LOCATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CormasClassType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CormasClassType
