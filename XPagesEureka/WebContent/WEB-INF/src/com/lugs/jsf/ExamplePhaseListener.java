package com.lugs.jsf;

import javax.faces.event.PhaseEvent;

public class ExamplePhaseListener extends AbstractPhaseListener {
	// The PhaseListener interface extends Serializable, so it's recommended
	// that the class specify a version ID:
	private static final long serialVersionUID = 1L;

	/*
	 * The AbstractPhaseListener class provides a base framework for binding to specific phases. All we need to do is
	 * override specific after/before methods, depending on which phase we want to add behavior to and whether we wish
	 * that behavior to occur prior to the phase or after it's completed. If we register this class as a phase-listener
	 * within an application's faces-config.xml file, any methods we define within this class will then be automatically
	 * called whenever an XPage reaches the corresponding portion of the JSF lifecycle.
	 * 
	 * A print() method is provided for convenience; messages passed to this method are preceded in the server console
	 * by the current page name and phase indicator. For example:
	 * 
	 * print(event, "This code runs before the response is rendered");
	 * 
	 * ...results in output similar to the following:
	 * 
	 * HTTP JVM: /index.xsp - RENDER_RESPONSE 6 - This code runs before the response is rendered.
	 */

	@Override
	protected void beforeRestoreView(PhaseEvent event) {
		print(event, "Starting");
	}

	@Override
	protected void afterRestoreView(PhaseEvent event) {
		print(event, "Finished");
	}

	@Override
	protected void beforeApplyRequestValues(PhaseEvent event) {
		print(event, "Starting");
	}

	@Override
	protected void afterApplyRequestValues(PhaseEvent event) {
		print(event, "Finished");
	}

	@Override
	protected void beforeProcessValidations(PhaseEvent event) {
		print(event, "Starting");
	}

	@Override
	protected void afterProcessValidations(PhaseEvent event) {
		print(event, "Finished");
	}

	@Override
	protected void beforeInvokeApplication(PhaseEvent event) {
		print(event, "Starting");
	}

	@Override
	protected void afterUpdateModelValues(PhaseEvent event) {
		print(event, "Finished");
	}

	@Override
	protected void beforeUpdateModelValues(PhaseEvent event) {
		print(event, "Starting");
	}

	@Override
	protected void afterInvokeApplication(PhaseEvent event) {
		print(event, "Finished");
	}

	@Override
	protected void beforeRenderResponse(PhaseEvent event) {
		print(event, "Starting");
	}

	@Override
	protected void afterRenderResponse(PhaseEvent event) {
		print(event, "Finished");
	}

}
