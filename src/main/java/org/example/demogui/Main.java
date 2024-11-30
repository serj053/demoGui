package org.example.demogui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println("Main start.");
        //создает иерархию объектов и создает и загружает экземпляр класса контроллер
        //Parent абстрактный класс
        //root верхний объект иерархии загружаемый load
        Parent root  = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
        System.out.println("root loaded.");
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }// в отдельном потоке
}