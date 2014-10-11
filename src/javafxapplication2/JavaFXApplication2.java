/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import emp.Employee;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author song
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("JavaFXApplication2PU");
        EntityManager entityManager = entityFactory.createEntityManager();
        entityManager.getTransaction().begin();
        
        Employee song = new Employee();
        song.setName("SongZheng");
        song.setCity("Maspeth");
        
        entityManager.persist(song);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityFactory.close();
        launch(args);
    }
    
}
