package four.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.SimpleCheckBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sun.java.swing.plaf.windows.resources.windows;




public class AddNewBrother extends Composite {
	
	int id;

	VerticalPanel mainPanel = new VerticalPanel();
	VerticalPanel secPanel = new VerticalPanel();
	
	FlexTable grid;
	TextBox textBoxNameBrother ;

	FlexTable flexTablmerry;
	FlexTable flexTableBetch;
	
	Label lblMehutanim;
	Label lblMehutanimCity;
	TextBox marryTo ;
	TextBox mehutaminCity;
	TextBox textBox_2;
	private TextBox textBox;
	private TextBox textBox_1;
	
	private Label lblNewLabelImple;
	private Label lblNewLabelIImpleName;
	private ListBox comboBox;
	private Label label_1;
	private IntegerBox integerBox;
	private ToggleButton toggleButton;
	
	public AddNewBrother(final int id) {
		
		this.id=id;
		
		grid = new FlexTable();
		 grid.setSize("545px", "90px");

		secPanel.add(grid);
 
		 mainPanel.add(secPanel);
		 initWidget(secPanel);

		 
		 
		 toggleButton = new ToggleButton("\u05E0\u05E9\u05D5\u05D9?");
		 grid.setWidget(0, 0, toggleButton);
		 
		 toggleButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
//				Window.alert("openning on-click.");
				
				if (toggleButton.isDown()){

					addMerryBro();
			}
				else{
					secPanel.remove(1);// the Merrry presp.
				};
			}
		});
		 
		
		 integerBox = new IntegerBox();
		 grid.setWidget(0, 2, integerBox);
		 
		 label_1 = new Label("\u05D2\u05D9\u05DC");
		 grid.setWidget(0, 3, label_1);
		
		 textBoxNameBrother = new TextBox();
		grid.setWidget(0, 4, textBoxNameBrother);
		
		Label label = new Label("\u05E9\u05DD \u05D5\u05DE\u05E9\u05E4\u05D7\u05D4");
		grid.setWidget(0, 5, label);
		grid.getCellFormatter().setHorizontalAlignment(0, 1, HasHorizontalAlignment.ALIGN_CENTER);

		Button remove=new Button("Remove");
		grid.setWidget(0, 6, remove);
		
		remove.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				AddNewPerson.deleteMeBRO(id);
			}
		});

	
		addBetchBro();				
	
	}
	
	
	private void addMerryBro() {

		Window.alert ("Im here!");
		
		flexTablmerry = new FlexTable();
		
		textBox_1 = new TextBox();
		flexTablmerry.setWidget(0, 0, textBox_1);
		
		lblMehutanimCity = new Label("\u05E2\u05D9\u05E8");
		flexTablmerry.setWidget(0, 1, lblMehutanimCity);
		
		textBox_2 = new TextBox();
		flexTablmerry.setWidget(0, 2, textBox_2);
		
		lblMehutanim = new Label("\u05E0\u05E9\u05D5\u05D9 \u05DC");
		flexTablmerry.setWidget(0, 3, lblMehutanim);
		
		secPanel.add(flexTablmerry);
		
	}
	
	
	private void addBetchBro() {
		
		grid.setSize("461px", "60px");
		
		textBox = new TextBox();
		grid.setWidget(1, 0, textBox);
		
		lblNewLabelIImpleName = new Label("\u05E9\u05DD \u05DE\u05E7\u05D5\u05DD \u05EA\u05E2\u05E1\u05D5\u05E7\u05D4");
		grid.setWidget(1, 1, lblNewLabelIImpleName);
		
		comboBox = new ListBox();
		comboBox.addItem("\u05DC\u05D5\u05DE\u05D3/\u05EA \u05D1\u05D9\u05E9\u05D9\u05D1\u05D4/\u05E1\u05DE\u05D9\u05E0\u05E8");
		comboBox.addItem("\u05DC\u05D5\u05DE\u05D3/\u05EA \u05EA\u05D5\u05D0\u05E8");
		comboBox.addItem("\u05E2\u05D5\u05D1\u05D3");
		grid.setWidget(1, 2, comboBox);
		
		lblNewLabelImple = new Label("\u05EA\u05E2\u05E1\u05D5\u05E7\u05D4");
		grid.setWidget(1, 3, lblNewLabelImple);

	}
	

	
	 
}
