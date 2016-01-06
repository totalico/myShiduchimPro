package four.client;

import four.PojoEntities.UserPojo;
import four.shared.FieldVerifier;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Tester implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	
	
	
	
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	private final userRegAsync userRegAsync = GWT
			.create(userReg.class);
	
	public		 String divName= "nameFieldContainer"; 		
	private		 PasswordTextBox passField ;
	private 	 TextBox nameField;
	private 	 Label errorLabel;
	private    	Button sendButton; 
	public static DboxFour registUser;
	/**
	 * 02-5386089
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		final Label regLabel= new Label("regist here!");

		regLabel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
											//התחבר
		
		sendButton = new Button("Connect...");
		
		passField = new PasswordTextBox();
		passField.setText("");
		passField.setMaxLength(12);
		
		nameField = new TextBox();
		
		final VerticalPanel vPanel = new VerticalPanel();
		nameField.setText("Please enter your user name");
		 errorLabel = new Label();
		
		vPanel.add(nameField);
		vPanel.add(passField);
		vPanel.add(sendButton);
		vPanel.add(errorLabel);
		
		regLabel.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
			
				
				 registUser = DboxFour.getDBoxFourSing();
				RootPanel.get("register").add(registUser);
//				Window.alert("Works ");
				}
			
		});
		
		
		// We can add style names to widgets
		sendButton.addStyleDependentName("sendButton");
		vPanel.addStyleName("vPanel");
		nameField.addStyleDependentName ("nameField");
		passField.addStyleDependentName ("passField");
		nameField.setFocus(true);

		// Add the nameField and sendButton to the RootPanel
		// Use RootPanel.get() to get the entire body element
		
		RootPanel.get(divName).add(vPanel);
		RootPanel.get("register").add(regLabel);

		// Focus the cursor on the name field when the app loads
		nameField.setFocus(true);
		nameField.selectAll();
	
		sendButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				logOn();
			}
		});
		
		nameField.addKeyUpHandler(new KeyUpHandler() {
			
			@Override
			public void onKeyUp(KeyUpEvent event) {
				if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) 
					logOn();		
				
			}
		});
				
			
			
	}
	
	
	public void logOn (){
				
		sendButton.setEnabled(false);
		
		if (!FieldVerifier.isValidName(nameField.getText())){
			errorLabel.setText("Opppss...   no input...  ");
			return;
		}
		
		userRegAsync.loggon(nameField.getText(), passField.getText() , new AsyncCallback<UserPojo>() {			
		
			
			@Override
			public void onSuccess(UserPojo resultUser) {
				
				// the label
				errorLabel.setText("Error from server. not from User");
				sendButton.setEnabled(true);
//				Directed to user workBench
				userWorkBench wwb= new userWorkBench(resultUser);
				
			}
			
			@Override
			public void onFailure(Throwable caught) {				
				// Create the Alert box
				//החיבור לשרת נכשל. בדוק חיבורי אינטרנט
			Window.alert("Connection has been failure. check your internet connection.");
			sendButton.setEnabled(true);
			}
		
		});
		
		
		
	}
	
	
	
}
