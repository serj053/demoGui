package org.example.demogui;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Label label1;
    @FXML
    Button btn1, btn2, btn3, btn4;

    @FXML
    TextField textField;

    @FXML
    Label label2;

    @FXML
    Button boxPlus;

    @FXML
    Button boxMinus;

    @FXML
    TextField boxWeight;

    MegaBox box3;

    @FXML
    Button btnToTable;

    public Controller() {
        System.out.println("Run constructor of Controller");
    }

    //метод запускается после загрузки статических компонентов где можем описать
    //создание новых компонентов, можем изменить свойство старых и так далее
    //при инициализации подключаются методы обработки событий
    public void initialize() {
        System.out.println("Запущен метод initialize()");
        btn2.setOnAction(new Actioner2());
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label1.setText("action 3");
            }
        });
        btn4.setOnAction(e -> {
            label1.setText("action 4");
        });
        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                label2.setText("длинна текста " + observableValue.getValue().length());
            }
        }) ;

//        textField.textProperty().addListener((observableValue, oldValue, newValue)
//                -> label2.setText("длинна текста " + observableValue.getValue().length()
//                + "было" + oldValue + "  стало" + newValue
//        ));
        box3 = new MegaBox();
        box3.weightProperty().addListener((observableValue, oldVal, newVal) -> {
            boxWeight.setText(oldVal + " ->> " + newVal);
        });
        boxPlus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                box3.setWeight(box3.getWeight() + 1);
            }
        });
        boxMinus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    box3.setWeight(box3.getWeight() - 1);
                }
        });

        btnToTable.setOnAction(event -> {
           Stage st = (Stage) btnToTable.getParent().getScene().getWindow();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("table.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            st.setScene(new Scene(root));
        });

    }

    public void act1() {
        label1.setText("action 1");
    }

    class Actioner2 implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            label1.setText("action 2");

        }
    }


}