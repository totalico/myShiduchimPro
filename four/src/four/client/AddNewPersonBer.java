package four.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ListBox;

public class AddNewPersonBer extends Composite {
/**
 * serialNumInd is the ID of the obj.
 * 
 */
	int serialNumInd;
	
	TextBox phoneNumTB;
	ListBox comboBox;
	TextBox nameAndFamTB;
	Grid grid;
	Button removeMeBtn;
	
	public AddNewPersonBer(int ID) {
		
		serialNumInd = ID;
		
		 grid = new Grid(1, 7);
		initWidget(grid);
		grid.setHeight("74px");
		
		 phoneNumTB = new TextBox();//phoneNum
		grid.setWidget(0, 0, phoneNumTB);
		
		Label label_1 = new Label("\u05D8\u05DC\u05E4\u05D5\u05DF");
		grid.setWidget(0, 1, label_1);
		
		 comboBox = new ListBox();
		grid.setWidget(0, 2, comboBox);
		
		comboBox.addItem("Rabbi");
		comboBox.addItem("Teacher");
		comboBox.addItem("Friend");
		comboBox.addItem("Neghibore");

//		comboBox.setItemText(0, "Rabbi");
//		comboBox.setItemText(1, "Teacher");
//		comboBox.setItemText(2, "Friend");
		
		
		Label label = new Label("\u05E7\u05E9\u05E8 \u05DC\u05DE\u05D5\u05E2\u05DE\u05D3");
		grid.setWidget(0, 3, label);
		
		nameAndFamTB = new TextBox(); // name and family name
		grid.setWidget(0, 4, nameAndFamTB);
		
		Label lblNewLabel = new Label("\u05E9\u05DD \u05D5\u05DE\u05E9\u05E4\u05D7\u05D4");
		grid.setWidget(0, 5, lblNewLabel);
		
		 removeMeBtn =new Button("remove");

		 removeMeBtn.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				AddNewPerson.deleteMePB(serialNumInd);
			}
		});
		grid.setWidget(0, 6, removeMeBtn);
	}

	public String getPhoneNum_Con() {  // phoneNum is suppose to be an integer 
		return phoneNumTB.getText();	// but is converted in the constructor of
	}									//the personBer Entity.


	public int getComboBoxChoise() {
		return comboBox.getSelectedIndex();
	}


	public String getNameAndFamTB_Con() {
		return nameAndFamTB.getText();
	}

	

}
