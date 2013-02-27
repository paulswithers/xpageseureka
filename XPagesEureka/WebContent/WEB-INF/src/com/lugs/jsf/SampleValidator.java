package com.lugs.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class SampleValidator implements Validator {

	public SampleValidator() {

	}

	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String fullName = (String) value; // this is submittedValue
		System.out.println("Checking submitted value for input1 '" + fullName
				+ "' in Java Validator is more than 5 characters");
		// getValueBinding(value).getValue(FacesContext) gets value
		System.out.println("Value for input1 is " + component.getValueBinding("value").getValue(context));
		if (fullName.length() < 5) {
			String msgStr = "You must enter your FULL name, which will be more than 5 characters!";
			FacesMessage msgObj = new javax.faces.application.FacesMessage(
					javax.faces.application.FacesMessage.SEVERITY_ERROR, msgStr, msgStr);
			throw new ValidatorException(msgObj);
		}
	}
}
