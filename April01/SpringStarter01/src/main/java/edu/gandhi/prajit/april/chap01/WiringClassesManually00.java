package edu.gandhi.prajit.april.chap01;

import edu.gandhi.prajit.april.chap01.service.UserService;
import edu.gandhi.prajit.april.chap01.service.impl.UserServiceImpl;
import edu.gandhi.prajit.april.data.model.User00;

public class WiringClassesManually00 {
	public static void main(String[] args) throws Exception {
		final UserService userService=new UserServiceImpl();
		userService.getListOfUser().forEach((User00 userTmp)->{System.out.println(userTmp);});
	}
}