
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class listaCientificos {
    private ArrayList<Cientifico> listCientificos = new ArrayList();
    private File archivo = null;
    
    public listaCientificos(String path){
        archivo = new File(path);
    }

    public ArrayList<Cientifico> getListCientificos() {
        return listCientificos;
    }

    public void setListCientificos(ArrayList<Cientifico> listCientificos) {
        this.listCientificos = listCientificos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaCientificos{" + "listCientificos=" + listCientificos + ", archivo=" + archivo + '}';
    }
     public void setCientifico(Cientifico c) {
        this.listCientificos.add(c);
    }
     
     public void cargarArchivo() {
        try {            
            listCientificos = new ArrayList();
            Cientifico temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Cientifico) objeto.readObject()) != null) {
                        listCientificos.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Cientifico t : listCientificos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

    
}
