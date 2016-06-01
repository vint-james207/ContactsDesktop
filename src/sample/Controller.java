package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TextField text1;

    @FXML
    TextField text2;

    @FXML
    TextField text3;

    @FXML
    ListView list;

    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    public void addContact() {
            Contact contact = new Contact(text1.getText(), text2.getText(), text3.getText());
        if (!text1.getText().isEmpty() && !text2.getText().isEmpty() && !text3.getText().isEmpty()) {
            contacts.add(contact);
        }
            text1.setText("");
            text2.setText("");
            text3.setText("");

    }

    public void removeContact() {
        SelectionModel model = list.getSelectionModel();
        Contact contact = (Contact) model.getSelectedItem();
        contacts.remove(contact);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);

    }
}
