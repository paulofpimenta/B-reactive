/*
 * generated by Xtext 2.10.0
 */
package org.cirad.dsl.xtext.validation

import org.eclipse.xtext.validation.Check
import behaviorMetamodel.Model
import behaviorMetamodel.AttributeClass

import static extension java.lang.Character.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import behaviorMetamodel.MetamodelPackage
import behaviorMetamodel.Behavior

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class BreactiveValidator extends AbstractBreactiveValidator {
	
	public static val DUPLICATE_BEHAVIOR = "org.cirad.dsl.behavior.metamodel.DuplicateBehavior"
 	public static val INVALID_MODEL_NAME = "org.cirad.dsl.behavior.metamodel.InvalidModelName"
 	public static val INVALID_ATTR_NAME = "org.cirad.dsl.behavior.metamodel.InvalidAttributeName"
 	
 	
  @Check
	def checkEntityNameStartsWithCapital(Model m) {
	if (m.name.charAt(0).lowerCase)
      warning("Model name should start with a capital letter",
      	MetamodelPackage::eINSTANCE.model_Name,
      	INVALID_MODEL_NAME
      )
  }
  @Check
	def checkAttributeNameStartsWithLowercase(AttributeClass attr) {
	if (attr.name.charAt(0).upperCase)
      warning("Attribute name should start with a lower case in " + attr.name,
      	MetamodelPackage::eINSTANCE.variableClass_Name,
      	INVALID_ATTR_NAME,attr.name
      )
  }
  
	@Check
	def void checkNoDuplicateBehavior(Behavior b) {
		val duplicate = b.getContainerOfType(typeof(Model)).
			getAllContentsOfType(typeof(Behavior)).findFirst[
				it != b && it.name == b.name		
			]
		if (duplicate != null)
			error("Duplicate behavior declaration '" + b.name + "'",
				MetamodelPackage::eINSTANCE.behavior_Name,
				DUPLICATE_BEHAVIOR
			)
	}

	
}
