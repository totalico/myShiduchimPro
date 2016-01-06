package four.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import four.PojoEntities.UserPojo;

/**
 * The async counterpart of <code>GreetingService</code>.
 */


public interface GreetingServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;

}
