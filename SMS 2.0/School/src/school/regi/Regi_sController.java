/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.regi;

import db_handle.db_connect;
import db_handle.db_handler_student;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import obj.Student;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Regi_sController implements Initializable {

    @FXML private TextField admission_no;
    @FXML private TextField identity_no;
    @FXML private TextField name;
    @FXML private TextField full_name;
    @FXML ChoiceBox<String> choice;
    @FXML private TextField dob;
    @FXML private TextField date_of_admission;
    @FXML private TextField race;
    @FXML private TextField religion;
    @FXML private TextField guardian_name;
    @FXML private TextField address;
    @FXML private TextField leaving_date;
    @FXML private TextField last_grade;
    @FXML private TextField leaving_c_no;
    @FXML private TextField leaving_c_date;
    
    ObservableList<String> availableChoices = FXCollections.observableArrayList("Male", "Female"); 
    private String status_S="IN";
    private String selectedChoice;
    /**
     * Initializes the controller class.
     */
   @FXML
    public void regi() throws SQLException{
      selectedChoice = choice.getSelectionModel().getSelectedItem().toString();
     Student s =new Student(admission_no.getText(),identity_no.getText(),name.getText(),full_name.getText(),selectedChoice,dob.getText(),date_of_admission.getText(),race.getText(),religion.getText(),guardian_name.getText(),address.getText(),leaving_date.getText(),last_grade.getText(),leaving_c_no.getText(),leaving_c_date.getText(),status_S);
        
 /*  Student s =new Student();
   s.setAdmission_no(admission_no.getText());
   s.setIdentity_no(identity_no.getText());
   s.setName(name.getText());
   s.setFull_name(full_name.getText());
   s.setGender(selectedChoice);
    s.setDob(dob.getText());
   s.setDate_of_admission(date_of_admission.getText());
   s.setRace(race.getText());
   s.setReligion(religion.getText());
 s.setGuardian_name(guardian_name.getText());
   s.setAddress(address.getText());
  s.setLeaving_date(leaving_date.getText());
   s.setLast_grade(last_grade.getText());
   s.setLeaving_c_no(leaving_c_no.getText());
   s.setLeaving_c_date(leaving_c_date.getText());
   s.setStatus(status_S);*/
   
   System.out.println(selectedChoice);
   try{
        db_handler_student db=new db_handler_student();
        db.add_student(s);
        JOptionPane.showMessageDialog(null, " Registered" );
         admission_no.setText(" ");
          identity_no.setText(" ");
          name.setText(" ");
          full_name.setText(" ");
          dob.setText(" ");
          date_of_admission.setText(" ");
          race.setText(" ");
          religion.setText(" ");
          guardian_name.setText(" ");
          address.setText(" ");
          leaving_date.setText(" ");
          last_grade.setText(" ");
          leaving_c_no.setText(" ");
          leaving_c_date.setText(" ");
   }catch(SQLException e){
       
       JOptionPane.showMessageDialog(null, "This addmission number is already added ");
       admission_no.setText(" ");
          identity_no.setText(" ");
          name.setText(" ");
          full_name.setText(" ");
          dob.setText(" ");
          date_of_admission.setText(" ");
          race.setText(" ");
          religion.setText(" ");
          guardian_name.setText(" ");
          address.setText(" ");
          leaving_date.setText(" ");
          last_grade.setText(" ");
          leaving_c_no.setText(" ");
          leaving_c_date.setText(" ");
    }
   
    }
   
    @FXML
    public void back(ActionEvent event) throws IOException{
        
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("/school/menu/menu.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.hide(); //optional
                app_stage.setScene(home_page_scene);
               
               app_stage.show();
            
        
        
    }
      
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          choice.setItems(availableChoices);
    }    
    
}
