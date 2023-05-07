package com.example.modifiedcontactsapp;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ModifiedContactsAppController {

    @FXML
    private ListView<Contact> contactsListView;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField phoneNumberTextField;

    private final ObservableList<Contact> contacts = FXCollections.observableArrayList();

    public void initialize() {
        contacts.add(new Contact("Alisher", "Isaev", "alisher.isaev_2026@ucentralasia.org", "+996 774 405 434", "C:\\Users\\erkinbek.diushekeev\\FX projects\\ModifiedContactsApp\\src\\main\\images\\alisher.jpg"));
        contacts.add(new Contact("Islambek", "Momukeev", "islambek.momukeev_2026@ucentralasia.org", "+996 990 155- 168", "C:\\Users\\erkinbek.diushekeev\\FX projects\\ModifiedContactsApp\\src\\main\\images\\islambek.jpg"));
        contacts.add(new Contact("Dastan", "Akatov", "dastan.akatov_2026@ucentralasia.org", "+996 705 710 188", "C:\\Users\\erkinbek.diushekeev\\FX projects\\ModifiedContactsApp\\src\\main\\images\\dastan.jpg"));
        contacts.add(new Contact("Sultan", "Toktomambetov", "sultan.toktomambetov_2026@ucentralasia.org", "+996 700 120 324", "C:\\Users\\erkinbek.diushekeev\\FX projects\\ModifiedContactsApp\\src\\main\\images\\sultan.jpg"));
        contacts.add(new Contact("Erkinbek", "Diushekeev", "erkinbek.diushekeev_2026@ucentralasia.org", "+996 555 404 803", "C:\\Users\\erkinbek.diushekeev\\FX projects\\ModifiedContactsApp\\src\\main\\images\\erkinbek.jpg"));
        contactsListView.setItems(contacts);
        contactsListView.setCellFactory(listView -> new ImageTextCell());
        contactsListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Contact>() {
            @Override
            public void changed(ObservableValue<? extends Contact> observable, Contact oldValue, Contact newValue) {
                firstNameTextField.setText(newValue.getFirstName());
                lastNameTextField.setText(newValue.getLastName());
                emailTextField.setText(newValue.getEmail());
                phoneNumberTextField.setText(newValue.getPhoneNumber());
            }
        });
    }


}