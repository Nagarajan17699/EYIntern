package model;

import java.util.Set;

public interface UserDAO {
	public UserDTO getUserDTO(int uid);
	public Set<UserDTO> getAllUserDTO();
	public int deleteUser(int uid);
	public int updateUser(UserDTO userDTO);
	public int insertUser(UserDTO userDTO);
	public UserDTO getUserByName(String uname);
}
