package model;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingCartAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String shopid=request.getParameter("shopid");
	HttpSession session=request.getSession();
	Enumeration<String> e=request.getParameterNames();
	while(e.hasMoreElements()) {
		String name=e.nextElement();
		String value=request.getParameter(name);
		session.setAttribute(name, value);
	}
	
	return shopid;
}
}
