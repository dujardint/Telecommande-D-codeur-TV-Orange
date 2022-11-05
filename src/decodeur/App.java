package decodeur;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application{
	
	/*
	 * arguments : --module-path C:\javafx-sdk-19\lib --add-modules=javafx.controls,javafx.fxml,javafx.web
	 */

	@Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL fxmlFileUrl = getClass().getResource("maquette.fxml");
        if (fxmlFileUrl == null) {
                System.out.println("Impossible de charger le fichier fxml");
                System.exit(-1);
        }
        loader.setLocation(fxmlFileUrl);
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Télécommande Décodeur Orange TV IP");
        stage.show();
}

	

	public static void main(String[] args) {
		launch(args);
	}
}
