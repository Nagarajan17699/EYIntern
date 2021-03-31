package service;

import java.util.Properties;

import model.DBUtility;
import model.UserDAO;
import model.UserDAOImpl;
import model.UserDTO;

public class LoginServiceImpl implements LoginService,Cloneable{
	Properties prop;
	public LoginServiceImpl(Properties prop) {
		this.prop=prop;
	}
	private static LoginServiceImpl loginServiceImpl;
	
	public static LoginServiceImpl getLoginServiceImpl(Properties prop) {
		if(loginServiceImpl==null) {
			loginServiceImpl=new LoginServiceImpl(prop);
			return loginServiceImpl;
		}
		else {
			return loginServiceImpl.createClone();
		}
	}
	public LoginServiceImpl createClone() {
		try {
			return (LoginServiceImpl)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean checkUser(String uname, String upass) {
		UserDAO userDao=UserDAOImpl.getUserDAOImpl(prop);
		UserDTO userDTO =userDao.getUserByName(uname);
		
		if(userDTO!=null) {
			if(userDTO.getUpass().equalsIgnoreCase(upass)) {
				return true;
			}
			return false;
		}
		return false;
	}

	@Override
	public boolean checkFlag(String uname) {
		UserDAO userDao=UserDAOImpl.getUserDAOImpl(prop);
		UserDTO userDTO =userDao.getUserByName(uname);
		if(userDTO!=null) {
			if(userDTO.getFlag()==0) {
				return true;
			}
			return false;
		}
		return false;
	}

	@Override
	public int updateFlag(String uname, int flag) {
		UserDAO userDao=UserDAOImpl.getUserDAOImpl(prop);
		UserDTO userDTO =userDao.getUserByName(uname);
		if(userDTO!=null) {
			userDTO.setFlag(flag);
			return userDao.updateUser(userDTO);			
		}
		else {
			return 0;
		}
		
			
	}

	@Override
	public int registerUser(UserDTO userDTO) {
		UserDAO userDao=UserDAOImpl.getUserDAOImpl(prop);
		return userDao.insertUser(userDTO);
	}

}
