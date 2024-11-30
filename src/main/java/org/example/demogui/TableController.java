package org.example.demogui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableController {
    @FXML
    TableView<MegaBox> tableView;
    ObservableList<MegaBox> megaBoxes = FXCollections.observableArrayList();

    public void initialize() {
        initMegaBoxes();
        tableView.setItems(megaBoxes);
        TableColumn<MegaBox, String> titleColumn = new TableColumn<>();
        //PropertyValueFactory описывает как преобразуются типы данных
        //из Megabox получит поле под названием "title"
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

        TableColumn<MegaBox, Integer> weightColumn = new TableColumn<>();
        //PropertyValueFactory описывает как преобразуются типы данных
        //из Megabox получит поле под названием "weight"
        weightColumn.setCellValueFactory(new PropertyValueFactory<>("weight"));
        weightColumn.setText("вес");

        tableView.getColumns().clear();
        tableView.getColumns().addAll(titleColumn, weightColumn);

    }

    public void initMegaBoxes() {
        megaBoxes.add(new MegaBox("qwerty", 12));
        megaBoxes.add(new MegaBox("gggggg", 92));
        megaBoxes.add(new MegaBox("oooooo", 2));
    }
}
