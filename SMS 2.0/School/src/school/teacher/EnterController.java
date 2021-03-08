/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.teacher;

import db_handle.db_teacher;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import obj.Teacher;

/**
 * FXML Controller class
 *
 * @author User
 */
public class EnterController implements Initializable {

     @FXML private TextField serial_no;
     @FXML private TextField computer_no;
     @FXML private TextField name;
     @FXML private TextField full_name;
     @FXML private TextField dob;
     @FXML private TextField nic_no;
     @FXML private TextField personal_addr;
     @FXML private TextField tel_no;
     @FXML private TextField reg_no;
     @FXML private TextField educational_qualification;
     @FXML private TextField prof_qualification;
     @FXML private TextField first_apponit_date;
     @FXML private TextField first_school_ap;
     @FXML private TextField grade_class;
     @FXML private TextField conf_apoint_date;
     @FXML private TextField difficult_period;
     @FXML private TextField appoint_zone_date;
     @FXML private TextField appoint_school_date;
     @FXML private TextField w_o_penssion_no;
     String Status;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    public void regi(){
         try {
             Status="IN";
             
             Teacher t =new Teacher(serial_no.getText(),computer_no.getText(), name.getText(), full_name.getText(), dob.getText(), nic_no.getText(), personal_addr.getText(), tel_no.getText(), reg_no.getText(), educational_qualification.getText(), prof_qualification.getText(), first_apponit_date.getText(), first_school_ap.getText(), grade_class.getText(), conf_apoint_date.getText(), difficult_period.getText(), appoint_zone_date.getText(), appoint_school_date.getText(), w_o_penssion_no.getText(),Status);
             db_teacher dt=new db_teacher();
             dt.add(t);
             System.out.println(serial_no.getText());
             JOptionPane.showMessageDialog(null, " Registered" );
              serial_no.setText("");
                computer_no.setText("");
                name.setText("");
                full_name.setText("");
                dob.setText("");
                nic_no.setText("");
                personal_addr.setText("");
                tel_no.setText("");
                reg_no.setText("");
                educational_qualification.setText("");
                prof_qualification.setText("");
                first_apponit_date.setText("");
                first_school_ap.setText("");
                grade_class.setText("");
                conf_apoint_date.setText("");
                difficult_period.setText("");
                appoint_zone_date.setText("");
                appoint_school_date.setText("");
                w_o_penssion_no.setText("");
        
         } catch (SQLException e) {
             
             
             
             Logger.getLogger(EnterController.class.getName()).log(Level.SEVERE, null, e);
             JOptionPane.showMessageDialog(null, "This serial number is already added ");
         }
        
        
        
    }
      @FXML
    public void back(ActionEvent event) throws IOException{
        
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("/school/menu/teach.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.hide(); //optional
                app_stage.setScene(home_page_scene);
               
               app_stage.show();
            
        
        
    }
}
