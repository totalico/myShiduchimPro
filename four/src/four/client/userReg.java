package four.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import four.PojoEntities.UserPojo;

							
@RemoteServiceRelativePath("newuser")
public interface userReg extends RemoteService{
	
	String addUser (UserPojo up);

	//	return userPojo by callback
	UserPojo loggon (String uName, String uPass);
}
