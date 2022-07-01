package decodeur;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MonController {
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
	WebView webView;
	@FXML
	WebEngine engine;


	public void initialize() {
		System.out.println("demarrage appli telecommande");
		engine=webView.getEngine();
		loadPage();
	}

	private void loadPage() {
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=10");
		
	}
	
	/////////////////////////
	////////1ERE RANGEE//////
	/////////////////////////



	public void pressedButtonRetour(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("retour");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=158&mode=0");

	}

	public void pressedButtonVolPlus(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("volplus");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=115&mode=0");
	}

	public void pressedButtonVolMoins(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("volmoins");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=115&mode=0");
	}

	public void pressedButtonMute(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("mute");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=113&mode=0");
	}

	public void pressedButtonRecule(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("recule");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=168&mode=0");
	}

	/////////////////////////
	////////2E RANGEE//////
	/////////////////////////


	public void pressedButtonLeft(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("left");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=105&mode=0");
	}

	/////////////////////////
	////////3E RANGEE//////
	/////////////////////////


	public void pressedButtonMenu(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("menu");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=139&mode=0");
	}

	public void pressedButtonUp(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("up");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=103&mode=0");
	}

	public void pressedButtonOk(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("ok");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=352&mode=0");
	}

	public void pressedButtonDown(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("down");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=108&mode=0");
	}

	public void pressedButtonRec(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("rec");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=167&mode=0");
	}

	public void pressedButtonPlay(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("play");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=164&mode=0");
	}


	/////////////////////////
	////////4E RANGEE//////
	/////////////////////////


	public void pressedButtonRight(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("right");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=106&mode=0");
	}

	/////////////////////////
	////////5E RANGEE//////
	/////////////////////////


	public void pressedButtonPower(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("power");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=116&mode=0");
	}

	public void pressedButtonCHPLUS(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("chplus");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=402&mode=0");
	}

	public void pressedButtonCHMOINS(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("chmoins");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=403&mode=0");
	}
	
	
	public void pressedButtonINFO(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("info html");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=10");
	}
	

	public void pressedButtonAVANCE(ActionEvent event) throws IOException, URISyntaxException{
		System.out.println("avance");
		engine.load("http://192.168.1.31:8080/remoteControl/cmd?operation=01&key=159&mode=0");
	}

}

