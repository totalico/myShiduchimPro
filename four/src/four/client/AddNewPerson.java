package four.client;

import java.util.ArrayList;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.VerticalSplitPanel;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.SimpleCheckBox;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.NumberLabel;
import com.google.gwt.user.client.ui.LongBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

import four.Entities.personBer;
import four.PojoEntities.PersonBerPOJO;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.sun.java.swing.plaf.windows.resources.windows;

public class AddNewPerson extends Composite {


	static ArrayList<AddNewPersonBer> anPW = new ArrayList<>(); 
	 int PBIndex = 0;
	
	static ArrayList<AddNewBrother> anBro = new ArrayList<>(); 
	int ABIndex = 0 ; 
	
	private static VerticalPanel verticalPanel_1;
	private static VerticalPanel verticalPanelBrothers;
	
	public AddNewPerson() {
		
		DecoratedTabPanel decoratedTabPanel = new DecoratedTabPanel();
		initWidget(decoratedTabPanel);
		decoratedTabPanel.setSize("593px", "388px");
		
		Grid grid = new Grid(12, 4);
		decoratedTabPanel.add(grid, "Personal details", false);
		grid.setSize("590px", "296px");
		
		TextBox textBox_1 = new TextBox();
		grid.setWidget(0, 0, textBox_1);
		
		Label label_1 = new Label("\u05E9\u05DD \u05DE\u05E9\u05E4\u05D7\u05D4");
		grid.setWidget(0, 1, label_1);
		
		TextBox textBox = new TextBox();
		grid.setWidget(0, 2, textBox);
		
		Label label = new Label("\u05E9\u05DD \u05E4\u05E8\u05D8\u05D9");
		label.setWordWrap(false);
		grid.setWidget(0, 3, label);
		grid.getCellFormatter().setHorizontalAlignment(0, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setVerticalAlignment(0, 3, HasVerticalAlignment.ALIGN_MIDDLE);
		grid.getCellFormatter().setVerticalAlignment(0, 2, HasVerticalAlignment.ALIGN_MIDDLE);
		grid.getCellFormatter().setHorizontalAlignment(0, 2, HasHorizontalAlignment.ALIGN_CENTER);
		
		TextBox textBox_3 = new TextBox();
		grid.setWidget(1, 0, textBox_3);
		
		Label label_3 = new Label("\u05DB\u05EA\u05D5\u05D1\u05EA");
		grid.setWidget(1, 1, label_3);
		
		TextBox textBox_2 = new TextBox();
		grid.setWidget(1, 2, textBox_2);
		
		Label label_2 = new Label("\u05E2\u05D9\u05E8");
		grid.setWidget(1, 3, label_2);
		grid.getCellFormatter().setHorizontalAlignment(1, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setVerticalAlignment(1, 3, HasVerticalAlignment.ALIGN_MIDDLE);
		grid.getCellFormatter().setVerticalAlignment(1, 1, HasVerticalAlignment.ALIGN_MIDDLE);
		grid.getCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(1, 2, HasHorizontalAlignment.ALIGN_CENTER);
		
		TextBox textBox_4 = new TextBox();
		grid.setWidget(2, 0, textBox_4);
		
		Label label_5 = new Label("\u05DE\u05E7\u05D5\u05DD \u05EA\u05E2\u05E1\u05D5\u05E7\u05D4 \\ \u05DC\u05D9\u05DE\u05D5\u05D3\u05D9\u05DD");
		grid.setWidget(2, 1, label_5);
		
		ListBox comboBox = new ListBox();
		grid.setWidget(2, 2, comboBox);
		comboBox.setWidth("100%");
		
		Label label_4 = new Label("\u05EA\u05E2\u05E1\u05D5\u05E7\u05D4");
		grid.setWidget(2, 3, label_4);
		grid.getCellFormatter().setHorizontalAlignment(2, 0, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(2, 3, HasHorizontalAlignment.ALIGN_CENTER);
		
		TextBox textBox_5 = new TextBox();
		grid.setWidget(3, 0, textBox_5);
		
		Label label_9 = new Label("\u05D8\u05DC\u05E4\u05D5\u05DF \u05DC\u05E7\u05E9\u05E8");
		grid.setWidget(3, 1, label_9);
		
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		grid.setWidget(3, 2, horizontalPanel);
		
		RadioButton radioButton_1 = new RadioButton("new name", "\u05E0\u05E7\u05D1\u05D4");
		horizontalPanel.add(radioButton_1);
		
		RadioButton radioButton = new RadioButton("new name", "\u05D6\u05DB\u05E8");
		horizontalPanel.add(radioButton);
		
		Label label_6 = new Label("\u05DE\u05D9\u05DF");
		grid.setWidget(3, 3, label_6);
		
		IntegerBox integerBox_1 = new IntegerBox();
		grid.setWidget(4, 0, integerBox_1);
		
		Label label_17 = new Label("\u05D2\u05D9\u05DC");
		grid.setWidget(4, 1, label_17);
		
		ListBox comboBox_2 = new ListBox();
		grid.setWidget(4, 2, comboBox_2);
		comboBox_2.setWidth("100%");
		
		Label label_7 = new Label("\u05D4\u05E9\u05E7\u05E4\u05D4");
		grid.setWidget(4, 3, label_7);
		
		ListBox comboBox_10 = new ListBox();
		grid.setWidget(5, 0, comboBox_10);
		comboBox_10.setWidth("100%");
		
		Label label_21 = new Label("\u05DE\u05D5\u05E6\u05D0");
		grid.setWidget(5, 1, label_21);
		
		ListBox comboBox_3 = new ListBox();
		grid.setWidget(5, 2, comboBox_3);
		comboBox_3.setWidth("100%");
		
		Label label_8 = new Label("\u05D7\u05DB\u05DE\u05D4");
		grid.setWidget(5, 3, label_8);
		
		ListBox comboBox_4 = new ListBox();
		grid.setWidget(6, 2, comboBox_4);
		comboBox_4.setWidth("100%");
		
		Label label_10 = new Label("\u05E8\u05E6\u05D9\u05E0\u05D5\u05EA");
		grid.setWidget(6, 3, label_10);
		
		ListBox comboBox_5 = new ListBox();
		grid.setWidget(7, 2, comboBox_5);
		comboBox_5.setWidth("100%");
		
		Label label_11 = new Label("\u05D6\u05E8\u05D9\u05DE\u05D4 \u05D1\u05E9\u05D9\u05D7\u05D4");
		grid.setWidget(7, 3, label_11);
		
		TextBox textBox_6 = new TextBox();
		grid.setWidget(8, 0, textBox_6);
		
		Label label_14 = new Label("\u05E9\u05DD\\\u05E1\u05D5\u05D2");
		grid.setWidget(8, 1, label_14);
		
		CheckBox checkBox = new CheckBox("\u05D9\u05E9?");
		grid.setWidget(8, 2, checkBox);
		
		Label label_13 = new Label("\u05DE\u05D7\u05DC\u05D4");
		grid.setWidget(8, 3, label_13);
		
		TextArea textArea = new TextArea();
		grid.setWidget(9, 0, textArea);
		
		Label label_19 = new Label("\u05D4\u05E2\u05E8\u05D5\u05EA \u05DB\u05DC\u05DC\u05D9");
		grid.setWidget(9, 1, label_19);
		
		SimpleCheckBox simpleCheckBox = new SimpleCheckBox();
		grid.setWidget(9, 2, simpleCheckBox);
		
		Label label_18 = new Label("\u05DE\u05E2\u05E9\u05DF");
		grid.setWidget(9, 3, label_18);
		
		IntegerBox integerBox_2 = new IntegerBox();
		grid.setWidget(10, 2, integerBox_2);
		
		Label label_20 = new Label("\u05EA\u05DE\u05D9\u05DB\u05D4 \u05DB\u05E1\u05E4\u05D9\u05EA");
		grid.setWidget(10, 3, label_20);
		
		TextBox textBox_7 = new TextBox();
		grid.setWidget(11, 0, textBox_7);
		
		Label label_12 = new Label("\u05DE\u05E1\u05E4\u05E8 \u05D9\u05DC\u05D3\u05D9\u05DD");
		grid.setWidget(11, 1, label_12);
		
		ListBox comboBox_1 = new ListBox();
		grid.setWidget(11, 2, comboBox_1);
		comboBox_1.setWidth("100%");
		
		Label lblNewLabel = new Label("\u05DE\u05E6\u05D1 \u05DE\u05E9\u05E4\u05D7\u05EA\u05D9");
		grid.setWidget(11, 3, lblNewLabel);
		grid.getCellFormatter().setHorizontalAlignment(3, 2, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(7, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(6, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(5, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(4, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(3, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(11, 0, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(8, 0, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(4, 0, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(8, 2, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(9, 2, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(8, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(9, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(0, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(1, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(2, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(3, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(4, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(5, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(6, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(7, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(8, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(9, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(10, 1, HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(11, 1, HasHorizontalAlignment.ALIGN_CENTER);
		
		VerticalPanel verticalPanel = new VerticalPanel();
		decoratedTabPanel.add(verticalPanel, "Look details", false);
		verticalPanel.setSize("5cm", "3cm");
		
		Grid grid_1 = new Grid(10, 4);
		verticalPanel.add(grid_1);
		grid_1.setSize("530px", "356px");
		
		ListBox comboBox_7 = new ListBox();
		grid_1.setWidget(0, 0, comboBox_7);
		comboBox_7.setWidth("100%");
		
		Label lblNewLabel_5 = new Label("\u05E6\u05D1\u05E2 \u05E2\u05D5\u05E8");
		grid_1.setWidget(0, 1, lblNewLabel_5);
		
		ListBox comboBox_6 = new ListBox();
		grid_1.setWidget(0, 2, comboBox_6);
		comboBox_6.setWidth("100%");
		
		Label label_15 = new Label("\u05DE\u05E8\u05D0\u05D4 \u05DB\u05DC\u05DC\u05D9");
		grid_1.setWidget(0, 3, label_15);
		
		TextBox textBox_8 = new TextBox();
		grid_1.setWidget(1, 0, textBox_8);
		
		IntegerBox integerBox = new IntegerBox();
		grid_1.setWidget(1, 2, integerBox);
		
		Label label_16 = new Label("\u05D2\u05D5\u05D1\u05D4");
		grid_1.setWidget(1, 3, label_16);
		
		ListBox comboBox_8 = new ListBox();
		grid_1.setWidget(2, 2, comboBox_8);
		comboBox_8.setWidth("100%");
		
		Label lblNewLabel_3 = new Label("\u05DE\u05D1\u05E0\u05D4 \u05D2\u05D5\u05E3");
		grid_1.setWidget(2, 3, lblNewLabel_3);
		
		ListBox comboBox_9 = new ListBox();
		grid_1.setWidget(3, 2, comboBox_9);
		comboBox_9.setWidth("100%");
		
		Label lblNewLabel_4 = new Label("\u05E6\u05D5\u05E8\u05EA \u05DC\u05D1\u05D5\u05E9");
		grid_1.setWidget(3, 3, lblNewLabel_4);
		lblNewLabel_4.setWidth("85px");
		grid_1.getCellFormatter().setHorizontalAlignment(1, 2, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(4, 2, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(5, 2, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(6, 2, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(7, 2, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(8, 2, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(9, 2, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(0, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(1, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(2, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(3, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(4, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(5, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(6, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(7, 3, HasHorizontalAlignment.ALIGN_CENTER);
		grid_1.getCellFormatter().setHorizontalAlignment(8, 3, HasHorizontalAlignment.ALIGN_CENTER);
		
		FileUpload fileUpload = new FileUpload();
		grid_1.setWidget(5, 0, fileUpload);
		
		Label label_22 = new Label("\u05EA\u05DE\u05D5\u05E0\u05D4");
		grid_1.setWidget(5, 1, label_22);
		
		 verticalPanel_1 = new VerticalPanel();
		decoratedTabPanel.add(verticalPanel_1, "Refrences", false);
		verticalPanel_1.setSize("572px", "117px");
		
		Button button_1 = new Button("\u05D4\u05D5\u05E1\u05E3 \u05D0\u05D9\u05E9 \u05DC\u05D1\u05E8\u05D5\u05E8\u05D9\u05DD");
		verticalPanel_1.add(button_1);
		

		Button btnAddBro = new Button("Add brother");
		 verticalPanelBrothers = new VerticalPanel();
		verticalPanelBrothers.add(btnAddBro);
		btnAddBro.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
			
				clickAddBrother();
			}
		});
		decoratedTabPanel.add(verticalPanelBrothers, "Brothers", false);
		verticalPanelBrothers.setSize("5cm", "3cm");
		
		button_1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				clickAddPersonBer();

			}
		});
		
	}
	
	void clickAddPersonBer (){
	
		AddNewPersonBer newPB = new AddNewPersonBer(GetPersonBerInd());
//		newPB.setVisible(true);
		verticalPanel_1.add(newPB);
		anPW.add(newPB);
		}
	
	void clickAddBrother (){
		
		AddNewBrother nb = new AddNewBrother(GetBrotherInd());
//		nb.setVisible(true);
		verticalPanelBrothers.add(nb);
		anBro.add(nb);
	}
	
	/**
	 * This method connected to remove from each line 
	 * of the object "personBer", by calling from personBer
	 * and removed by index of the line. 
	 * 
	 * @return current "personBer" value to delete
	 */
	 int GetPersonBerInd(){
		return this.PBIndex++;
	}
	 
	 int GetBrotherInd(){
		 return this.ABIndex++;
	 }
	
	
	static void deleteMePB (int indx){
		verticalPanel_1.remove(anPW.get(indx));
		anPW.set(indx, null);
		Window.alert("deleting PersonBer no.# " + indx);
	}
	
	static void deleteMeBRO (int indx){
		verticalPanelBrothers.remove(anBro.get(indx));
		anBro.set(indx, null);
		Window.alert("deleting Brother no.# " + indx);
	}
	
	
	ArrayList<PersonBerPOJO> submittPerson(){
		
		ArrayList<PersonBerPOJO> pbArr = new ArrayList<>();
		
		for (AddNewPersonBer a : anPW) {

			
			if (a.getPhoneNum_Con() == "" ||
					a.getNameAndFamTB_Con() == ""){
			
				Window.alert("There is missing deatail of PersonBer,"
						+ "plz insert or delete if is unused.");
				
			}
			
			//sets values respectively	

			PersonBerPOJO pb = new PersonBerPOJO( a.getNameAndFamTB_Con()
				,a.getPhoneNum_Con(),a.getComboBoxChoise());
			
			pbArr.add(pb);
			
		}
		
		return pbArr;
		
	}
}
