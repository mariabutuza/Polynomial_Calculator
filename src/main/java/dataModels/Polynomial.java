package dataModels;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Polynomial {
    private HashMap<Integer,Double> polinom;
    public Polynomial()
    {
        polinom = new HashMap<Integer,Double>();
    }
    public void setPolinom(HashMap<Integer, Double> polinom) {
        this.polinom = polinom;
    }
    public HashMap<Integer, Double> getPolinom() {
        return polinom;
    }

    //functie de afisare a polinomului
    public String afis(Polynomial x) {
        String afisare = "";
        for(Map.Entry<Integer, Double> term1  : x.getPolinom().entrySet()){
            double a = term1.getValue();
            int b = term1.getKey();
            if (a!=0.0) {
                afisare = afisare + a + "*x^" + b + "  ";
            }
        }
        return afisare;
    }
}