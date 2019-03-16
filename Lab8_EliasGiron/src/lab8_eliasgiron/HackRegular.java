package lab8_eliasgiron;

import javax.swing.JOptionPane;

public class HackRegular extends Hackeo {

    private int contexitosos;

    public HackRegular(String codigo, int riesgo) {
        super(codigo, riesgo);

    }
//
//    public int calcular_riesgo(int riesgo) {
//        while (riesgo < 1 && riesgo > 5) {
//            JOptionPane.showMessageDialog(null, "El riesgo no puede ser mayor a 5 o menor a 1");
//        }
//        return riesgo;
//    }

    public int getContexitosos() {
        return contexitosos;
    }

    public void setContexitosos(int contexitosos) {
        this.contexitosos = contexitosos;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
