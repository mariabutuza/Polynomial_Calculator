package graphicalUserInterface;
import businessLogic.Operations;
import dataModels.Polynomial;

import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Model {
    private View v;
    public Model(View v) {
        this.v = v;
    }

    //se transforma Stringul introdus de utilizator in polinom
    public static Polynomial extragerePolinom(String pol1){
        Pattern pattern = Pattern.compile("(\\-?\\d*(\\.\\d*)?)\\*x\\^(\\d{1,9})[+-]?");
        Matcher matcher = pattern.matcher(pol1);
        Polynomial rezultat = new Polynomial();
        HashMap<Integer, Double> polynomial = new HashMap<>();
        while(matcher.find())
        {
            int put = Integer.parseInt(matcher.group(3));
            double num = Double.parseDouble(matcher.group(1));
            polynomial.put(put,num);
        }
        rezultat.setPolinom(polynomial);
        return rezultat;
    }

    public void add(String pol1,String pol2){
        Polynomial poli1 = extragerePolinom(pol1);
        Polynomial poli2 = extragerePolinom(pol2);
        Polynomial res = new Polynomial();
        if(poli1.getPolinom().size()>poli2.getPolinom().size()){
            res=Operations.add(poli1,poli2);
        }
        else {
            res = Operations.add(poli2,poli1);
        }
        v.getRes().setText(poli1.afis(res));
    }

    public void sub(String pol1,String pol2){
        Polynomial poli1 = extragerePolinom(pol1);
        Polynomial poli2 = extragerePolinom(pol2);
        Polynomial res = new Polynomial();
        res=Operations.sub(poli1,poli2);
        v.getRes().setText(poli1.afis(res));
    }

    public void multy(String pol1,String pol2)
    {
        Polynomial poli1 = extragerePolinom(pol1);
        Polynomial poli2 = extragerePolinom(pol2);
        Polynomial res = Operations.multy(poli1,poli2);
        v.getRes().setText(poli1.afis(res));
    }

    public void deriv(String pol1)
    {
        Polynomial poli1 = extragerePolinom(pol1);
        Polynomial res = Operations.deriv(poli1);
        v.getRes().setText(poli1.afis(res));
    }

    public void integ(String pol1)
    {
        Polynomial poli1 = extragerePolinom(pol1);
        Polynomial res = Operations.integ(poli1);
        v.getRes().setText(poli1.afis(res));
    }
}
