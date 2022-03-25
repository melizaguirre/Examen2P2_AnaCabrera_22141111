
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class planeta implements Serializable {
    protected String nombre;
    protected int tam; //Tamaño
    protected int peso;
    protected int X;
    protected int Y;

    public planeta(String nombre, int tam, int peso, int X, int Y) {
        this.nombre = nombre;
        this.tam = tam;
        this.peso = peso;
        this.X = X;
        this.Y = Y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    @Override
    public String toString() {
        return "planeta{" + "nombre=" + nombre + ", tam=" + tam + ", peso=" + peso + ", X=" + X + ", Y=" + Y + '}';
    }
    
    
    
    
    
}
