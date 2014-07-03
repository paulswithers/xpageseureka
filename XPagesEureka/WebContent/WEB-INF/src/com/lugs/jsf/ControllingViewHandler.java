package com.lugs.jsf;

import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import com.ibm.xsp.application.ViewHandlerExImpl;
import com.ibm.xsp.component.UIViewRootEx;
import com.ibm.xsp.extlib.util.ExtLibUtil;

public class ControllingViewHandler extends ViewHandlerExImpl {

	public ControllingViewHandler(ViewHandler arg0) {
		super(arg0);
	}

	@Override
	public UIViewRoot createView(FacesContext arg0, String arg1) {
		UIViewRootEx root = null;
		SampleBean controllerSample = new SampleBean("controller");
		ExtLibUtil.getRequestScope().put("sampleBeanInstance", controllerSample);
		System.out.println("Creating component tree");
		root = (UIViewRootEx) super.createView(arg0, arg1);
		System.out.println("Created component tree");
		ExtLibUtil.getViewScope().put("sampleBeanInstance", controllerSample);
		ExtLibUtil.getRequestScope().remove("sampleBeanInstance");
		return root;
	}

}
