package graphicalUserInterface;

import businessLogic.Operations;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View v;
    private Model m;
    public Controller(Model m, View v)
    {
        this.m = m;
        this.v = v;
        v.Adunare(new Adunare());
        v.Scadere(new Scadere());
        v.Inmultire(new Inmultire());
        v.Derivare(new Derivare());
        v.Integrare(new Integrare());
    }

    //implementarea evenimentelor pt fiecare apasare de buton
    class Adunare implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(v.getButtonAdd() == e.getSource()){
                String pol1 = v.getPol1().getText();
                String pol2 = v.getPol2().getText();
                m.add(pol1,pol2);
            }
        }
    }
    class Scadere implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(v.getButtonSub() == e.getSource()) {
                //System.out.println("x");
                String pol1 = v.getPol1().getText();
                String pol2 = v.getPol2().getText();
                m.sub(pol1, pol2);
            }
        }
    }

    class Inmultire implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(v.getButtonMulty() == e.getSource()){
                String pol1 = v.getPol1().getText();
                String pol2 = v.getPol2().getText();
                m.multy(pol1,pol2);
            }
        }
    }

    class Derivare implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(v.getButtonDeriv() == e.getSource()){
                String pol1 = v.getPol1().getText();
                m.deriv(pol1);
            }
        }
    }

    class Integrare implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(v.getButtonInteg() == e.getSource()){
                String pol1 = v.getPol1().getText();
                m.integ(pol1);
            }
        }
    }
}
