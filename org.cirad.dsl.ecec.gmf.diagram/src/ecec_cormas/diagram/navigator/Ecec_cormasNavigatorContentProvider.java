/*
 * 
 */
package ecec_cormas.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class Ecec_cormasNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public Ecec_cormasNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem> result = new ArrayList<ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							ecec_cormas.diagram.edit.parts.ModelEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup) {
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup group = (ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem) {
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem navigatorItem = (ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
				.getVisualID(view)) {

		case ecec_cormas.diagram.edit.parts.ModelEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup links = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_Model_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.LogisticGrowthEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.InitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ControlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.CustomProtocolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.MethodEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.PoVEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.SchedulerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ModelParametersEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup incominglinks = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_VegetationUnit_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup outgoinglinks = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_VegetationUnit_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.VegetationUnitVegetationUnitProtocolsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.VegetationUnitVegetationUnitProtocolsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.VegetationUnitVegetationUnitProtocolsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup incominglinks = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_Forager_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup outgoinglinks = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_Forager_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ForagerForagerProtocolsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ForagerForagerProtocolsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ForagerForagerProtocolsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.InitEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup incominglinks = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_Init_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.InitInitMethodsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.InitInitMethodsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.ControlEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.CustomProtocolEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup incominglinks = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_Class_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup outgoinglinks = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_Class_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ClassClassProtocolsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ClassClassProtocolsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ClassClassProtocolsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup incominglinks = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_Attribute_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup outgoinglinks = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_Enviromment_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup outgoinglinks = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_Probe_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.SchedulerEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.SchedulerSchedulerAttributesSchedulerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup incominglinks = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_Init_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.InitInitMethodsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.InitInitMethodsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.Control2EditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ControlControlMethodsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.CustomProtocol2EditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.LogisticGrowth2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.CustomProtocolCustomProtocolMethodsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Method2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Node sv = (Node) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup incominglinks = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_Attribute_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.EnvirommentLoadEnviromentEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup target = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_EnvirommentLoadEnviroment_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup source = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_EnvirommentLoadEnviroment_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.InitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Init2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.EnvirommentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.ProbeClassProbesEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup target = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_ProbeClassProbes_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup source = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_ProbeClassProbes_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.RelationEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup target = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_Relation_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup source = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_Relation_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.VegetationUnitEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ForagerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ecec_cormas.diagram.edit.parts.ProbeAttributeProbesEditPart.VISUAL_ID: {
			LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem> result = new LinkedList<ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup target = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_ProbeAttributeProbes_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup source = new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorGroup(
					ecec_cormas.diagram.part.Messages.NavigatorGroupName_ProbeAttributeProbes_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.Attribute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
							.getType(ecec_cormas.diagram.edit.parts.ProbeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ecec_cormas.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem> result = new ArrayList<ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem) {
			ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem abstractNavigatorItem = (ecec_cormas.diagram.navigator.Ecec_cormasAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
