/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.scolar;

import db_handle.db_handler_student;
import db_handle.db_scloar;
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
import obj.Scolar;
import obj.Student;

/**
 * FXML Controller class
 *
 * @author User
 */
public class EditController implements Initializable {
    
    @FXML private TextField Admission_no;
    @FXML private TextField Indext_no;
    @FXML private TextField Year;
    @FXML private TextField Pass_mark;
    @FXML private TextField Own_mark;
    @FXML private Text Name;
    @FXML private Text Status;
    @FXML private Button Update;
    @FXML private Button Delete;
    @FXML private Button Clear;
    private String IN_id;
    private String ID;
    private Scolar s;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Name.setText("");
        Admission_no.setText("");
        Indext_no.setText("");
        Own_mark.setText("");
        Year.setText("");
        Pass_mark.setText("");
        Status.setText("");
        Indext_no.setEditable(false);
        Own_mark.setEditable(false);
        Year.setEditable(false);
        Pass_mark.setEditable(false);
        Update.setDisable(true);
        Delete.setDisable(true);
        Clear.setDisable(true);
        
        
        
    } 
    
    @FXML
    public void clear(){
        
        
        Name.setText("");
        Admission_no.setText("");
        Indext_no.setText("");
        Own_mark.setText("");
        Year.setText("");
        Pass_mark.setText("");
        Status.setText("");
        Admission_no.setText("");
        Indext_no.setEditable(false);
        Own_mark.setEditable(false);
        Year.setEditable(false);
        Pass_mark.setEditable(false);
        Update.setDisable(true);
        Delete.setDisable(true);
        Clear.setDisable(true);
        
        
        
        
    }
    
    
    @FXML
    public void check(){
        String id=Admission_no.getText();
        db_scloar ds=new db_scloar();
        Scolar s=ds.getschoal(id);
        s.setStudent();
        Student st=s.getS();
        if((s.getIndext_no()).equals("Not_Available")){
            
            clear();
             Name.setText("Not available result for this admission no ");
            
        }else{    
            Name.setText("Student Name : "+st.getFull_name());
            IN_id=s.getIndext_no();
            ID=Admission_no.getText();
            Year.setText(s.getYear());
            Pass_mark.setText(s.getPass_mark());
            Indext_no.setText(s.getIndext_no());
            Own_mark.setText(s.getOwn_marks());
            Status.setText("Result status : "+s.getStatus() );
            Indext_no.setEditable(true);
            Own_mark.setEditable(true);
            Year.setEditable(true);
            Pass_mark.setEditable(true);
            Update.setDisable(true);
            Update.setDisable(false);
            Delete.setDisable(false);
            Clear.setDisable(false);

             
        }
        
    }
    
    @FXML
    public void back(ActionEvent event) throws IOException{
        
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("/school/menu/scloar.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.hide(); //optional
                app_stage.setScene(home_page_scene);
               
               app_stage.show();
            
        
        
    }
    @FXML
    public void update(){
        int res= JOptionPane.showConfirmDialog(null, "Are you do you want to update now", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res==JOptionPane.YES_NO_OPTION){
        String y=Year.getText();
        String pm=Pass_mark.getText();
        String in=Indext_no.getText();
        String om=Own_mark.getText();
         
        if((y.equals("")||pm.equals("")||in.equals("")||om.equals(""))){
            
             JOptionPane.showMessageDialog(null, "please fill all fileds ");
        }else{
         
         int yc=Integer.parseInt(Year.getText()) ; 
         int pmc=Integer.parseInt(Pass_mark.getText()) ; 
         int omc=Integer.parseInt(Own_mark.getText()) ; 
         
            if((0<=pmc&&200>=pmc)&&(0<=omc&&200>=omc)&&(1990<=yc&&2090>=yc)){
                try{
                        System.out.println("okk");
                        Scolar c=new Scolar();
                        c.setAdminssion_no(ID);
                        c.setIndext_no(in);
                       c.setOwn_marks(om);
                       c.setYear(y);
                      c.setPass_mark(pm);
                      c.setStatus();
                      //   
                       System.out.println("dfdfdf"+IN_id);
                      db_scloar ds=new db_scloar();
                      ds.update(c,IN_id);
                      
                        JOptionPane.showMessageDialog(null, "Updated sucessfully");
                        clear();
                }catch(HeadlessException | SQLException e){

                    //JOptionPane.showMessageDialog(null, "Invalid ! Try again!!");
                }
            
                 }else{
                
                     JOptionPane.showMessageDialog(null, "Invalid year or mark type! Try again!!");
                    
            }
            
        }
        
        
        }  
        
    }
    
    @FXML
    public void delete(){
        int res= JOptionPane.showConfirmDialog(null, " do you want to delete now", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res==JOptionPane.YES_NO_OPTION){

        
            try{
            
                db_scloar ds=new db_scloar();
                ds.Delete(ID);
                 System.out.println("okk");
                 clear();
                 JOptionPane.showMessageDialog(null, "Deleted");
            
            
        }catch(SQLException e){
            
                JOptionPane.showMessageDialog(null, "Invalid delete");
            
            
        }
        
       } 
        
    }
    
    
}
