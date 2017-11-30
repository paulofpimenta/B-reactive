//package org.cirad.dsl.xtext.util
//
//import behaviorMetamodel.Model
//import behaviorMetamodel.Behavior
//import behaviorMetamodel.EquationBehavior
//import behaviorMetamodel.ActivityBehavior
//import behaviorMetamodel.ActivityDiagramBehavior
//import behaviorMetamodel.AttributeClass
//import behaviorMetamodel.VariableClass
//import behaviorMetamodel.ParameterClass
//import behaviorMetamodel.LocalVariable
//import behaviorMetamodel.Entity
//import behaviorMetamodel.Init
//import behaviorMetamodel.InitSpace
//import behaviorMetamodel.InitEntity
//import behaviorMetamodel.Type
//import behaviorMetamodel.TypeEnum
//
//import static extension org.eclipse.xtext.EcoreUtil2.*
//
//class BehaviorDslUtil {
//	
//	def static entities(Model m) {
//		m.entities.filter(typeof(Entity))
//	}
//
//	def static behaviors(SJClass c) {
//		c.members.filter(typeof(SJMethod))
//	}
//
//	def static returnStatement(SJMethod m) {
//		m.body.statements.typeSelect(typeof(SJReturn)).head
//	}
//
//	def static containingClass(EObject e) {
//		e.getContainerOfType(typeof(SJClass))
//	}
//
//	def static containingMethod(EObject e) {
//		e.getContainerOfType(typeof(SJMethod))
//	}
//
//	def static containingProgram(EObject e) {
//		e.getContainerOfType(typeof(SJProgram))
//	}
//
//	def static containingBlock(EObject e) {
//		e.getContainerOfType(typeof(SJBlock))
//	}
//
//	def static memberAsString(SJMember m) {
//		switch (m) {
//			SJField: m.name
//			SJMethod: m.name + "(" +
//				m.paramsTypesAsString + ")"
//		}
//	}
//	
//	def static paramsTypesAsString(SJMethod m) {
//		m.params.map[type?.name].join(", ")
//	}
//
//	def static memberAsStringWithType(SJMember m) {
//		m.memberAsString + " : " + m.type.name
//}
//	
//}