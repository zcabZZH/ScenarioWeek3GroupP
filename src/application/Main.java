package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		Label label1 = new Label("Name:");
		TextField textField = new TextField ();
		//HBox hb = new HBox();
		//hb.getChildren().addAll(label1, textField);
		/*
		StackPane root1 = new StackPane();
		 Button btn = new Button();
		 
		 
	        btn.setText("Say 'Hello World'");
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	 
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Hello World!");
	            }
	        });*/
		
		try {
			
			Scene scene = new Scene(root,640,480);
			scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
			//root.getChildren().add(btn);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		root.setCenter(new RootLayout());
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
