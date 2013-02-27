package com.lugs.jsf;

import javax.faces.context.FacesContext;
import javax.faces.el.EvaluationException;
import javax.faces.el.VariableResolver;

public class ExampleVariableResolver extends VariableResolver {

	private final VariableResolver delegate;

	public ExampleVariableResolver(VariableResolver resolver) {
		delegate = resolver;
	}

	@Override
	public Object resolveVariable(FacesContext context, String name) throws EvaluationException {
		if ("showRow".equals(name)) {
			return true;
		}
		return delegate.resolveVariable(context, name);
	}

}
