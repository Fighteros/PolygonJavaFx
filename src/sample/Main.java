package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Polygon polygon = new Polygon();
        pane.getChildren().add(polygon);

        polygon.setFill(Color.GOLD);
        polygon.setStroke(Color.BLACK);

        ObservableList<Double> obsPoly = polygon.getPoints();

        final double WIDTH = 200, HEIGHT = 200;

        double centerX = WIDTH / 2, centerY = HEIGHT / 2;
        double radius = Math.min(WIDTH, HEIGHT) * .4;

        for(int i = 0; i < 6; i++) {
            obsPoly.add(centerX + radius * Math.cos(2* i * Math.PI /6)) ;
            obsPoly.add(centerY - radius * Math.sin(2* i * Math.PI /6)) ;
        }
        primaryStage.setTitle("Polygon");
        primaryStage.setScene(new Scene(pane, WIDTH, HEIGHT));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
