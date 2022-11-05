package decodeur;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MonController {

	@FXML
	TextField newAdresse;

	@FXML
	Text adresse;

	@FXML
	Button ok;

	@FXML
	Button POWER;
	@FXML
	Button MENU;
	@FXML
	Button RETORU;
	@FXML
	Button UP;
	@FXML
	Button DOWN;
	@FXML
	Button LEFT;
	@FXML
	Button RIGHT;
	@FXML
	Button OK;
	@FXML
	Button VOLPLUS;
	@FXML
	Button VOLMOINS;
	@FXML
	Button MUTE;
	@FXML
	Button RECULE;
	@FXML
	Button AVANCE;
	@FXML
	Button PLAY;
	@FXML
	Button REC;
	@FXML
	Button CHPLUS;
	@FXML
	Button CHMOINS;
	@FXML
	Button INFO;

	@FXML
	Button TF1;
	@FXML
	Button FRANCEDEUX;
	@FXML
	Button TMC;
	@FXML
	Button BFM;

	@FXML
	WebView webView;
	@FXML
	WebEngine engine;

	int ip=34;



	public void initialize() throws InterruptedException {
		System.out.println("demarrage appli telecommande");
		newAdresse.setText(""+ip);
		adresse.setText("192.168.1." + ip);
		engine=webView.getEngine();
		status();
	}

	public void pressedButtonOkChangeIp(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		ip=Integer.parseInt(newAdresse.getText());
		adresse.setText("192.168.1." + ip);
		//	System.out.println("change ip en " + adresse.getText());
		System.out.println("ip change en " + ip);
		status();
	}

	private void status() throws InterruptedException {
		Thread.sleep(500);
		engine.load("http://192.168.1."+ip+":8080/remoteControl/cmd?operation=10");
	}

	private void loadPage(String commande, String key) throws InterruptedException {
		engine.load("http://192.168.1."+ip+":8080/remoteControl/cmd?operation="+commande+"&key="+key+"&mode=0");
		status();

	}
	
	private void loadChaine(String id) throws InterruptedException {
		engine.load("http://192.168.1."+ip+":8080/remoteControl/cmd?operation=09&epg_id="+id+"&uui=1");
		status();

	}

	/////////////////////////
	////////1ERE RANGEE//////
	/////////////////////////



	public void pressedButtonRetour(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("retour");
		loadPage("01", "158");

	}

	public void pressedButtonVolPlus(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("volplus");
		loadPage("01", "115");
	}

	public void pressedButtonVolMoins(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("volmoins");
		loadPage("01", "115");

	}

	public void pressedButtonMute(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("mute");
		loadPage("01", "113");

	}

	public void pressedButtonRecule(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("recule");
		loadPage("01", "168");

	}

	/////////////////////////
	////////2E RANGEE//////
	/////////////////////////


	public void pressedButtonLeft(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("left");
		loadPage("01", "105");

	}

	/////////////////////////
	////////3E RANGEE//////
	/////////////////////////


	public void pressedButtonMenu(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("menu");
		loadPage("01", "139");

	}

	public void pressedButtonUp(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("up");
		loadPage("01", "103");

	}

	public void pressedButtonOk(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("ok");
		loadPage("01", "352");

	}

	public void pressedButtonDown(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("down");
		loadPage("01", "108");

	}

	public void pressedButtonRec(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("rec");
		loadPage("01", "167");

	}

	public void pressedButtonPlay(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("play");
		loadPage("01", "164");

	}


	/////////////////////////
	////////4E RANGEE//////
	/////////////////////////


	public void pressedButtonRight(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("right");
		loadPage("01", "106");

	}

	/////////////////////////
	////////5E RANGEE//////
	/////////////////////////


	public void pressedButtonPower(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("power");
		loadPage("01", "116");

	}

	public void pressedButtonCHPLUS(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("chplus");
		loadPage("01", "402");

	}

	public void pressedButtonCHMOINS(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("chmoins");
		loadPage("01", "403");

	}


	public void pressedButtonINFO(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("info html");
		status();
	}


	public void pressedButtonAVANCE(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("avance");
		loadPage("01", "159");

	}


	/////////////////////////
	////////CHAINE//////
	/////////////////////////



	public void pressedButtonTF1(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("TF1");
		loadChaine("*******192");
	}

	public void pressedButtonFRANCEDEUX(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("FRANCE2");
		loadChaine("*********4");
	}

	public void pressedButtonTMC(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("TMC");
		loadChaine("*******195");
	}


	public void pressedButtonBFMTV(ActionEvent event) throws IOException, URISyntaxException, InterruptedException{
		System.out.println("BFMTV");
		loadChaine("*******481");
	}


}

