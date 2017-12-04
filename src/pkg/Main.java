package pkg;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.File;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * The rain in Main falls mainly in the plain.
 */
public class Main extends Application {
  private static File selectedFile;

  /**
   * @param args
   */
  public static void main(String[] args) {
    launch(args);
    LoginHandler.getInstance().addAccount(new Admin("admin", "password"));
  }

  /* (non-Javadoc)
   * @see javafx.application.Application#start(javafx.stage.Stage)
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("mainui.fxml"));
    primaryStage.setTitle("");
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
    primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
      public void handle(WindowEvent we) {
        DatabaseHandler.saveDatabase();
      }
    });
  }
}