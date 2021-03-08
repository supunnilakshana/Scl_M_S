/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.menu;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author User
 */
class acces extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("menu/menu.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
       stage.initStyle(StageStyle.UTILITY);
     // stage.resizableProperty().setValue(Boolean.FALSE);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public  void runS(String[] args) {
        launch(args);
    }
    
}
