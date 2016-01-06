package four.shared;

import com.sun.xml.internal.ws.api.pipe.Tube;

/**
 * <p>
 * FieldVerifier validates that the name the user enters is valid.
 * </p>
 * <p>
 * This class is in the <code>shared</code> package because we use it in both
 * the client code and on the server. On the client, we verify that the name is
 * valid before sending an RPC request so the user doesn't have to wait for a
 * network round trip to get feedback. On the server, we verify that the name is
 * correct to ensure that the input is correct regardless of where the RPC
 * originates.
 * </p>
 * <p>
 * When creating a class that is used on both the client and the server, be sure
 * that all code is translatable and does not use native JavaScript. Code that
 * is not translatable (such as code that interacts with a database or the file
 * system) cannot be compiled into client-side JavaScript. Code that uses native
 * JavaScript (such as Widgets) cannot be run on the server.
 * </p>
 */
public class FieldVerifier {

	/**
	 * Verifies that the specified name is valid for our service.
	 * 
	 * In this example, we only require that the name is at least four
	 * characters. In your application, you can use more complex checks to ensure
	 * that usernames, passwords, email addresses, URLs, and other fields have the
	 * proper syntax.
	 * 
	 * @param name the name to validate
	 * @return true if valid, false if invalid
	 */
	public static boolean isValidName(String name) {
		if (name == "") 
			return false;
			else return true;
	}
	/**
	 * This method helps to realize if the
	 * string is user name or eMail.<br><br>
	 * <code>
	 * <blockquote>
	 * "totalico@gmail.com"
	 * </blockquote>
	 * </code>
	 * is true.
	 * 
	 * @author Tal sheinfeld
	 * @see www.myBlogInTheBigCity.co.ge
	 * @since version 3.0.7 to shiduchim project
	 */
	public static boolean isMailOrUserName (String str){
		
		if(str.contains("@") && str.contains(".")
				&& (str.indexOf("@") < str.indexOf(".")))
			return true;
		else return false;
	}
	
	public static boolean isValidPasswordsMatch(String pass1 , String pass2) {
		if(pass1.contentEquals(pass2))return true;
		else return false ;
	}
	

}
