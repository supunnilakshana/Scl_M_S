/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.scolar;

import db_handle.db_scloar;
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
public class EnterController implements Initializable {

    @FXML private TextField Admission_no;
    @FXML private TextField Indext_no;
    @FXML private TextField Year;
    @FXML private TextField Pass_mark;
    @FXML private TextField Own_mark;
    @FXML private Text Name;
    @FXML private Button Add;
    private String ID;
    private Scolar s;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         Name.setText("");
        Admission_no.setText("");
        Indext_no.setText("");
        Own_mark.setText("");
           Indext_no.setEditable(false);
            Own_mark.setEditable(false);
            Add.setDisable(true);
        
    }    
   @FXML
    public void check(){
        
        s=new Scolar(Admission_no.getText());
        Student st=s.getS();
        if(s.isRight()==1){
            Name.setText("Student Name : "+st.getFull_name());
            ID=Admission_no.getText();
            Indext_no.setEditable(true);
            Own_mark.setEditable(true);
            Add.setDisable(false);
            
            
            
            
        }else{
            
             Name.setText("Invalid Admission No ");
             clear();
             
        }
        
        
        
    }
    @FXML
    public void clear(){
        
        Name.setText("");
        Admission_no.setText("");
        Indext_no.setText("");
        Own_mark.setText("");
        
        Indext_no.setEditable(false);
        Own_mark.setEditable(false);
        Add.setDisable(true);
        
        
        
        
    }
    @FXML
    public void add(){
        
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
                        s.setIndext_no(in);
                        s.setOwn_marks(om);
                        s.setYear(y);
                        s.setPass_mark(pm);
                        s.setStatus();
                        db_scloar ds=new db_scloar();
                        ds.add_result(s);
                        JOptionPane.showMessageDialog(null, "Added sucessfully");
                        clear();
                }catch(SQLException e){

                    JOptionPane.showMessageDialog(null, "Invalid ! Try again!!");
                }
            
            }else{
                
                JOptionPane.showMessageDialog(null, "Invalid year or mark type! Try again!!");
                
            }
            
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
    
}
