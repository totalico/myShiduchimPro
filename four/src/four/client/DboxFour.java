package four.client;


import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import four.PojoEntities.UserPojo;
import four.shared.FieldVerifier;

/**
 * 
 * 	This class provide user registration 
 * 	for new users. it suppose to be singelton
 * 	pattern, so one instance for each click.
 *   
 * @author T.Sheinfeld
 * @see www.totali.co
 */


public class DboxFour extends DialogBox {

	// POJO user
	private UserPojo user=new UserPojo();
	

	private TextBox txbEmail ;
	private Label lblUser;
	private TextBox txbUserName;
	private PasswordTextBox passwordTextBox;
	private PasswordTextBox passwordTextBox_1;
	private Button Ok_button;
	static private String massege="";
	static private Label lblError = new Label(massege);
	 
	public final userRegAsync gsa= GWT.create(userReg.class);
	/**
	 * This checks the all fields praperly used.<br><br>
	 * <code>txb.gettxt()!=""</code><br>
	 * 
	 * @see www.totalico.blog.google.com/?pbtr
	 * @return true if the all fields are filled properly.
	 * @author Tal Sheinfeld
	 */
	private boolean isFieldsFull (){
		
		if ( FieldVerifier.isValidName(txbUserName.getText()) &&
				FieldVerifier.isMailOrUserName(txbEmail.getText()))
			return true;
		else return false;
		
	}
	
	
	/**
	 * 		Singleton :
	 */
	private static DboxFour sing = new DboxFour ();
	public static DboxFour getDBoxFourSing (){
		return sing;
	}
	
	private DboxFour() {

		
		setGlassEnabled(true);
		setAutoHideEnabled(true);
	
		setText("testTotalico");
		setAnimationEnabled(true);
		
		setHTML("Register new user account");
		
		Grid grid = new Grid(6, 2);
		setWidget(grid);
		grid.setSize("366px", "280px");
		
		 txbUserName = new TextBox();
		grid.setWidget(0, 0, txbUserName);
		txbUserName.setSize("157", "32");
		
		 lblUser = new Label("\u05E9\u05DD \u05DE\u05E9\u05EA\u05DE\u05E9");
		grid.setWidget(0, 1, lblUser);
		
		 txbEmail = new TextBox();
		grid.setWidget(1, 0, txbEmail);
		
		Label lblEmail = new Label("eMail");
		grid.setWidget(1, 1, lblEmail);
		
		 passwordTextBox = new PasswordTextBox();
		grid.setWidget(2, 0, passwordTextBox);
		
		Label lblPassword = new Label("\u05E1\u05D9\u05E1\u05DE\u05D0");
		grid.setWidget(2, 1, lblPassword);
		
		 passwordTextBox_1 = new PasswordTextBox();
		grid.setWidget(3, 0, passwordTextBox_1);
		
		Label lblPasswordAgian = new Label("\u05E1\u05D9\u05E1\u05DE\u05D0 \u05E9\u05E0\u05D9\u05EA");
		grid.setWidget(3, 1, lblPasswordAgian);
		
		 Ok_button = new Button("\u05D0\u05D9\u05E9\u05D5\u05E8");
		grid.setWidget(4, 0, Ok_button);
		Ok_button.setWidth("100%");
		
		
		// verified details and sending to server
		Ok_button.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method connect to server via RPC
				createUser();
				
			}
		});
		
		grid.getCellFormatter().setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(2, 0, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(0, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(2, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(3, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(1, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setVerticalAlignment(0, 0, HasVerticalAlignment.ALIGN_MIDDLE);
		grid.getCellFormatter().setVerticalAlignment(2, 0, HasVerticalAlignment.ALIGN_MIDDLE);
		
		
		
		lblError.addStyleName("errorLabel");
		
		lblError.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblError.setDirectionEstimator(false);
		grid.setWidget(5, 0, lblError);
		grid.getCellFormatter().setHorizontalAlignment(5, 0, HasHorizontalAlignment.ALIGN_CENTER);
	
	}
	
	//	This func DIDNT makes any checking!!!
	
	private void createUser (){
		
		user.setName(txbUserName.getText());
		user.seteMail(txbEmail.getText());
		user.setPassword(passwordTextBox.getText());
		
		 Ok_button.setEnabled(false);
		
		 if(!FieldVerifier.isValidPasswordsMatch(passwordTextBox.getText(), passwordTextBox_1.getText()))
		 	{				
			 lblError.setText("The passwords doesnt match.");
			 passwordTextBox.setText("");
			 passwordTextBox_1.setText("");
			 passwordTextBox.setFocus(true);
			 Ok_button.setEnabled(true);
			 return;
		 	}
		 if (!isFieldsFull()){
			 lblError.setText("The user name or e-mail incorrect");
			 passwordTextBox.setText("");
			 passwordTextBox_1.setText("");
			 passwordTextBox.setFocus(true);
			 Ok_button.setEnabled(true);
			 return;
		 }
		 
		 
		
			
			gsa.addUser(user, new AsyncCallback<String>() {
				    
					
					@Override
					public void onSuccess(String result) {

						lblError.setText(result);
						Window.alert("Welcom "+ txbUserName.getText()+"to Shiduchim project.");
						//TODO Automatic connection to workspace MQTT
						//TODO Verify before get access by the admin by MQTT

						//close window
						
						removeFromParent();
						 Ok_button.setEnabled(true);

						
					}
						
				    @Override
					
				    public void onFailure(Throwable caught) {

				    	lblError.setText("doesent work... Sorry!");
						Window.alert("Cannot connect to the server. please check your connection.");
						 Ok_button.setEnabled(true);
				    }
				});
	}

	@Override
	public void removeFromParent() {
		
		super.removeFromParent();
	}
}
