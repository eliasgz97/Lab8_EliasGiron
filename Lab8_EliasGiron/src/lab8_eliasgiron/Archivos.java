package lab8_eliasgiron;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivos {
    private ArrayList<Hackeo> hacks = new ArrayList();
    private File archivo = null;

    public Archivos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Hackeo> getHacks() {
        return hacks;
    }

    public void setHackeos(ArrayList<Hackeo> hackeos) {
        this.hacks = hackeos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "hacks=" + hacks;
    }

    public void setPersona(Hackeo p) {
        this.hacks.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Hackeo t : hacks) {
                bw.write(t.getCodigo() + ";");
                bw.write(t.getRiesgo()+ ";");
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner write = null;
 
        hacks= new ArrayList();
        if (archivo.exists()) {
            try {
                write = new Scanner(archivo);
                
                write.useDelimiter(";");
                while (write.hasNext()) {
                    String nom = write.next();
                    int edad = write.nextInt();
                    hacks.add(new Hackeo(nom, edad));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            write.close();
        }
    }
}
