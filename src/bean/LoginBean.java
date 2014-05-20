package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;



import servicios.LoginService;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean {
	private String email;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	


	public String login() {
		LoginService servicio = new LoginService();
		if (servicio.loginUsuario(this.getEmail(), this.getPassword()) != null) {
			return "exito";
		} else {
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage message = new FacesMessage("Email y/o Password Invalido");
			context.addMessage("loginForm", message);
			return "fallo";
		}
	}
	
//	public void logout() {
//		ExternalContext ctx = FacesContext.getCurrentInstance().getExternalContext();
//			  String ctxPath = ((ServletContext) ctx.getContext()).getContextPath();
//			  try {
//			    ((HttpSession) ctx.getSession(false)).invalidate();
//			    ctx.redirect(ctxPath + "/index.jsf");
//			  } catch (IOException ex) {
//			    ex.printStackTrace();
//			  }
//	}

}
