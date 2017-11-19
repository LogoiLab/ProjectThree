package pkg;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.FXCollections.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.scene.control.PasswordField;

public class Controller {

    private ArrayList<String> invoiceParts;

    private Account currentAccount = new Nobody();


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
        assert warehouseNewNameField != null : "fx:id=\"warehouseNewNameField\" was not injected: check your FXML file 'mainui.fxml'.";
        assert consoleTextArea != null : "fx:id=\"consoleTextArea\" was not injected: check your FXML file 'mainui.fxml'.";
        assert bundlePartChoiceBox != null : "fx:id=\"bundlePartChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
        assert vanCheckBox != null : "fx:id=\"vanCheckBox\" was not injected: check your FXML file 'mainui.fxml'.";
        assert addDeleteChoiceBox != null : "fx:id=\"addDeleteChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
        assert typeChoiceBox != null : "fx:id=\"typeChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
        assert warehouseActionChoiceBox != null : "fx:id=\"warehouseActionChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
        assert itemsChoiceBox != null : "fx:id=\"itemsChoiceBox\" was not injected: check your FXML file 'mainui.fxml'.";
        assert accountsSubmitButton != null : "fx:id=\"accountsSubmitButton\" was not injected: check your FXML file 'mainui.fxml'.";
        assert createWarehouseButton != null : "fx:id=\"crreateWarehouseButton\" was not injected: check your FXML file 'mainui.fxml'.";
        assert itemsExecuteButton != null : "fx:id=\"itemsExecuteButton\" was not injected: check your FXML file 'mainui.fxml'.";
        assert finishInvoiceButton != null : "fx:id=\"finishInvoiceButton\" was not injected: check your FXML file 'mainui.fxml'.";
        assert addToInvoiceButton != null : "fx:id=\"addToInvoiceButton\" was not injected: check your FXML file 'mainui.fxml'.";
        assert removeFromInvoiceButton != null : "fx:id=\"removeFromInvoiceButton\" was not injected: check your FXML file 'mainui.fxml'.";
        assert bundleSubmitButton != null : "fx:id=\"bundleSubmitButton\" was not injected: check your FXML file 'mainui.fxml'.";
        bundlePartChoiceBox.setItems(FXCollections.observableArrayList("Add Bundle", "Add Part"));
        addDeleteChoiceBox.setItems(FXCollections.observableArrayList("Add New Account", "Delete Existing Account"));
        typeChoiceBox.setItems(FXCollections.observableArrayList("System Admin", "Office Manager", "Warehouse Manager", "Employee"));
        itemsChoiceBox.setItems(FXCollections.observableArrayList("Order Part","Move Part","Display Part","Sell Part","Sort Parts By Name","Sort Parts By Number"));
        warehouseActionChoiceBox.setItems(FXCollections.observableArrayList("Create New Warehouse/Van","Rename Existing Warehouse/Van"));
        databaseDirectoryPath.setText(DatabaseHandler.getPath());
        clean();
    }

    private void clean() {
      bundleCommissionField.setText(bundleCommissionField.getText().trim());
      bundlePartNameField.setText(bundlePartNameField.getText().trim());
      bundlePartNumberField.setText(bundlePartNumberField.getText().trim());
      invoicePartNumberField.setText(invoicePartNumberField.getText().trim());
      invoicePartQuantityField.setText(invoicePartQuantityField.getText().trim());
      itemsMoveFileField.setText(itemsMoveFileField.getText().trim());
      itemsPartNumberField.setText(itemsPartNumberField.getText().trim());
      itemWarehouseField.setText(itemWarehouseField.getText().trim());
      warehouseNameField.setText(warehouseNameField.getText().trim());
      warehouseNewNameField.setText(warehouseNewNameField.getText().trim());
    }

    @FXML
    public void login() {
      clean();
      if (LoginHandler.getInstance().doLogin(usernameTextField.getText(), passwordField.getText())) {
        this.currentAccount = LoginHandler.getInstance().getAccount(usernameTextField.getText());
      } else {
        this.currentAccount =  new Nobody();
      }
    }

    @FXML
    public void doCommission() {
      clean();
      Double com=Double.parseDouble(bundleCommissionField.getText());
    }

    @FXML
    public void doSaveDatabase() {
      clean();
      DatabaseHandler.saveDatabase();
    }

    @FXML
    public void doLoadDatabase() {
      clean();
      DatabaseHandler.loadDatabase();
    }

    @FXML
    public void doAddToInvoice() {
      clean();
      invoiceParts.add(invoicePartNumberField.getText()+";"+ invoicePartQuantityField.getText());
    }

    @FXML
    public void doRemoveFromInvoice() {
      clean();
    }

    @FXML
    public void doFinishInvoice() {
      clean();
      for(String i : invoiceParts){

        }
    }

    @FXML
    public void doItemExecute() {
      clean();
    }

    @FXML
    public void doCreateWarehouse() {
      clean();
      WarehouseFactory.getInstance().createWarehouse(warehouseNameField.getText(), vanCheckBox.isSelected(), new ItemList(new ArrayList<BikePart>()));
    }

    @FXML
    public void doChangeWarehouseName() {
      clean();
      WarehouseFactory.getInstance().getWarehouse(warehouseNameField.getText()).setWhName(warehouseNewNameField.getText());
    }

    @FXML
    public void doAccountAction() {
      clean();
    }

}

