package Students;

import JavaFx.PhoneNumber;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.*;


public class Controller {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPoint;
    public Button sortName;
    public ListView<InputStudents> listView;

    private ObservableList<InputStudents> studentsList = FXCollections.observableArrayList();




    public void add(){

        updateSutdents();
        printList();
    }

    public void  updateSutdents(){

        studentsList.add(new InputStudents(txtName.getText(),txtEmail.getText(),txtPoint.getText()));

    }

    public void printList(){
        listView.setItems(studentsList);
        listView.refresh();
    }



    public void sortName(){

        listView.setItems(studentsList.sorted());
    }
    public void sortPoint(){


    }
}
