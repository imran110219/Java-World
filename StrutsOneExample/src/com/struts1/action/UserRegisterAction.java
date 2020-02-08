package com.struts1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.struts1.dao.UserRegisterDAO;
import com.struts1.form.UserRegisterForm;

public class UserRegisterAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HttpSession ses = request.getSession(true);

		UserRegisterForm registerForm = (UserRegisterForm) form;
		String firstName = registerForm.getFirstName();
		String lastName = registerForm.getLastName();
		String userName = registerForm.getUserName();
		String password = registerForm.getPassword();
		String email = registerForm.getEmail();
		String phone = registerForm.getPhone();
		UserRegisterDAO dao = new UserRegisterDAO();
		dao.insertData(firstName, lastName, userName, password, email, phone);
		ses.setAttribute("firstName", firstName);
		ses.setAttribute("lastName", lastName);
		ses.setAttribute("userName", userName);
		ses.setAttribute("email", email);
		ses.setAttribute("phone", phone);
		if (firstName.equals("") || lastName.equals("") || userName.equals("")
				|| password.equals("") || email.equals("") || phone.equals("")) {
			return mapping.findForward("error");
		}
		return mapping.findForward("success");

	}
}
