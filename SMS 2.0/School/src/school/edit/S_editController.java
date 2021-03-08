/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.edit;

import db_handle.db_handler_student;
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

/**
 * FXML Controller class
 *
 * @author User
 */
public class S_editController implements Initializable {
    @FXML private TextField admission_no;
    @FXML private TextField identity_no;
    @FXML private TextField name;
    @FXML private TextField full_name;
    @FXML private TextField genders;
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
    @FXML private TextField A_id;
    @FXML private Button delete;
    @FXML private Button exp;
    @FXML private Button update;
    @FXML private Text st;
    String ID;
 
    
    
    @FXML
    public void searchS(){
        db_handler_student db=new db_handler_student();
        String id=A_id.getText();
        Student s=db.get_Student(id);
       
        String S_id=s.getAdmission_no();
         System.out.println(S_id);
            
          admission_no.setText(s.getAdmission_no());
          identity_no.setText(s.getIdentity_no());
          name.setText(s.getName());
          full_name.setText(s.getFull_name());
          genders.setText(s.getGender());
          dob.setText(s.getDob());
          date_of_admission.setText(s.getDate_of_admission());
          race.setText(s.getRace());
          religion.setText(s.getReligion());
          guardian_name.setText(s.getGuardian_name());
          address.setText(s.getAddress());
          leaving_date.setText(s.getLeaving_date());
          last_grade.setText(s.getLast_grade());
          leaving_c_no.setText(s.getLeaving_c_no());
          leaving_c_date.setText(s.getLeaving_c_date());
          String Status_S=s.getStatus();
          
          
          
          if(S_id.equals("Not_Available")){
              
              delete.setVisible(false);
              exp.setVisible(false);
              update.setVisible(false);
             st.setText(" ");
             A_id.setText(null);
             JOptionPane.showMessageDialog(null, "Invalid Admission No");
          }else{
              delete.setVisible(true);
               exp.setVisible(true);
              update.setVisible(true);
              ID=s.getAdmission_no();
              st.setText("Status : " +Status_S);
              
          } 
          
          
            
       // }
        
        
        
        
    }
    
    @FXML
    public void clear(){
        
          admission_no.setText(" ");
          identity_no.setText(" ");
          name.setText(" ");
          full_name.setText(" ");
          genders.setText(" ");
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
          st.setText(" ");
          A_id.setText(null);
         delete.setVisible(false);
              exp.setVisible(false);
              update.setVisible(false);
            ///  ID=null;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        // TODO
    } 
    
    @FXML
    public void update() throws SQLException{
        int res= JOptionPane.showConfirmDialog(null, "Are you do you want to update now", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res==JOptionPane.YES_NO_OPTION){
            try{
                Student s =new Student(admission_no.getText(),identity_no.getText(),name.getText(),full_name.getText(),genders.getText(),dob.getText(),date_of_admission.getText(),race.getText(),religion.getText(),guardian_name.getText(),address.getText(),leaving_date.getText(),last_grade.getText(),leaving_c_no.getText(),leaving_c_date.getText());
                db_handler_student db=new db_handler_student();
                db.update(s,ID);
                System.out.println("okk");
                 clear();
                JOptionPane.showMessageDialog(null, "Updated");

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, "Invalid Update");

            } 
        }
        
    }
    
    @FXML
    public void delete(){
        int res= JOptionPane.showConfirmDialog(null, " do you want to delete now", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res==JOptionPane.YES_NO_OPTION){
        
         
             String D_id =admission_no.getText();
        
            try{
            
                 db_handler_student db=new db_handler_student();
                 db.Delete(ID);
                 System.out.println("okk");
                 clear();
                 JOptionPane.showMessageDialog(null, "Deleted");
            
            
        }catch(SQLException e){
            
                JOptionPane.showMessageDialog(null, "Invalid delete");
            
            
        }
        
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
    
        @FXML
    public void expel() throws SQLException{
        int res= JOptionPane.showConfirmDialog(null, "do you want to expele this student", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res==JOptionPane.YES_NO_OPTION){
            try{
               // Student s =new Student(admission_no.getText(),identity_no.getText(),name.getText(),full_name.getText(),genders.getText(),dob.getText(),date_of_admission.getText(),race.getText(),religion.getText(),guardian_name.getText(),address.getText(),leaving_date.getText(),last_grade.getText(),leaving_c_no.getText(),leaving_c_date.getText());
                db_handler_student db=new db_handler_student();
               
                 db.Expel(ID);
                System.out.println("okk");
                 clear();
                JOptionPane.showMessageDialog(null, "Expeled");

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, "Invalid Expeled");

            } 
        }
        
    }
    
}
