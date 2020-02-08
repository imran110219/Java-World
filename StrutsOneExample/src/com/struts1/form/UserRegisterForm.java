package com.struts1.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UserRegisterForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private String phone;

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (firstName == null || firstName.length() < 1) {
			errors.add("firstName", new ActionMessage(
					"error.firstName.required"));

		}
		if (lastName == null || lastName.length() < 1) {
			errors.add("lastName", new ActionMessage("error.lastName.required"));

		}
		if (userName == null || userName.length() < 1) {
			errors.add("userName", new ActionMessage("error.userName.required"));

		}
		if (password == null || password.length() < 1) {
			errors.add("password", new ActionMessage("error.password.required"));

		}
		if (email == null || email.length() < 1) {
			errors.add("email", new ActionMessage("error.email.required"));

		}
		if (phone == null || phone.length() < 1) {
			errors.add("phone", new ActionMessage("error.phone.required"));

		}
		return errors;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
