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

public class Appli extends Application{

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
        stage.setTitle("Télécommande Décodeur Orange TV 192.168.1.31");
        stage.show();
}

	

	public static void main(String[] args) {
		Application.launch(args);
	}
}
