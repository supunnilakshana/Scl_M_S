/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.teacher;

import db_handle.db_handler_student;
import db_handle.db_teacher;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import obj.Student;
import obj.Teacher;

/**
 * FXML Controller class
 *
 * @author User
 */



    

public class EditController implements Initializable {

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
     @FXML private TextField A_id;
     @FXML private Button delete;
     @FXML private Button exp;
     @FXML private Button update;
     @FXML private Text st;
     String ID;

    
    /**
     * Initializes the controller class.
     */
     
  
 
    
    
    @FXML
    public void searchS(){
        db_teacher dt=new  db_teacher();
        String id=A_id.getText();
        Teacher t=dt.get_teacher(id);
       
        String T_id=t.getSerial_no();
         System.out.println(T_id);
            
          
          String Status_S=t.getStatus();
          
      serial_no.setText(t.getSerial_no());
      computer_no.setText(t.getComputer_no());
      name.setText(t.getName());
      full_name.setText(t.getFull_name());
      dob.setText(t.getDob());
      nic_no.setText(t.getNic_no());
      personal_addr.setText(t.getPersonal_addr());
      tel_no.setText(t.getTel_no());
      reg_no.setText(t.getReg_no());
      educational_qualification.setText(t.getEducational_qualification());
      prof_qualification.setText(t.getProf_qualification());
      first_apponit_date.setText(t.getFirst_apponit_date());
      first_school_ap.setText(t.getFirst_school_ap());
      grade_class.setText(t.getGrade_class());
      conf_apoint_date.setText(t.getConf_apoint_date());
      difficult_period.setText(t.getDifficult_period());
      appoint_zone_date.setText(t.getAppoint_zone_date());
      appoint_school_date.setText(t.getAppoint_school_date());
      w_o_penssion_no.setText(t.getW_o_penssion_no());
          
          
          if(T_id.equals("Not_Available")){
              
              delete.setVisible(false);
              exp.setVisible(false);
              update.setVisible(false);
             st.setText(" ");
             A_id.setText(null);
             JOptionPane.showMessageDialog(null, "Invalid Serial No");
          }else{
              delete.setVisible(true);
               exp.setVisible(true);
              update.setVisible(true);
              ID=t.getSerial_no();
              st.setText("Status : " +Status_S);
              
          } 
          
          
            
        }
    
    @FXML
    public void clear(){
        
            delete.setVisible(false);
              exp.setVisible(false);
              update.setVisible(false);
             st.setText(" ");
             A_id.setText(null);
            
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
        
    }

       @FXML
    public void update() throws SQLException{
        int res= JOptionPane.showConfirmDialog(null, "Are you do you want to update now", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res==JOptionPane.YES_NO_OPTION){
            try{
                Teacher t =new Teacher(serial_no.getText(),computer_no.getText(), name.getText(), full_name.getText(), dob.getText(), nic_no.getText(), personal_addr.getText(), tel_no.getText(), reg_no.getText(), educational_qualification.getText(), prof_qualification.getText(), first_apponit_date.getText(), first_school_ap.getText(), grade_class.getText(), conf_apoint_date.getText(), difficult_period.getText(), appoint_zone_date.getText(), appoint_school_date.getText(), w_o_penssion_no.getText());
                 db_teacher dt=new db_teacher();
               dt.update(t, ID);
                System.out.println("okk");
                 clear();
                JOptionPane.showMessageDialog(null, "Updated");

            }catch(HeadlessException | SQLException e){

                JOptionPane.showMessageDialog(null, "Invalid Update");

            } 
        }
        
    }
     
    @FXML
    public void delete(){
        int res= JOptionPane.showConfirmDialog(null, " do you want to delete now", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res==JOptionPane.YES_NO_OPTION){
        
         
            
        
            try{
            
                  db_teacher dt=new db_teacher();
                  dt.Delete(ID);
                 System.out.println("okk");
                 clear();
                 JOptionPane.showMessageDialog(null, "Deleted");
            
            
        }catch(SQLException e){
            
                JOptionPane.showMessageDialog(null, "Invalid delete");
            
            
        }
        
       } 
        
    }
           @FXML
    public void expel() throws SQLException{
        int res= JOptionPane.showConfirmDialog(null, "do you want to expele this teacher", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res==JOptionPane.YES_NO_OPTION){
            try{
               // Student s =new Student(admission_no.getText(),identity_no.getText(),name.getText(),full_name.getText(),genders.getText(),dob.getText(),date_of_admission.getText(),race.getText(),religion.getText(),guardian_name.getText(),address.getText(),leaving_date.getText(),last_grade.getText(),leaving_c_no.getText(),leaving_c_date.getText());
               db_teacher dt=new db_teacher();
               
                 dt.Expel(ID);
                System.out.println("okk");
                 clear();
                JOptionPane.showMessageDialog(null, "Expeled");

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, "Invalid Expeled");

            } 
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
        @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
        
        
        
        
    }
    

