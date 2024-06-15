package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class Layouts extends Application {

	    @Override
	    public void start(Stage primaryStage) {
	        VBox vbox = new VBox();
	        vbox.setSpacing(20);
	        vbox.getChildren().add(new Label("VBox Layout"));
	        vbox.getChildren().add(new Button("Button 1"));
	        vbox.getChildren().add(new Button("Button 2"));
	        
	        HBox hbox = new HBox();
	        hbox.setSpacing(20);
	        hbox.getChildren().add(new Label("HBox Layout"));
	        hbox.getChildren().add(new TextField("Input"));
	      
	        GridPane gridPane = new GridPane();
	        gridPane.setHgap(20);
	        gridPane.setVgap(20); 
	        gridPane.add(new Label("GridPane Layout"), 0, 0);
	        gridPane.add(new Button("Button 3"), 1, 0);
	        gridPane.add(new Button("Button 4"), 0, 1);
	        gridPane.add(new Button("Button 5"), 1, 1);
	        
	        BorderPane borderPane = new BorderPane();
	        VBox topBox = new VBox();
	        topBox.getChildren().addAll(new Label("BorderPane Layout - Top"), new Button("Top"));
	        borderPane.setTop(topBox);
	        borderPane.setBottom(new Button("Bottom"));
	        borderPane.setLeft(new Button("Left"));
	        borderPane.setRight(new Button("Right"));
	        borderPane.setCenter(new Button("Center"));

	        VBox mainLayout = new VBox();
	        mainLayout.setSpacing(50);
	        mainLayout.getChildren().addAll(vbox, hbox, gridPane, borderPane);
	        
	        Scene scene = new Scene(mainLayout, 600, 600);
	        
	        primaryStage.setTitle("JavaFX Layouts");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}
