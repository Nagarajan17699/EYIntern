package service;

import model.UserDTO;

public interface LoginService {
	public boolean checkUser(String uname,String upass);
	public boolean checkFlag(String uname);
	public int updateFlag(String uname,int flag);
	public int registerUser(UserDTO userDTO);
}
