/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Graficos extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
       
    }

    @Override
    public void start(Stage stage) throws Exception {
      
    Pane panel = new Pane();
    Canvas tablero = new Canvas( 1024,512);
    panel.getChildren().add(tablero);
    Scene escena= new Scene(panel, 1024, 512, Color.YELLOWGREEN);
    GraphicsContext lapiz = tablero.getGraphicsContext2D();
    stage.setScene(escena);
    stage.setTitle("Navegando en mi automovil y hablando con la nena por el movil...");
    stage.show();
     Animacion a=new Animacion(lapiz);
        a.start();
    }
    
}
