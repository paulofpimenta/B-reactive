/*
 * 
 */
package ecec_cormas.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class Ecec_cormasNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7012;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7011;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem) {
			ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem item = (ecec_cormas.diagram.navigator.Ecec_cormasNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ecec_cormas.diagram.part.Ecec_cormasVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
