package four.client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.CalendarUtil;

import four.PojoEntities.UserPojo;

public class userWorkBench extends Composite {

	FlexTable fTable; 
	Button addPerson;
	Button saerchPerson = new Button("Search person");
	Button FindMatch = new Button("Find Match");
	Button MyAccount = new Button("My Account");
	Label userNameHello = new Label(""); 
	Label date = new Label("");
	
	public userWorkBench(UserPojo user ) {

	
		
//		CalendarUtil c= CalendarUtil.copyDate(date); 
		
		userNameHello.setText("Hello Dear " + user.getName());
	
	
		
		
		RootPanel.get("register").clear();
		// Main Widget ->
		RootPanel.get("nameFieldContainer").clear();
		RootPanel.get().clear();
		
		fTable = new FlexTable();

		
		saerchPerson = new Button("Search person");
		FindMatch = new Button("Find Match");
		MyAccount = new Button("My Account");
		addPerson = new Button("Add person");
		
		fTable.setWidget(0, 0, addPerson);
		fTable.setWidget(0, 1, saerchPerson);
		fTable.setWidget(0, 2, FindMatch);
		fTable.setWidget(0, 3, MyAccount);
	

		RootPanel.get("nameFieldContainer").add(fTable);
		RootPanel.get("register").add(userNameHello);
		
addPerson.addClickHandler(new ClickHandler() {
			
	
			@Override
			public void onClick(ClickEvent event) {

//				RootPanel.get("nameFieldContainer").clear();
				AddNewPerson aNewPer = new AddNewPerson();
				RootPanel.get("nameFieldContainer").add(aNewPer);
				
			}
		});
	}
	
	

}
