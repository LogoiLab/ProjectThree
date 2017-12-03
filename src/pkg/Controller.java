package pkg;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.FXCollections.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description interprates input from the GUI and calls the correct class methods passing input from fields and ActionEvents from the GUI
 */

public class Controller {

	private ArrayList<String> invoiceParts;

	private Account currentAccount;

	@FXML
	private Pane mainPane;

	@FXML
	private Pane loginPane;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private ChoiceBox<String> addDeleteChoiceBox;

	@FXML
	private ChoiceBox<String> typeChoiceBox;

	@FXML
	private Button accountsSubmitButton;

	@FXML
	private TreeView<?> accountListingTreeView;

	@FXML
	private TextField usernameTextField;

	@FXML
	private PasswordField passwordField;

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
	private TextField invoiceWarehouseField;

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
	private ChoiceBox<String> bundlePartChoiceBox;

	@FXML
	private ChoiceBox<String> itemsChoiceBox;

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
	private TextField warehouseNewNameField;

	@FXML
	private CheckBox vanCheckBox;

	@FXML
	private ChoiceBox<String> warehouseActionChoiceBox;

	@FXML
	private Button createWarehouseButton;

	@FXML
	private TextArea consoleTextArea;

	@FXML
	private TextField itemPartQuantityField;

	@FXML
	private Tab accountTab;

	@FXML
	private Tab commissionTab;

	@FXML
	private Tab databaseTab;

	@FXML
	private Tab invoiceTab;

	@FXML
	private Tab itemTab;

	@FXML
	private Tab warehouseTab;

	@FXML
	private Tab consoleTab;

