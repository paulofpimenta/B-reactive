/*
 * 
 */
package ecec_cormas.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		ecec_cormas.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		ecec_cormas.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		ecec_cormas.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		ecec_cormas.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		ecec_cormas.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
