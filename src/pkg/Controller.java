package pkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;

public class Controller {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private ChoiceBox<?> addDeleteChoiceBox;

	@FXML
	private ChoiceBox<?> typeChoiceBox;

	@FXML
	private Button accountsSubmitButton;

	@FXML
	private TreeView<?> accountListingTreeView;

	@FXML
	private TextField usernameTextField;

	@FXML
	private TextField bundlePartNameField;

	@FXML
	private TextField bundlePartNumberField;

	@FXML
	private TextField bundleCommissionField;

	@FXML
	private Button bundleSubmitButton;

	@FXML
	private TextField databaseDirectoryPath;

	@FXML
	private TextField invoicePartNumberField;

	@FXML
	private TextField invoicePartQuantityField;

	@FXML
	private Button addToInvoiceButton;

	@FXML
	private Button removeFromInvoiceButton;

	@FXML
	private Button finishInvoiceButton;

	@FXML
	private TextArea invoiceTextArea;

	@FXML
	private ChoiceBox<?> bundlePartChoiceBox;

	@FXML
	private ChoiceBox<?> itemsChoiceBox;

	@FXML
	private TextField itemWarehouseField;

	@FXML
	private TextField itemsPartNumberField;

	@FXML
	private TextField itemsMoveFileField;

	@FXML
	private Button itemsExecuteButton;

	@FXML
	private TextField warehouseNameField;

	@FXML
	private CheckBox vanCheckBox;

	@FXML
	private Button createWarehouseButton;

	@FXML
	private TextArea consoleTextArea;

	@FXML
	void initialize() {
		assert accountListingTreeView != null : "fx:id=\"accountListingTreeView\" was not injected: check your FXML file 'mainui.fxml'.";
		assert usernameTextField != null : "fx:id=\"usernameTextField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert bundlePartNameField != null : "fx:id=\"bundlePartNameField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert bundlePartNumberField != null : "fx:id=\"bundlePartNumberField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert bundleCommissionField != null : "fx:id=\"bundleCommissionField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert databaseDirectoryPath != null : "fx:id=\"databaseDirectoryPath\" was not injected: check your FXML file 'mainui.fxml'.";
		assert invoicePartNumberField != null : "fx:id=\"invoicePartNumberField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert invoicePartQuantityField != null : "fx:id=\"invoicePartQuantityField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert invoiceTextArea != null : "fx:id=\"invoiceTextArea\" was not injected: check your FXML file 'mainui.fxml'.";
		assert itemWarehouseField != null : "fx:id=\"itemWarehouseField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert itemsPartNumberField != null : "fx:id=\"itemsPartNumberField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert itemsMoveFileField != null : "fx:id=\"itemsMoveFileField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert warehouseNameField != null : "fx:id=\"warehouseNameField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert consoleTextArea != null : "fx:id=\"consoleTextArea\" was not injected: check your FXML file 'mainui.fxml'.";
		assert bundlePartChoiceBox != null : "fx:id=\"bundlePartChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
		assert vanCheckBox != null : "fx:id=\"vanCheckBox\" was not injected: check your FXML file 'mainui.fxml'.";
		assert addDeleteChoiceBox != null : "fx:id=\"addDeleteChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
		assert typeChoiceBox != null : "fx:id=\"typeChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
		assert itemsChoiceBox != null : "fx:id=\"itemsChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
		assert accountsSubmitButton != null : "fx:id=\"accountsSubmitButton\" was not injected: check your FXML file 'mainui.fxml'.";
		assert createWarehouseButton != null : "fx:id=\"crreateWarehouseButton\" was not injected: check your FXML file 'mainui.fxml'.";
		assert itemsExecuteButton != null : "fx:id=\"itemsExecuteButton\" was not injected: check your FXML file 'mainui.fxml'.";
		assert finishInvoiceButton != null : "fx:id=\"finishInvoiceButton\" was not injected: check your FXML file 'mainui.fxml'.";
		assert addToInvoiceButton != null : "fx:id=\"addToInvoiceButton\" was not injected: check your FXML file 'mainui.fxml'.";
		assert removeFromInvoiceButton != null : "fx:id=\"removeFromInvoiceButton\" was not injected: check your FXML file 'mainui.fxml'.";
		assert bundleSubmitButton != null : "fx:id=\"bundleSubmitButton\" was not injected: check your FXML file 'mainui.fxml'.";
	}

	@FXML
	public void login(){

	}

	@FXML
	public void doCommission(){

	}

	@FXML
	public void doSaveDatabase(){

	}

	@FXML
	public void doLoadDatabase(){

	}

	@FXML
	public void doAddToInvoice(){

	}

	@FXML
	public void doRemoveFromInvoice(){

	}

	@FXML
	public void doFinishInvoice(){

	}

	@FXML
	public void doItemExecute(){

	}

	@FXML
	public void doCreateVan(){

	}

	@FXML
	public void doCreateWarehouse(){

	}

	@FXML
	public void doChangeWarehouseName(){

	}

	@FXML
	public void doChangeVanName(){

	}

	@FXML
	public void doAccountAction(){

	}

}

