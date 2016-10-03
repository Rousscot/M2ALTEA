package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import beans.Utilisateur;
import form.LoginForm;
import metier.GuestUsers;

public class LoginAction extends Action {

	public ActionForward execute(ActionMapping map, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LoginForm lf = (LoginForm) form;
		GuestUsers gu = GuestUsers.getInstance();
		Utilisateur u = gu.loadUser(lf.getLogin(), lf.getPass());
		if (u != null) {
			lf.setUser(u);
			return map.findForward("bienvenue");
		} else {
			return map.findForward("notAutorised");
		}
	}

}
