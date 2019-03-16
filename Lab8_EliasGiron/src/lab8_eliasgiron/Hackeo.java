package lab8_eliasgiron;

import javax.swing.JOptionPane;

public class Hackeo {

    private String codigo;
    private int riesgo;

    public Hackeo(String codigo, int riesgo) {
        this.codigo = codigo;
        this.riesgo = riesgo;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    @Override
    public String toString() {
        return codigo + " - "+riesgo;
    }

}