	/**
	 * 
	 */
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
		assert invoiceWarehouseField != null : "fx:id=\"invoiceWarehouseField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert itemWarehouseField != null : "fx:id=\"itemWarehouseField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert itemsPartNumberField != null : "fx:id=\"itemsPartNumberField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert itemsMoveFileField != null : "fx:id=\"itemsMoveFileField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert warehouseNameField != null : "fx:id=\"warehouseNameField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert warehouseNewNameField != null : "fx:id=\"warehouseNewNameField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert itemPartQuantityField != null : "fx:id=\"itemPartQuantityField\" was not injected: check your FXML file 'mainui.fxml'.";
		assert consoleTextArea != null : "fx:id=\"consoleTextArea\" was not injected: check your FXML file 'mainui.fxml'.";
		assert bundlePartChoiceBox != null : "fx:id=\"bundlePartChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
		assert vanCheckBox != null : "fx:id=\"vanCheckBox\" was not injected: check your FXML file 'mainui.fxml'.";
		assert addDeleteChoiceBox != null : "fx:id=\"addDeleteChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
		assert typeChoiceBox != null : "fx:id=\"typeChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
		assert warehouseActionChoiceBox != null : "fx:id=\"warehouseActionChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
		assert itemsChoiceBox != null : "fx:id=\"itemsChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
		assert accountsSubmitButton != null : "fx:id=\"accountsSubmitButton\" was not injected: check your FXML file 'mainui.fxml'.";
		assert createWarehouseButton != null : "fx:id=\"createWarehouseButton\" was not injected: check your FXML file 'mainui.fxml'.";
		assert itemsExecuteButton != null : "fx:id=\"itemsExecuteButton\" was not injected: check your FXML file 'mainui.fxml'.";
		assert finishInvoiceButton != null : "fx:id=\"finishInvoiceButton\" was not injected: check your FXML file 'mainui.fxml'.";
		assert addToInvoiceButton != null : "fx:id=\"addToInvoiceButton\" was not injected: check your FXML file 'mainui.fxml'.";
		assert removeFromInvoiceButton != null : "fx:id=\"removeFromInvoiceButton\" was not injected: check your FXML file 'mainui.fxml'.";
		assert bundleSubmitButton != null : "fx:id=\"bundleSubmitButton\" was not injected: check your FXML file 'mainui.fxml'.";
		mainPane.setVisible(false);
		mainPane.setDisable(true);
		mainPane.toBack();
		loginPane.setVisible(true);
		loginPane.setDisable(false);
		loginPane.toFront();
		bundlePartChoiceBox.setItems(FXCollections.observableArrayList("Add Bundle", "Add Part"));
		addDeleteChoiceBox.setItems(FXCollections.observableArrayList("Add New Account", "Delete Existing Account"));
		typeChoiceBox.setItems(
				FXCollections.observableArrayList("System Admin", "Office Manager", "Warehouse Manager", "Employee"));
		itemsChoiceBox.setItems(FXCollections.observableArrayList("Order Part", "Move Part", "Display Part",
				"Sell Part", "Sort Parts By Name", "Sort Parts By Number"));
		warehouseActionChoiceBox.setItems(
				FXCollections.observableArrayList("Create New Warehouse/Van", "Rename Existing Warehouse/Van"));
		databaseDirectoryPath.setText(DatabaseHandler.getPath());
		clean();
	}


	private void clean() {
		bundleCommissionField.setText(bundleCommissionField.getText().trim());
		bundlePartNameField.setText(bundlePartNameField.getText().trim());
		bundlePartNumberField.setText(bundlePartNumberField.getText().trim());
		invoicePartNumberField.setText(invoicePartNumberField.getText().trim());
		invoicePartQuantityField.setText(invoicePartQuantityField.getText().trim());
		invoiceWarehouseField.setText(invoiceWarehouseField.getText().trim());
		itemsMoveFileField.setText(itemsMoveFileField.getText().trim());
		itemsPartNumberField.setText(itemsPartNumberField.getText().trim());
		itemWarehouseField.setText(itemWarehouseField.getText().trim());
		warehouseNameField.setText(warehouseNameField.getText().trim());
		warehouseNewNameField.setText(warehouseNewNameField.getText().trim());
		consoleTextArea.appendText(OutputBuffer.getInstance().get());
	}

	/**
	 * 
	 */
	@FXML
	public void login(ActionEvent event) {
		clean();
		System.out.println(usernameTextField.getText());
		if (LoginHandler.getInstance().doLogin(usernameTextField.getText(), passwordField.getText())) {
			this.currentAccount = LoginHandler.getInstance().getAccount(usernameTextField.getText());
			loginPane.setVisible(false);
			loginPane.setDisable(true);
			loginPane.toBack();
			mainPane.setVisible(true);
			mainPane.setDisable(false);
			mainPane.toFront();
		} else {
			mainPane.setVisible(false);
			mainPane.setDisable(true);
			mainPane.toBack();
			loginPane.setVisible(true);
			loginPane.setDisable(false);
			loginPane.toFront();
			this.currentAccount = new Nobody();
		}

		switch (this.currentAccount.getPermLevel()) {
			case 4: {
			set4Perm();
			break;
		}
			case 3: {
			set3Perm();
			break;
		}
			case 2: {
			set2Perm();
			break;
		}
			case 1: {
			set1Perm();
			break;
		}
			case 0: {
			mainPane.setVisible(false);
			mainPane.setDisable(true);
			mainPane.toBack();
			loginPane.setVisible(true);
			loginPane.setDisable(false);
			loginPane.toFront();
			this.currentAccount = new Nobody();
			break;
		}
		}
	}

	/**
	 * 
	 */
	private void set4Perm() {

	}

	/**
	 * 
	 */
	private void set3Perm() {
		accountTab.setDisable(false);
		commissionTab.setDisable(false);
		databaseTab.setDisable(false);
		invoiceTab.setDisable(true);
		itemTab.setDisable(true);
		warehouseTab.setDisable(true);
		consoleTab.setDisable(false);
	}

	/**
	 * 
	 */
	private void set2Perm() {
		accountTab.setDisable(true);
		commissionTab.setDisable(true);
		databaseTab.setDisable(false);
		invoiceTab.setDisable(false);
		itemTab.setDisable(false);
		warehouseTab.setDisable(false);
		consoleTab.setDisable(false);
	}

	/**
	 * 
	 */
	private void set1Perm() {
		accountTab.setDisable(true);
		commissionTab.setDisable(true);
		databaseTab.setDisable(false);
		invoiceTab.setDisable(false);
		itemTab.setDisable(false);
		warehouseTab.setDisable(true);
		consoleTab.setDisable(false);
	}

	/**
	 * 
	 */
	@FXML
	public void doCommission() {
		clean();
		Double com = Double.parseDouble(bundleCommissionField.getText());
	}

	/**
	 * 
	 */
	@FXML
	public void doSaveDatabase() {
		clean();
		DatabaseHandler.saveDatabase();
	}

	/**
	 * 
	 */
	@FXML
	public void doLoadDatabase() {
		clean();
		DatabaseHandler.loadDatabase();
	}

	/**
	 * 
	 */
	@FXML
	public void doAddToInvoice() {
		clean();
		invoiceParts.add(invoicePartNumberField.getText() + ";" + invoicePartQuantityField.getText());
	}

	/**
	 * 
	 */
	@FXML
	public void doRemoveFromInvoice() {
		clean();
		InvoiceFactory.getInstance().removeFromInvoice(invoicePartNumberField.getText());
	}

	/**
	 * 
	 */
	@FXML
	public void doFinishInvoice() {
		clean();
		WarehouseFactory.getInstance().getWarehouse(invoiceWarehouseField.getText()).getiList();
	}

	/**
	 * 
	 */
	@FXML
	public void doItemExecute() {
		clean();
		switch (itemsChoiceBox.getValue()) {
		case ("Order Part"):
			WarehouseFactory.getInstance().moveParts("MainWarehouse", itemWarehouseField.getText(),
					Long.parseLong(itemsPartNumberField.getText()), Integer.parseInt(itemPartQuantityField.getText()));
		case ("Move Part"):
			DatabaseHandler.readMoveFile(itemsMoveFileField.getText());
		case ("Display Part"):
			OutputBuffer.getInstance().add(WarehouseFactory.getInstance().getWarehouse("MainWarehouse").getiList()
					.getPartByNumber(Long.parseLong(itemsPartNumberField.getText())).toString());
		case ("Sort Parts By Name"): {
			ArrayList<BikePart> temp = WarehouseFactory.getInstance().getWarehouse(itemWarehouseField.getText())
					.getiList().sortByName();
			for (BikePart p : temp) {
				OutputBuffer.getInstance().add(p.toString());
			}
		}
		case ("Sort Parts By Number"): {
			ArrayList<BikePart> temp = WarehouseFactory.getInstance().getWarehouse(itemWarehouseField.getText())
					.getiList().sortByNumber();
			for (BikePart p : temp) {
				OutputBuffer.getInstance().add(p.toString());
			}
		}
		}
	}

	/**
	 * 
	 */
	@FXML
	public void doCreateWarehouse() {
		clean();
		WarehouseFactory.getInstance().createWarehouse(warehouseNameField.getText(), vanCheckBox.isSelected(),
				new ItemList(new ArrayList<BikePart>()));
	}

	/**
	 * 
	 */
	@FXML
	public void doChangeWarehouseName() {
		clean();
		WarehouseFactory.getInstance().getWarehouse(warehouseNameField.getText())
				.setWhName(warehouseNewNameField.getText());
	}

	/**
	 * 
	 */
	@FXML
	public void doAccountAction() {
		clean();
	}

}
