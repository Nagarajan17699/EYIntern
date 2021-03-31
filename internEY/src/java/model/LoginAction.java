package model;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.LoginService;
import service.LoginServiceImpl;

public class LoginAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String uname=request.getParameter("uname");
	String upass=request.getParameter("upass");
	Properties prop=(Properties)request.getServletContext().getAttribute("properties");
	HttpSession session=request.getSession();
        
	LoginService loginService=LoginServiceImpl.getLoginServiceImpl(prop);
	if(loginService.checkUser(uname, upass)) {
		          System.out.println(uname+" "+upass);
		if(loginService.checkFlag(uname)) {
			
			session.setAttribute("uname", uname);
			loginService.updateFlag(uname, 1);
			return "login.success";
		}
		else {
			
			return "login.already";
		}
	}
	else {
		return "login.failure";
	}
}
}
