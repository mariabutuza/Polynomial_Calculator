import businessLogic.Operations;
import dataModels.Polynomial;
import org.junit.jupiter.api.Test;
import dataModels.Polynomial;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationsTest {
    //testarea cu JUnit a fiecarei operatii
    @Test
    public void addTest(){
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();

        HashMap<Integer, Double> polynomial = new HashMap<>();
        polynomial.put(3, 1.0);
        polynomial.put(2, 2.0);
        polynomial.put(1, 6.0);
        polynomial.put(0, 5.0);
        p1.setPolinom(polynomial);

        HashMap<Integer, Double> polynomial2 = new HashMap<>();
        polynomial2.put(2, 3.0);
        polynomial2.put(1, 0.0);
        //polynomial2.put(0, 0.0);
        p2.setPolinom(polynomial2);
        Polynomial res = new Polynomial();
        res = Operations.add(p1,p2);

        //in functie de puterea fiecarui monom al polinomului se va compara coeficientul
        assertEquals(5,res.getPolinom().get(0));
        assertEquals(6,res.getPolinom().get(1));
        assertEquals(5,res.getPolinom().get(2));
        assertEquals(1,res.getPolinom().get(3));
    }
    @Test
    public void addTest1(){
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();

        HashMap<Integer, Double> polynomial = new HashMap<>();
        polynomial.put(3, 1.0);
        polynomial.put(2, 2.0);
        polynomial.put(1, 6.0);
        polynomial.put(0, 5.0);
        p1.setPolinom(polynomial);

        HashMap<Integer, Double> polynomial2 = new HashMap<>();
        polynomial2.put(2, 3.0);
        polynomial2.put(1, 0.0);
        //polynomial2.put(0, 0.0);
        p2.setPolinom(polynomial2);
        Polynomial res = new Polynomial();
        res = Operations.add(p1,p2);

        assertEquals(5,res.getPolinom().get(0));
        assertEquals(6,res.getPolinom().get(1));
        assertEquals(5,res.getPolinom().get(2));
        assertEquals(8,res.getPolinom().get(3));
    }
    @Test
    public void subTest(){
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();

        HashMap<Integer, Double> polynomial = new HashMap<>();
        polynomial.put(3, 1.0);
        polynomial.put(2, 2.0);
        polynomial.put(1, 6.0);
        polynomial.put(0, 5.0);
        p1.setPolinom(polynomial);

        HashMap<Integer, Double> polynomial2 = new HashMap<>();
        polynomial2.put(2, 3.0);
        polynomial2.put(1, 0.0);
        p2.setPolinom(polynomial2);

        Polynomial res = new Polynomial();
        res = Operations.sub(p1,p2);

        assertEquals(5,res.getPolinom().get(0));
        assertEquals(6,res.getPolinom().get(1));
        assertEquals(-1,res.getPolinom().get(2));
        assertEquals(1,res.getPolinom().get(3));
    }

    @Test
    public void multyTest(){
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();

        HashMap<Integer, Double> polynomial = new HashMap<>();
        polynomial.put(3, 1.0);
        polynomial.put(2, 2.0);
        polynomial.put(1, 6.0);
        polynomial.put(0, 5.0);
        p1.setPolinom(polynomial);

        HashMap<Integer, Double> polynomial2 = new HashMap<>();
        polynomial2.put(2, 3.0);
        polynomial2.put(1, 1.0);
        p2.setPolinom(polynomial2);

        Polynomial res = new Polynomial();
        res = Operations.multy(p1,p2);

        assertEquals(null,res.getPolinom().get(0));
        assertEquals(5,res.getPolinom().get(1));
        assertEquals(6,res.getPolinom().get(2));
        assertEquals(2,res.getPolinom().get(3));
        assertEquals(1,res.getPolinom().get(4));
        assertEquals(3,res.getPolinom().get(5));
    }
    @Test
    public void derivTest() {
        Polynomial p1 = new Polynomial();

        HashMap<Integer, Double> polynomial = new HashMap<>();
        polynomial.put(3, 1.0);
        polynomial.put(2, 2.0);
        polynomial.put(1, 6.0);
        polynomial.put(0, 5.0);
        p1.setPolinom(polynomial);

        Polynomial res = new Polynomial();
        res = Operations.deriv(p1);

        assertEquals(6, res.getPolinom().get(0));
        assertEquals(4, res.getPolinom().get(1));
        assertEquals(3, res.getPolinom().get(2));
    }

    @Test
    public void integTest() {
        Polynomial p1 = new Polynomial();

        HashMap<Integer, Double> polynomial = new HashMap<>();
        polynomial.put(3, 1.0);
        polynomial.put(2, 2.0);
        polynomial.put(1, 6.0);
        polynomial.put(0, 5.0);
        p1.setPolinom(polynomial);

        Polynomial res = new Polynomial();
        res = Operations.integ(p1);

        assertEquals(null, res.getPolinom().get(0));
        assertEquals(5, res.getPolinom().get(1));
        assertEquals(3, res.getPolinom().get(2));
        assertEquals(0.6666666666666666, res.getPolinom().get(3));
        assertEquals(0.25, res.getPolinom().get(4));
    }

}