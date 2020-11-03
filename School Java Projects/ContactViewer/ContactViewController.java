import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ContactViewController {

    @FXML private ListView<Contact> contactListView;
    @FXML private VBox contactData;
    @FXML private TextField lastName;
    @FXML private TextField firstName;
    @FXML private TextField email;
    @FXML private TextField phone;

    private final ObservableList<Contact> contacts = 
    	      FXCollections.observableArrayList();

public void initialize() {
   contacts.add(new Contact("Jim", "Random", "email@email.com", "414-111-1111"));
   contacts.add(new Contact("Jane", "Doe", "email2@email.com", "414-222-1111"));
   contactListView.setItems(contacts); 

   
   contactListView.getSelectionModel().selectedItemProperty().
      addListener(
         new ChangeListener<Contact>() {                                   
            @Override                                                     
            public void changed(ObservableValue<? extends Contact> ov,
               Contact oldValue, Contact newValue) {                        
               lastName.setText(newValue.getlastName());
               firstName.setText(newValue.getfirstName());
               email.setText(newValue.getemail());
               phone.setText(newValue.getphone());
            }
         }
      );               
}     
}


