/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.menu;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TeachController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    public void enter(ActionEvent event) throws IOException{
        
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("/school/teacher/enter.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.hide(); //optional
                app_stage.setScene(home_page_scene);
                 
                app_stage.show();        
        
    }
    
    @FXML
    public void edit(ActionEvent event) throws IOException{
        
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("/school/teacher/edit.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.hide(); //optional
                app_stage.setScene(home_page_scene);
                 
                app_stage.show();        
        
    }
    @FXML
    public void in(){
    
              Desktop desktop = java.awt.Desktop.getDesktop();
		try {
			//specify the protocol along with the URL
			URI oURL = new URI(
					"http://localhost/school/teacher/in_t.php");
           try {
               desktop.browse(oURL);
           } catch (IOException ex) {
               Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
           }
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    
    
    
    
}
    
       @FXML
    public void out(){
    
              Desktop desktop = java.awt.Desktop.getDesktop();
		try {
			//specify the protocol along with the URL
			URI oURL = new URI(
					"http://localhost/school/teacher/out_t.php");
           try {
               desktop.browse(oURL);
           } catch (IOException ex) {
               Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
           }
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    
    
    
    
}
    
    
       @FXML
    public void all(){
    
              Desktop desktop = java.awt.Desktop.getDesktop();
		try {
			//specify the protocol along with the URL
			URI oURL = new URI(
					"http://localhost/school/teacher/all_t.php");
           try {
               desktop.browse(oURL);
           } catch (IOException ex) {
               Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
           }
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    
    
    
    
}
    
         @FXML
    public void back(ActionEvent event) throws IOException{
        
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("/school/main/mainmenu.fxml"));
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
