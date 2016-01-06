package four.server;


import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.tools.ant.types.CommandlineJava.SysProperties;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import four.Add2db.Querries;
import four.Add2db.persist2db;
import four.Entities.User;
import four.PojoEntities.UserPojo;
import four.client.userReg;
import four.shared.FieldVerifier;


@SuppressWarnings("serial")
public class userRegImpl extends RemoteServiceServlet implements userReg{
	
//	public static Logger log = new Logger ("serverLogger");
	
	public boolean isUserExist(String str) {

		List<User> uList =Querries.getUseryBy("userName", str);
		if (uList.isEmpty())
		return false;
		else return true;
	}
	
	public String addUser (UserPojo pUser){

		Date date = new Date();
		
		final String ip = getThreadLocalRequest().getRemoteAddr();

		User user=new User(pUser);
		
		if (isUserExist(user.getUserName())){
			return "The user name is occupied. try another one.";
		}
		
		user.setUserip(ip);
		user.setDateRegist(date.toString());

		/*
		 * 
		 * 			This section is suppose to connect with gMail server 
		 * 			and send a request from Admin to verifying.
		 * 			
		 * 	        @ boolean sendToAdmin (user[or userPojo]){
		 * 				
		 * 		// do somthing here....
		 * 
		 * 			return rtue or false
		 * 				}
		 * 
		 */
	
		
try {
	persist2db.add2db(user);
	persist2db.closeConnection();
//	log.info ("Creating the user : "+user.getUserName()+" and strart persist to DB");
} 
catch (Exception e) {
	System.out.println ("Problem with the Provider JPA");
	e.printStackTrace();
//	log.fatal("Problem with the Provider JPA");
}
		
		return "Thank you "+user.getUserName()+" , you have been rgistred!   "
				+ "your ID is : "+user.getUser_id();
//		log.info ("Creating the user : "+user.getUserName()+" and Finished persist to DB");

	}

	
	// TODO user can Logg!!!

	public UserPojo loggon (String uName, String uPass){

		try {
	
			List<User> uList;
	
	
	// check if put User name or password
	
	if(FieldVerifier.isMailOrUserName(uName)){
		uList=Querries.getUseryBy("eMail", uName);		
	}
	else{
		 uList=Querries.getUseryBy("userName", uName);
	}

	if(uList.isEmpty()) return null;

	
	
	
	System.out.println("Start checking information.");
	
	if (uList.get(0).getPassword().contentEquals(uPass)){
		
		UserPojo uPoj ;

		uList.get(0).setDateLastLoggin(new Date().toString());
			return uPoj= new UserPojo(uList.get(0));
		
			
		}
	
	else {
		System.out.print("Sorry. probably you forgot your password. try again.");
		return null;
		}

		}
		
		catch (Exception e){	
			System.out.println("Problem. cant check the Userr, but it got.");
			e.printStackTrace();
			System.out.println("Internal failore!");
			return null;
	
		}
	}
	
	
}


