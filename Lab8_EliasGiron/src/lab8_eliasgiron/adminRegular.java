package lab8_eliasgiron;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminRegular {

    private ArrayList<HackRegular> hacksregular = new ArrayList();
    private File archivo = null;

    public adminRegular(String path) {
        archivo = new File(path);
    }

    public ArrayList<HackRegular> getHacksregular() {
        return hacksregular;
    }

    public void setListaPersonas(ArrayList<HackRegular> hacksregular) {
        this.hacksregular = hacksregular;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setHackregular(HackRegular a) {
        hacksregular.add(a);
    }

    public void cargarArchivo() {
        try {
            hacksregular = new ArrayList();
            HackRegular temp = null;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                temp = (HackRegular)objeto.readObject();
                hacksregular.add(temp); //encontro el final del archivo
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
            for (HackRegular t : hacksregular) {
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
