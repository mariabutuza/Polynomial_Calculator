package graphicalUserInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame{
    private JFrame frame;
    private JButton buttonAdd;
    private JButton buttonSub;
    private JButton buttonMulty;
    private JButton buttonImp;
    private JButton buttonDeriv;
    private JButton buttonInteg;
    private JTextField pol1;
    private JTextField pol2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField res;
    private JLabel exLabel;

    public View() {
        this.buttonAdd = new JButton("+");
        this.buttonSub = new JButton("-");
        this.buttonMulty = new JButton("*");
        this.buttonImp = new JButton("/");
        this.buttonDeriv = new JButton("∂");
        this.buttonInteg = new JButton("∫");
        this.pol1 = new JTextField();
        this.pol2 = new JTextField();
        this.res = new JTextField();
        this.label1 = new JLabel("CALCULATOR");
        this.label2 = new JLabel("First polynomial:");
        this.label3 = new JLabel("Second polynomial:");
        this.label4 = new JLabel("Choose your operation:");
        this.label5 = new JLabel("Result:");
        this.exLabel = new JLabel("Ex: 1*x^1+2*x^2+3*x^3");
        initialize();
    }

    public void initialize(){

        frame = new JFrame();
        frame.setBounds(100, 100, 755, 540);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);

        buttonAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonSub.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonMulty.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonImp.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonDeriv.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonInteg.setFont(new Font("Tahoma", Font.BOLD, 20));
        label1.setFont(new Font("Calibri", Font.BOLD, 28));
        label2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        label3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        label4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label5.setFont(new Font("Times New Roman", Font.BOLD, 20));

        buttonAdd.setBounds(67, 278, 85, 52);
        buttonSub.setBounds(189, 278, 85, 52);
        buttonMulty.setBounds(67, 346, 85, 52);
        buttonImp.setBounds(189, 346, 85, 52);
        buttonDeriv.setBounds(67, 419, 85, 52);
        buttonInteg.setBounds(189, 419, 85, 52);
        label1.setBounds(267, 45, 235, 39);
        label2.setBounds(10, 103, 203, 26);
        label3.setBounds(35, 135, 166, 26);
        label4.setBounds(10, 220, 203, 39);
        label5.setBounds(459, 361, 120, 26);
        pol1.setBounds(201, 109, 166, 19);
        pol2.setBounds(201, 139, 166, 19);
        res.setBounds(530, 361, 136, 25);
        exLabel.setBounds(224, 161, 152, 13);

        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setHorizontalAlignment(SwingConstants.CENTER);

        pol1.setColumns(10);
        pol2.setColumns(10);
        res.setColumns(10);

        pol1.setVisible(true);
        pol2.setVisible(true);
        res.setVisible(true);

        frame.getContentPane().add(this.buttonAdd);
        frame.getContentPane().add(this.buttonSub);
        frame.getContentPane().add(this.buttonMulty);
        frame.getContentPane().add(this.buttonImp);
        frame.getContentPane().add(this.buttonDeriv);
        frame.getContentPane().add(this.buttonInteg);
        frame.getContentPane().add(label1);
        frame.getContentPane().add(label2);
        frame.getContentPane().add(label3);
        frame.getContentPane().add(label4);
        frame.getContentPane().add(label5);
        frame.getContentPane().add(exLabel);
        frame.getContentPane().add(this.pol1);
        frame.getContentPane().add(this.pol2);
        frame.getContentPane().add(this.res);
    }

    public void Adunare(ActionListener buttonAdd)
    {
        this.buttonAdd.addActionListener(buttonAdd);
    }

    public void Scadere(ActionListener buttonSub)
    {
        this.buttonSub.addActionListener(buttonSub);
    }

    public void Inmultire(ActionListener buttonMulty)
    {
        this.buttonMulty.addActionListener(buttonMulty);
    }

    public void Impartire(ActionListener buttonImp)
    {
        this.buttonImp.addActionListener(buttonImp);
    }

    public void Derivare(ActionListener buttonDeriv)
    {
        this.buttonDeriv.addActionListener(buttonDeriv);
    }

    public void Integrare(ActionListener buttonInteg)
    {
        this.buttonInteg.addActionListener(buttonInteg);
    }

    public JButton getButtonAdd() {
        return buttonAdd;
    }

    public JButton getButtonSub() {
        return buttonSub;
    }

    public JButton getButtonMulty() {
        return buttonMulty;
    }

    public JButton getButtonImp() {
        return buttonImp;
    }

    public JButton getButtonDeriv() {
        return buttonDeriv;
    }

    public JButton getButtonInteg() {
        return buttonInteg;
    }

    public JTextField getPol1() {
        return pol1;
    }

    public JTextField getPol2() {
        return pol2;
    }

    public JTextField getRes() {
        return res;
    }

    public void setRes(JTextField res) {
        this.res = res;
    }
}
