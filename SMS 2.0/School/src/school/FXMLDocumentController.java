  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import sun.security.util.Password;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.stage.StageStyle;
import school.menu.MenuController;
/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    
    
   @FXML private TextField un;
   @FXML private PasswordField pw;
  
   
   
    
    @FXML
    private void log(ActionEvent event) throws Exception { 
       
        String UN =String.valueOf(un.getText());
        String PW =String.valueOf(pw.getText());
        
        
        if (UN.equals("admin123")&&PW.equals("c21484")) {
            
            System.out.print("logged");
                Parent home_page_parent = FXMLLoader.load(getClass().getResource("main/mainmenu.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.hide(); //optional
                app_stage.setScene(home_page_scene);
                
                app_stage.show();
            
            
            
        }else{
            System.out.print("False");
            JOptionPane.showMessageDialog(null, "Invalid username or password");
            un.setText("");
            pw.setText("");
        }
        
     
        
    }
    
    @FXML
    public void Close(){
         int res= JOptionPane.showConfirmDialog(null, "Are you do you want to exit now", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(res==JOptionPane.YES_NO_OPTION){
        System.exit(0);
        } 
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        // TODO
    }    
    
}
