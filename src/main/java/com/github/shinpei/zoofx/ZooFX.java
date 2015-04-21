package com.github.shinpei.zoofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class ZooFX extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		URL url = getClass().getResource("/");
		System.out.println(url);
		Parent root = FXMLLoader.load(getClass().getResource("/zoofx.fxml"));
		stage.setTitle("ZooFX");
		stage.setScene(new Scene(root, 300, 275));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
