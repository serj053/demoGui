package org.example.demogui;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class MegaBox {
    private SimpleStringProperty title = new SimpleStringProperty();
    private SimpleIntegerProperty weight = new SimpleIntegerProperty();

    public MegaBox(){}
    public MegaBox(String t, int w){
        setTitle(t);
        setWeight(w);
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public void setWeight(int weight) {
        this.weight.set(weight);
    }

    public SimpleStringProperty titleProperty() {
        return title;
    }

    public SimpleIntegerProperty weightProperty() {
        return weight;
    }

    public String getTitle() {
        return title.get();
    }

    public int getWeight() {
        return weight.get();
    }

    public static void main(String[] args) {
        MegaBox box = new MegaBox();
        box.weightProperty().addListener((observableValue, oldVal, newVal) ->{

        });


    }
}
