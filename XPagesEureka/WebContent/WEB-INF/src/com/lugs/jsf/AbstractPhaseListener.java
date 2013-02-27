package com.lugs.jsf;

import javax.faces.component.UIViewRoot;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import com.ibm.xsp.component.UIViewRootEx;
import com.ibm.xsp.context.FacesContextEx;

public abstract class AbstractPhaseListener implements PhaseListener {
	private static final long serialVersionUID = 1L;
	private static final int RESTORE_VIEW = 1;
	private static final int APPLY_REQUEST_VALUES = 2;
	private static final int PROCESS_VALIDATIONS = 3;
	private static final int UPDATE_MODEL_VALUES = 4;
	private static final int INVOKE_APPLICATION = 5;
	private static final int RENDER_RESPONSE = 6;

	public void afterPhase(PhaseEvent event) {
		switch (event.getPhaseId().getOrdinal()) {
		case RESTORE_VIEW:
			afterRestoreView(event);
			break;
		case APPLY_REQUEST_VALUES:
			afterApplyRequestValues(event);
			break;
		case PROCESS_VALIDATIONS:
			afterProcessValidations(event);
			break;
		case UPDATE_MODEL_VALUES:
			afterUpdateModelValues(event);
			break;
		case INVOKE_APPLICATION:
			afterInvokeApplication(event);
			break;
		case RENDER_RESPONSE:
			afterRenderResponse(event);
			break;
		}
	}

	public void beforePhase(PhaseEvent event) {
		switch (event.getPhaseId().getOrdinal()) {
		case RESTORE_VIEW:
			beforeRestoreView(event);
			break;
		case APPLY_REQUEST_VALUES:
			beforeApplyRequestValues(event);
			break;
		case PROCESS_VALIDATIONS:
			beforeProcessValidations(event);
			break;
		case UPDATE_MODEL_VALUES:
			beforeUpdateModelValues(event);
			break;
		case INVOKE_APPLICATION:
			beforeInvokeApplication(event);
			break;
		case RENDER_RESPONSE:
			beforeRenderResponse(event);
			break;
		}
	}

	protected void beforeRestoreView(PhaseEvent event) {

	}

	protected void afterRestoreView(PhaseEvent event) {

	}

	protected void beforeApplyRequestValues(PhaseEvent event) {

	}

	protected void afterApplyRequestValues(PhaseEvent event) {

	}

	protected void beforeProcessValidations(PhaseEvent event) {

	}

	protected void afterProcessValidations(PhaseEvent event) {

	}

	protected void beforeInvokeApplication(PhaseEvent event) {

	}

	protected void afterUpdateModelValues(PhaseEvent event) {

	}

	protected void beforeUpdateModelValues(PhaseEvent event) {

	}

	protected void afterInvokeApplication(PhaseEvent event) {

	}

	protected void beforeRenderResponse(PhaseEvent event) {

	}

	protected void afterRenderResponse(PhaseEvent event) {

	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

	protected void print(PhaseEvent event, String message) {
		String pageName = "";
		UIViewRoot root = FacesContextEx.getCurrentInstance().getViewRoot();
		if (root instanceof UIViewRootEx) {
			UIViewRootEx rootEx = (UIViewRootEx) root;
			pageName = rootEx.getPageName();
		}
		String phaseName = event.getPhaseId().toString();
		System.out.println(pageName + " - " + phaseName + " - " + message);
	}

}
