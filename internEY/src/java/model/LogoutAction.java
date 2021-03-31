package model;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.LoginService;
import service.LoginServiceImpl;

public class LogoutAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	// TODO Auto-generated method stub
	HttpSession session=request.getSession();
	String uname=(String)session.getAttribute("uname");
	
	Properties prop=(Properties)request.getServletContext().getAttribute("properties");

	LoginService loginService=LoginServiceImpl.getLoginServiceImpl(prop);
	
	loginService.updateFlag(uname, 0);
        
	return "logout.success";
}
}
