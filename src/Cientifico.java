
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Cientifico implements Serializable{
    private String nombreCient;
    private  ArrayList<planeta> planetas;

    
    public Cientifico(String nombreCient) {
        this.nombreCient = nombreCient;
    }

    public String getNombreCient() {
        return nombreCient;
    }

    public void setNombreCient(String nombreCient) {
        this.nombreCient = nombreCient;
    }

    public ArrayList<planeta> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<planeta> planetas) {
        this.planetas = planetas;
    }

    @Override
    public String toString() {
        return nombreCient;
    }
    
    
}
