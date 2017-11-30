/*
 * 
 */
package ecec_cormas.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Ecec_cormasPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				ecec_cormas.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createClass2CreationTool());
		paletteContainer.add(createControl3CreationTool());
		paletteContainer.add(createCustomProtocol4CreationTool());
		paletteContainer.add(createEnviromment5CreationTool());
		paletteContainer.add(createForager6CreationTool());
		paletteContainer.add(createInit7CreationTool());
		paletteContainer.add(createLogisticGrowth8CreationTool());
		paletteContainer.add(createMethod9CreationTool());
		paletteContainer.add(createModelParameters10CreationTool());
		paletteContainer.add(createPoV11CreationTool());
		paletteContainer.add(createProbe12CreationTool());
		paletteContainer.add(createScheduler13CreationTool());
		paletteContainer.add(createVegetationUnit14CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				ecec_cormas.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAttributeProbes1CreationTool());
		paletteContainer.add(createClassProbes2CreationTool());
		paletteContainer.add(createLoadEnviroment3CreationTool());
		paletteContainer.add(createRelation4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Attribute_2009);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Attribute_3006);
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.Attribute1CreationTool_title,
				ecec_cormas.diagram.part.Messages.Attribute1CreationTool_desc,
				types);
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Attribute_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.Class2CreationTool_title,
				ecec_cormas.diagram.part.Messages.Class2CreationTool_desc,
				Collections
						.singletonList(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Class_2007));
		entry.setId("createClass2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Class_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControl3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Control_3004);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Control_2005);
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.Control3CreationTool_title,
				ecec_cormas.diagram.part.Messages.Control3CreationTool_desc,
				types);
		entry.setId("createControl3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Control_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustomProtocol4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.CustomProtocol_3005);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.CustomProtocol_2006);
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.CustomProtocol4CreationTool_title,
				ecec_cormas.diagram.part.Messages.CustomProtocol4CreationTool_desc,
				types);
		entry.setId("createCustomProtocol4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.CustomProtocol_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnviromment5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.Enviromment5CreationTool_title,
				ecec_cormas.diagram.part.Messages.Enviromment5CreationTool_desc,
				Collections
						.singletonList(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Enviromment_2010));
		entry.setId("createEnviromment5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Enviromment_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForager6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.Forager6CreationTool_title,
				ecec_cormas.diagram.part.Messages.Forager6CreationTool_desc,
				Collections
						.singletonList(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Forager_2002));
		entry.setId("createForager6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Forager_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInit7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Init_3001);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Init_2004);
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.Init7CreationTool_title,
				ecec_cormas.diagram.part.Messages.Init7CreationTool_desc, types);
		entry.setId("createInit7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Init_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLogisticGrowth8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.LogisticGrowth_3002);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.LogisticGrowth_2003);
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.LogisticGrowth8CreationTool_title,
				ecec_cormas.diagram.part.Messages.LogisticGrowth8CreationTool_desc,
				types);
		entry.setId("createLogisticGrowth8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.LogisticGrowth_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMethod9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Method_3003);
		types.add(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Method_2008);
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.Method9CreationTool_title,
				ecec_cormas.diagram.part.Messages.Method9CreationTool_desc,
				types);
		entry.setId("createMethod9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Method_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModelParameters10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.ModelParameters10CreationTool_title,
				ecec_cormas.diagram.part.Messages.ModelParameters10CreationTool_desc,
				Collections
						.singletonList(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ModelParameters_2014));
		entry.setId("createModelParameters10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ModelParameters_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPoV11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.PoV11CreationTool_title,
				ecec_cormas.diagram.part.Messages.PoV11CreationTool_desc,
				Collections
						.singletonList(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.PoV_2011));
		entry.setId("createPoV11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.PoV_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProbe12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.Probe12CreationTool_title,
				ecec_cormas.diagram.part.Messages.Probe12CreationTool_desc,
				Collections
						.singletonList(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Probe_2012));
		entry.setId("createProbe12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Probe_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScheduler13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.Scheduler13CreationTool_title,
				ecec_cormas.diagram.part.Messages.Scheduler13CreationTool_desc,
				Collections
						.singletonList(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Scheduler_2013));
		entry.setId("createScheduler13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Scheduler_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVegetationUnit14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				ecec_cormas.diagram.part.Messages.VegetationUnit14CreationTool_title,
				ecec_cormas.diagram.part.Messages.VegetationUnit14CreationTool_desc,
				Collections
						.singletonList(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.VegetationUnit_2001));
		entry.setId("createVegetationUnit14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.VegetationUnit_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeProbes1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				ecec_cormas.diagram.part.Messages.AttributeProbes1CreationTool_title,
				ecec_cormas.diagram.part.Messages.AttributeProbes1CreationTool_desc,
				Collections
						.singletonList(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeAttributeProbes_4005));
		entry.setId("createAttributeProbes1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeAttributeProbes_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassProbes2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				ecec_cormas.diagram.part.Messages.ClassProbes2CreationTool_title,
				ecec_cormas.diagram.part.Messages.ClassProbes2CreationTool_desc,
				Collections
						.singletonList(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeClassProbes_4003));
		entry.setId("createClassProbes2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.ProbeClassProbes_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoadEnviroment3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				ecec_cormas.diagram.part.Messages.LoadEnviroment3CreationTool_title,
				ecec_cormas.diagram.part.Messages.LoadEnviroment3CreationTool_desc,
				Collections
						.singletonList(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.EnvirommentLoadEnviroment_4001));
		entry.setId("createLoadEnviroment3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.EnvirommentLoadEnviroment_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				ecec_cormas.diagram.part.Messages.Relation4CreationTool_title,
				ecec_cormas.diagram.part.Messages.Relation4CreationTool_desc,
				Collections
						.singletonList(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004));
		entry.setId("createRelation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ecec_cormas.diagram.providers.Ecec_cormasElementTypes
				.getImageDescriptor(ecec_cormas.diagram.providers.Ecec_cormasElementTypes.Relation_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
