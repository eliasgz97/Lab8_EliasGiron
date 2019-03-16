package lab8_eliasgiron;

import javax.swing.JProgressBar;

public class administrarHack extends Thread {

    private JProgressBar pgb_hack;
    private boolean avanzar = true;
    private boolean vive = true;
    private int duracion = 5;

    public administrarHack(JProgressBar pgb_hack) {
        this.pgb_hack = pgb_hack;
        this.avanzar = true;
        this.vive = true;
    }

    public JProgressBar getPgb_hack() {
        return pgb_hack;
    }

    public void setPgb_hack(JProgressBar pgb_hack) {
        this.pgb_hack = pgb_hack;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void run() {
        int cont = 1;
        while (vive) {
            if (avanzar && cont <= duracion) {
                pgb_hack.setValue(cont);
                cont++;

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
