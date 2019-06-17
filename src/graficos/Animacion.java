/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;



import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Estudiante
 */
public class Animacion extends AnimationTimer{
       private Carro carro;
       private GraphicsContext lapiz;
       int v = 90;
       private obstaculo obs;
       private obstaculo obs1;
       private Image fondo;
       private Image alien;
       private int c = 0 ;
       private int r = 0;
    public Animacion(GraphicsContext lapiz) {
        this.carro =  new Carro(0,100);
        this.lapiz = lapiz;
        this.fondo = new Image("imagenes/fondo.png");
        this.alien = new Image("imagenes/ufo_0.png");
        this.obs = new obstaculo(500,this.carro.getY());
        this.obs1 = new obstaculo(200,this.carro.getY());
    }
       
    @Override
    public void handle(long l) {
lapiz.setFill(Color.ORANGE);
lapiz.clearRect(0, 0, 1024, 512);
lapiz.drawImage(fondo, 0, 0);
lapiz.drawImage(alien,this.carro.getX(),this.carro.getY());
/*lapiz.fillRect(this.carro.getX(),this.carro.getY(), 30, 15);
lapiz.setFill(Color.BLACK);
lapiz.fillOval(this.carro.getX()+3, this.carro.getY()+12, 10, 10);
lapiz.fillOval(this.carro.getX()+17, this.carro.getY()+12, 10, 10);
lapiz.setFill(Color.ORANGE);
lapiz.fillRect(this.carro.getX()+5, this.carro.getY()-10, 20, 10);
*/lapiz.fillRect(500,10,v,20);
lapiz.fillRect(500,this.carro.getY(),20,20);
lapiz.fillRect(200,this.carro.getY(),20,20);
Shape alien = new Rectangle(this.carro.getX(), this.carro.getY()-10,30,20);
Shape obstaculo = new Rectangle(500,this.carro.getY(),20,20);
Shape obstaculo1 = new Rectangle(500,this.carro.getY(),20,20);
Shape inter = SVGPath.intersect(alien,obstaculo1);
Shape inter1 = SVGPath.intersect(alien,obstaculo);
c++;
if(c%5 == 0){
    r++;
    if(r>5){
        r =0;
           
}
    this.alien = new Image("imagenes/ufo_"+r+".png");
}
if( inter.getLayoutBounds().getWidth()!=-1 && obs.isEstado() == true){
   v = v-20;
    this.obs.setEstado(false);
}

if( inter1.getLayoutBounds().getWidth()!=-1&&obs1.isEstado() == true){
    v =v-20;
    this.obs1.setEstado(false);
}
this.carro.mover();
    } 
}
