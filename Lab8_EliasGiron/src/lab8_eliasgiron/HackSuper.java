package lab8_eliasgiron;

import javax.swing.JOptionPane;

public class HackSuper extends Hackeo {
    private int cont_fallidos;
    public HackSuper(String codigo, int riesgo) {
        super(codigo, riesgo);
        
    }
//    public int calcular_riesgo(int riesgo) {
//        if (riesgo < 1 && riesgo > 5) {
//            JOptionPane.showMessageDialog(null, "El riesgo no puede ser mayor a 5 o menor a 1");
//        }
//        return riesgo;
//    }

    public int getCont_fallidos() {
        return cont_fallidos;
    }

    public void setCont_fallidos(int cont_fallidos) {
        this.cont_fallidos = cont_fallidos;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    

}
