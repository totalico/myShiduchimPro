package four.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import four.PojoEntities.UserPojo;

public interface userRegAsync {

	void addUser (UserPojo up , AsyncCallback<String> callback);
	// TODO user can Logg!!!
	void loggon (String uName, String uPass ,  AsyncCallback<UserPojo> callback);

}
