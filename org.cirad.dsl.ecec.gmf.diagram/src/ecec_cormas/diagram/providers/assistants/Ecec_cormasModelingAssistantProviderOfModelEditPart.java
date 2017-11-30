/*
 * 
 */
package ecec_cormas.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Ecec_cormasModelingAssistantProviderOfModelEditPart extends
		ecec_cormas.diagram.providers.Ecec_cormasModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(14);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.VegetationUnit_2001);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Forager_2002);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.LogisticGrowth_2003);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Init_2004);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Control_2005);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.CustomProtocol_2006);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Class_2007);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Method_2008);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Attribute_2009);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Enviromment_2010);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.PoV_2011);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Probe_2012);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Scheduler_2013);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ModelParameters_2014);
		return types;
	}

}
