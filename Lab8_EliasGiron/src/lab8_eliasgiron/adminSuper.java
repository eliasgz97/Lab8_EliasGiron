package lab8_eliasgiron;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminSuper {
     private ArrayList<Hackeo> hackssuper = new ArrayList();
    private File archivo = null;
    
    public adminSuper(String path) {
        archivo = new File(path);
    }

    public ArrayList<Hackeo> getHacksSupers() {
        return hackssuper;
    }

    public void setHacksSupers(ArrayList<Hackeo> hacksssuper) {
        this.hackssuper = hacksssuper;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setHackSuper(HackSuper a){
        hackssuper.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            hackssuper = new ArrayList();
            Hackeo temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Hackeo) objeto.readObject()) != null) {
                        hackssuper.add(temp);
                        
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
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
            for (Hackeo t : hackssuper) {
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
