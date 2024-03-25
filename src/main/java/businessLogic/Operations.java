package businessLogic;

import dataModels.Polynomial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Operations {

    //operatie de adunare
    public static Polynomial add(Polynomial p1, Polynomial p2)
    {
        Polynomial res = new Polynomial();
        HashMap<Integer,Double> pmap = new HashMap<>();
        for (Map.Entry<Integer, Double> term1 : p1.getPolinom().entrySet()) {
            int p = term1.getKey();
            double c = term1.getValue();
            if (p2.getPolinom().get(p)!=null) {
                //verific daca gasesc puterea in p2
                c += p2.getPolinom().get(p);
                if (c != 0) {
                    pmap.put(p, c);
                }
            } else {
                pmap.put(p, c);
            }
        }
        //daca nu mai gasesc in p1 vreo putere care apare in p2, adaug in hash aia din p2
        for (Map.Entry<Integer, Double> term2 : p2.getPolinom().entrySet()) {
            int pp = term2.getKey();
            double cc = term2.getValue();
            if (!p1.getPolinom().containsKey(pp)) {
                pmap.put(pp, cc);
            }
        }
        res.setPolinom(pmap);
        return res;
    }

    //operatie de scadere
    public static Polynomial sub(Polynomial p1, Polynomial p2)
    {
        Polynomial res = new Polynomial();
        HashMap<Integer,Double> pmap = new HashMap<>();
        Polynomial c = new Polynomial();
        for(Map.Entry<Integer, Double> term1  : p2.getPolinom().entrySet()){
            double a = 0 - term1.getValue();
            int b = term1.getKey();
            pmap.put(b,a);
        }
        c.setPolinom(pmap);
        res = add(p1,c);
        return res;
    }

    //operatie de inmultire
    public static Polynomial multy(Polynomial p1, Polynomial p2) {
        Polynomial res = new Polynomial();
        HashMap<Integer, Double> pmap = new HashMap<>();
        int power;
        double coeff;
        for (Map.Entry<Integer, Double> term1  : p1.getPolinom().entrySet())
        {
            for (Map.Entry<Integer, Double> term2 : p2.getPolinom().entrySet())
            {
                power = term1.getKey() + term2.getKey();
                coeff = term1.getValue() * term2.getValue();
                if (coeff != 0)
                    pmap.put(power, coeff);
            }
        }
        res.setPolinom(pmap);
        return res;
    }

    //derivarea polinomului
    public static Polynomial deriv(Polynomial p1) {
        Polynomial res = new Polynomial();
        HashMap<Integer, Double> pmap = new HashMap<>();
        int power;
        double coeff;
        for (Map.Entry<Integer, Double> term1  : p1.getPolinom().entrySet())
        {
            coeff = term1.getKey() * term1.getValue();
            power = term1.getKey()-1;
            if (coeff != 0)
                pmap.put(power, coeff);
        }
        res.setPolinom(pmap);
        return res;
    }

    //integrarea polinomului
    public static Polynomial integ(Polynomial p1) {
        Polynomial res = new Polynomial();
        HashMap<Integer, Double> pmap = new HashMap<>();
        int power;
        double coeff;
        for (Map.Entry<Integer, Double> term1  : p1.getPolinom().entrySet())
        {
            power = term1.getKey() + 1;
            coeff = term1.getValue()/power;
            if (coeff != 0)
                pmap.put(power, coeff);
        }
        res.setPolinom(pmap);
        return res;
    }
}
