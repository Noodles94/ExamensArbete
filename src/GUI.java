import java.net.InetAddress;
import java.net.UnknownHostException;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GUI extends Application {
	
    private static TextArea outputTextArea;

    public static void addToTextArea(String input) {
        String newLine = System.getProperty("line.separator");
        outputTextArea.appendText(input + newLine);
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        outputTextArea = new TextArea();
        outputTextArea.setEditable(false);
        outputTextArea.setPrefWidth(400);
        outputTextArea.setPrefHeight(300);
        Paint value0 = Paint.valueOf("272727");
        outputTextArea.setStyle("-fx-control-inner-background: #" + value0.toString().substring(2));
        outputTextArea.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
        ScrollPane scrollPane = new ScrollPane(outputTextArea);
        VBox vBox = new VBox(scrollPane);
        Scene scene = new Scene(new StackPane(vBox), 400, 300);
        stage.setScene(scene);
        stage.show();
    }
}