package dataModels;

import businessLogic.Operations;
import graphicalUserInterface.View;

import javax.swing.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        View v = new View();
        //v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //v.setSize(300, 200);
        //v.setVisible(true);
        /*Polynomial p = new Polynomial();
        HashMap<Integer, Double> polynomial = new HashMap<>();
        polynomial.put(3, 1.0);
        polynomial.put(2, 2.0);
        polynomial.put(1, 6.0);
        polynomial.put(0, 5.0);
        p.setPolinom(polynomial);
        String x = p.afis(p);
        System.out.println(x);

        Polynomial p2 = new Polynomial();
        HashMap<Integer, Double> polynomial2 = new HashMap<>();
        polynomial2.put(2, 3.0);
        polynomial2.put(1, 0.0);
        polynomial2.put(0, 0.0);
        p2.setPolinom(polynomial2);
        String x2 = p2.afis(p2);
        System.out.println(x2);

        Polynomial a = new Polynomial();
        Polynomial s = new Polynomial();
        Polynomial m = new Polynomial();
        Polynomial d = new Polynomial();
        Polynomial i = new Polynomial();

        a = Operations.add(p,p2);
        s = Operations.sub(p,p2);
        m = Operations.multy(p,p2);
        d = Operations.deriv(p);
        i = Operations.integ(p);


        System.out.println("p1(x) + p2(x) = " + a.afis(a));
        System.out.println("p1(x) - p2(x) = " + s.afis(s));
        System.out.println("p1(x) * p2(x) = " + m.afis(m));
        System.out.println("p1'(x) = " + d.afis(d));
        System.out.println("S p1(x) dx = " + i.afis(i));*/
    }
}