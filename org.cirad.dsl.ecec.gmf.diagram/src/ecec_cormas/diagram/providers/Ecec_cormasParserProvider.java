/*
 * 
 */
package ecec_cormas.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Ecec_cormasParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser vegetationUnitNameType_5006Parser;

	/**
	 * @generated
	 */
	private IParser getVegetationUnitNameType_5006Parser() {
		if (vegetationUnitNameType_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ecec_cormas.Ecec_cormasPackage.eINSTANCE.getClass_Name(),
					ecec_cormas.Ecec_cormasPackage.eINSTANCE.getClass_Type() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			vegetationUnitNameType_5006Parser = parser;
		}
		return vegetationUnitNameType_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser foragerNameType_5007Parser;

	/**
	 * @generated
	 */
	private IParser getForagerNameType_5007Parser() {
		if (foragerNameType_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ecec_cormas.Ecec_cormasPackage.eINSTANCE.getClass_Name(),
					ecec_cormas.Ecec_cormasPackage.eINSTANCE.getClass_Type() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			foragerNameType_5007Parser = parser;
		}
		return foragerNameType_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser logisticGrowthName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getLogisticGrowthName_5008Parser() {
		if (logisticGrowthName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getMethod_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			logisticGrowthName_5008Parser = parser;
		}
		return logisticGrowthName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser initName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getInitName_5009Parser() {
		if (initName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getInit_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			initName_5009Parser = parser;
		}
		return initName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser controlName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getControlName_5010Parser() {
		if (controlName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getControl_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			controlName_5010Parser = parser;
		}
		return controlName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser customProtocolProtocolNameName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getCustomProtocolProtocolNameName_5011Parser() {
		if (customProtocolProtocolNameName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ecec_cormas.Ecec_cormasPackage.eINSTANCE
							.getCustomProtocol_ProtocolName(),
					ecec_cormas.Ecec_cormasPackage.eINSTANCE
							.getCustomProtocol_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			customProtocolProtocolNameName_5011Parser = parser;
		}
		return customProtocolProtocolNameName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser classNameType_5012Parser;

	/**
	 * @generated
	 */
	private IParser getClassNameType_5012Parser() {
		if (classNameType_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ecec_cormas.Ecec_cormasPackage.eINSTANCE.getClass_Name(),
					ecec_cormas.Ecec_cormasPackage.eINSTANCE.getClass_Type() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			classNameType_5012Parser = parser;
		}
		return classNameType_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser methodName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getMethodName_5013Parser() {
		if (methodName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getMethod_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			methodName_5013Parser = parser;
		}
		return methodName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeValueName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeValueName_5014Parser() {
		if (attributeValueName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ecec_cormas.Ecec_cormasPackage.eINSTANCE
							.getAttribute_Value(),
					ecec_cormas.Ecec_cormasPackage.eINSTANCE
							.getAttribute_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			attributeValueName_5014Parser = parser;
		}
		return attributeValueName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser envirommentNamePath_5015Parser;

	/**
	 * @generated
	 */
	private IParser getEnvirommentNamePath_5015Parser() {
		if (envirommentNamePath_5015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ecec_cormas.Ecec_cormasPackage.eINSTANCE
							.getEnviromment_Name(),
					ecec_cormas.Ecec_cormasPackage.eINSTANCE
							.getEnviromment_Path() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			envirommentNamePath_5015Parser = parser;
		}
		return envirommentNamePath_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser poVName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getPoVName_5016Parser() {
		if (poVName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getPoV_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			poVName_5016Parser = parser;
		}
		return poVName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser probeProbeName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getProbeProbeName_5017Parser() {
		if (probeProbeName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getProbe_ProbeName() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			probeProbeName_5017Parser = parser;
		}
		return probeProbeName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser schedulerName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getSchedulerName_5019Parser() {
		if (schedulerName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getScheduler_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			schedulerName_5019Parser = parser;
		}
		return schedulerName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser modelParametersName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getModelParametersName_5020Parser() {
		if (modelParametersName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getModelParameters_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			modelParametersName_5020Parser = parser;
		}
		return modelParametersName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser modelParametersAuthor_5022Parser;

	/**
	 * @generated
	 */
	private IParser getModelParametersAuthor_5022Parser() {
		if (modelParametersAuthor_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getModelParameters_Author() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			modelParametersAuthor_5022Parser = parser;
		}
		return modelParametersAuthor_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser modelParametersModelName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getModelParametersModelName_5023Parser() {
		if (modelParametersModelName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getModelParameters_ModelName() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			modelParametersModelName_5023Parser = parser;
		}
		return modelParametersModelName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser initName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getInitName_5003Parser() {
		if (initName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getInit_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			initName_5003Parser = parser;
		}
		return initName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser logisticGrowthName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getLogisticGrowthName_5001Parser() {
		if (logisticGrowthName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getMethod_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			logisticGrowthName_5001Parser = parser;
		}
		return logisticGrowthName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser methodName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getMethodName_5002Parser() {
		if (methodName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getMethod_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			methodName_5002Parser = parser;
		}
		return methodName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser controlName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getControlName_5004Parser() {
		if (controlName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getControl_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			controlName_5004Parser = parser;
		}
		return controlName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser customProtocolProtocolNameName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getCustomProtocolProtocolNameName_5005Parser() {
		if (customProtocolProtocolNameName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ecec_cormas.Ecec_cormasPackage.eINSTANCE
							.getCustomProtocol_ProtocolName(),
					ecec_cormas.Ecec_cormasPackage.eINSTANCE
							.getCustomProtocol_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			customProtocolProtocolNameName_5005Parser = parser;
		}
		return customProtocolProtocolNameName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeValueName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeValueName_5018Parser() {
		if (attributeValueName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ecec_cormas.Ecec_cormasPackage.eINSTANCE
							.getAttribute_Value(),
					ecec_cormas.Ecec_cormasPackage.eINSTANCE
							.getAttribute_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			attributeValueName_5018Parser = parser;
		}
		return attributeValueName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getRelationName_6004Parser() {
		if (relationName_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { ecec_cormas.Ecec_cormasPackage.eINSTANCE
					.getRelation_Name() };
			ecec_cormas.diagram.parsers.MessageFormatParser parser = new ecec_cormas.diagram.parsers.MessageFormatParser(
					features);
			relationName_6004Parser = parser;
		}
		return relationName_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ecec_cormas.diagram.edit.parts.VegetationUnitNameTypeEditPart.VISUAL_ID:
			return getVegetationUnitNameType_5006Parser();
		case ecec_cormas.diagram.edit.parts.ForagerNameTypeEditPart.VISUAL_ID:
			return getForagerNameType_5007Parser();
		case ecec_cormas.diagram.edit.parts.LogisticGrowthNameEditPart.VISUAL_ID:
			return getLogisticGrowthName_5008Parser();
		case ecec_cormas.diagram.edit.parts.InitNameEditPart.VISUAL_ID:
			return getInitName_5009Parser();
		case ecec_cormas.diagram.edit.parts.ControlNameEditPart.VISUAL_ID:
			return getControlName_5010Parser();
		case ecec_cormas.diagram.edit.parts.CustomProtocolProtocolNameNameEditPart.VISUAL_ID:
			return getCustomProtocolProtocolNameName_5011Parser();
		case ecec_cormas.diagram.edit.parts.ClassNameTypeEditPart.VISUAL_ID:
			return getClassNameType_5012Parser();
		case ecec_cormas.diagram.edit.parts.MethodNameEditPart.VISUAL_ID:
			return getMethodName_5013Parser();
		case ecec_cormas.diagram.edit.parts.AttributeValueNameEditPart.VISUAL_ID:
			return getAttributeValueName_5014Parser();
		case ecec_cormas.diagram.edit.parts.EnvirommentNamePathEditPart.VISUAL_ID:
			return getEnvirommentNamePath_5015Parser();
		case ecec_cormas.diagram.edit.parts.PoVNameEditPart.VISUAL_ID:
			return getPoVName_5016Parser();
		case ecec_cormas.diagram.edit.parts.ProbeProbeNameEditPart.VISUAL_ID:
			return getProbeProbeName_5017Parser();
		case ecec_cormas.diagram.edit.parts.SchedulerNameEditPart.VISUAL_ID:
			return getSchedulerName_5019Parser();
		case ecec_cormas.diagram.edit.parts.ModelParametersNameEditPart.VISUAL_ID:
			return getModelParametersName_5020Parser();
		case ecec_cormas.diagram.edit.parts.ModelParametersAuthorEditPart.VISUAL_ID:
			return getModelParametersAuthor_5022Parser();
		case ecec_cormas.diagram.edit.parts.ModelParametersModelNameEditPart.VISUAL_ID:
			return getModelParametersModelName_5023Parser();
		case ecec_cormas.diagram.edit.parts.InitName2EditPart.VISUAL_ID:
			return getInitName_5003Parser();
		case ecec_cormas.diagram.edit.parts.LogisticGrowthName2EditPart.VISUAL_ID:
			return getLogisticGrowthName_5001Parser();
		case ecec_cormas.diagram.edit.parts.MethodName2EditPart.VISUAL_ID:
			return getMethodName_5002Parser();
		case ecec_cormas.diagram.edit.parts.ControlName2EditPart.VISUAL_ID:
			return getControlName_5004Parser();
		case ecec_cormas.diagram.edit.parts.CustomProtocolProtocolNameName2EditPart.VISUAL_ID:
			return getCustomProtocolProtocolNameName_5005Parser();
		case ecec_cormas.diagram.edit.parts.AttributeValueName2EditPart.VISUAL_ID:
			return getAttributeValueName_5018Parser();
		case ecec_cormas.diagram.edit.parts.RelationNameEditPart.VISUAL_ID:
			return getRelationName_6004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ecec_cormas.diagram.providers.Ecec_cormasElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
