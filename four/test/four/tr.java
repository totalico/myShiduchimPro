package four;

import java.util.Calendar;

import four.Add2db.persist2db;
import four.Entities.User;

public class tr {

		public static void main(String[] args) {

	User user=new User();
	user.setUserName("totalicoZZZ");
	user.seteMail("totalico#gmail.com");
	user.setDateRegist(Calendar.getInstance().toString());
			
//			TODO check if the user exist

//			return "pUser name " + pUser.getName()+" user : "+user.getUserName();
			

			// Esle do registration::	
			
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
		
			
		
			persist2db.add2db(user);
//			persist2db.closeConnection();
			System.out.print ("here is user "+user.getUserName()+" persist to DB");
		}

	}


