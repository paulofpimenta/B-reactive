/*
 * 
 */
package ecec_cormas.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			ecec_cormas.diagram.part.Ecec_cormasDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
