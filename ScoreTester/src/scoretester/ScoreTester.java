/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoretester;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import parameters.Strings;

/**
 *
 * @author jeroen
 */
public class ScoreTester extends Application {

    private static Strings STRINGS;
    private TextField textField1;
    private TextField textField2;
    private TextField textField3;
    private TextField textField4;
    private TextField textField5;
    private TextField textField6;
    private TextField textField7;
    private TextField textField8;
    private TextField textField9;
    private TextField textField10;
    private Label scoreLabel;

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        Label questionLabel1 = new Label(STRINGS.getQuestion1());
        gridPane.add(questionLabel1, 0, 0);
        Label questionLabel2 = new Label(STRINGS.getQuestion2());
        gridPane.add(questionLabel2, 0, 1);
        Label questionLabel3 = new Label(STRINGS.getQuestion3());
        gridPane.add(questionLabel3, 0, 2);
        Label questionLabel4 = new Label(STRINGS.getQuestion4());
        gridPane.add(questionLabel4, 0, 3);
        Label questionLabel5 = new Label(STRINGS.getQuestion5());
        gridPane.add(questionLabel5, 0, 4);
        Label questionLabel6 = new Label(STRINGS.getQuestion6());
        gridPane.add(questionLabel6, 0, 5);
        Label questionLabel7 = new Label(STRINGS.getQuestion7());
        gridPane.add(questionLabel7, 0, 6);
        Label questionLabel8 = new Label(STRINGS.getQuestion8());
        gridPane.add(questionLabel8, 0, 7);
        Label questionLabel9 = new Label(STRINGS.getQuestion9());
        gridPane.add(questionLabel9, 0, 8);
        Label questionLabel10 = new Label(STRINGS.getQuestion10());
        gridPane.add(questionLabel10, 0, 9);
        textField1 = new TextField();
        gridPane.add(textField1, 1, 0);
        textField2 = new TextField();
        gridPane.add(textField2, 1, 1);
        textField3 = new TextField();
        gridPane.add(textField3, 1, 2);
        textField4 = new TextField();
        gridPane.add(textField4, 1, 3);
        textField5 = new TextField();
        gridPane.add(textField5, 1, 4);
        textField6 = new TextField();
        gridPane.add(textField6, 1, 5);
        textField7 = new TextField();
        gridPane.add(textField7, 1, 6);
        textField8 = new TextField();
        gridPane.add(textField8, 1, 7);
        textField9 = new TextField();
        gridPane.add(textField9, 1, 8);
        textField10 = new TextField();
        gridPane.add(textField10, 1, 9);
        HBox hBox = new HBox();
        Button calculateButton = new Button();
        calculateButton.setText("Calculate Score");
        calculateButton.setOnAction((ActionEvent event) -> {
            calculateOrClean();
        });
        hBox.getChildren().add(calculateButton);
        scoreLabel = new Label("Score: -");
        scoreLabel.setPadding(new Insets(5, 10, 5, 10));
        hBox.getChildren().add(scoreLabel);
        gridPane.add(hBox, 1, 10);

        StackPane root = new StackPane();
        root.getChildren().add(gridPane);

        Scene scene = new Scene(root, 320, 410);

        primaryStage.setTitle(STRINGS.getApplicationTitle());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 0) {
            try {
                STRINGS = (Strings) Class.forName("parameters.Strings." + args[0]).newInstance();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                STRINGS = new Strings.EN();
            }
        } else {
            STRINGS = new Strings.NL();
        }
        launch(args);
    }

    private void calculateOrClean() {
        if (scoreLabel.getText().equals("Score: -")) {
            int score = 0;
            if (textField1.getText().toUpperCase().equals(STRINGS.getAnswer1())) {
                score++;
            }
            if (textField2.getText().toUpperCase().equals(STRINGS.getAnswer2())) {
                score++;
            }
            if (textField3.getText().toUpperCase().equals(STRINGS.getAnswer3())) {
                score++;
            }
            if (textField4.getText().toUpperCase().equals(STRINGS.getAnswer4())) {
                score++;
            }
            if (textField5.getText().toUpperCase().equals(STRINGS.getAnswer5())) {
                score++;
            }
            if (textField6.getText().toUpperCase().equals(STRINGS.getAnswer6())) {
                score++;
            }
            if (textField7.getText().toUpperCase().equals(STRINGS.getAnswer7())) {
                score++;
            }
            if (textField8.getText().toUpperCase().equals(STRINGS.getAnswer8())) {
                score++;
            }
            if (textField9.getText().toUpperCase().equals(STRINGS.getAnswer9())) {
                score++;
            }
            if (textField10.getText().toUpperCase().equals(STRINGS.getAnswer10())) {
                score++;
            }
            scoreLabel.setText("Score: " + score);
        } else {
            textField1.clear();
            textField2.clear();
            textField3.clear();
            textField4.clear();
            textField5.clear();
            textField6.clear();
            textField7.clear();
            textField8.clear();
            textField9.clear();
            textField10.clear();
            scoreLabel.setText("Score: -");
        }
    }

}
