package lab3.ex2;

import javafx.application.*;
import javafx.stage.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.layout.VBox;

public class UIApplication extends Application {
	@Override
	public void start(Stage stage) throws Exception{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/ui.fxml"));
		VBox root = (VBox) loader.load();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Lab 3");
		stage.show();
	}
    
    public static void run(String arg[]){
    	Application.launch(arg);
    }
}
