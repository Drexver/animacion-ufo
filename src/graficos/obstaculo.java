/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

/**
 *
 * @author Estudiante
 */
public class obstaculo extends Objeto {
private boolean estado;
    public obstaculo(int x, int y) {
        super(x, y);
        this.estado = true;
    }
    

    @Override
    public void mover() {
       
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
   
}
