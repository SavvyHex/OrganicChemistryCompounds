package io.savvyhex.occ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OCC implements ActionListener {
    private static JLabel c1;
    private static JLabel c2;
    private static JLabel c3;
    private static JLabel c4;
    private static JLabel c5;
    private static JLabel c6;
    private static JLabel c7;
    private static JLabel c8;
    private static JLabel c9;
    private static JLabel c10;

    Compound compound;

    public OCC(){
        JLabel disclaimerH = new JLabel("---------------------------DISCLAIMER--------------------------------------");
        JLabel disclaimerB = new JLabel("Most of these compounds do not exist... they're just for fun");
        JLabel disclaimerT = new JLabel("---------------------------------------------------------------------------");
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Generate 10 compounds");

        c1 = new JLabel("");
        c2 = new JLabel("");
        c3 = new JLabel("");
        c4 = new JLabel("");
        c5 = new JLabel("");
        c6 = new JLabel("");
        c7 = new JLabel("");
        c8 = new JLabel("");
        c9 = new JLabel("");
        c10 = new JLabel("");

        frame.setSize(400, 400);
        frame.add(panel, BorderLayout.CENTER);

        disclaimerH.setBounds(10, 20, 80, 25);
        disclaimerB.setBounds(10, 30, 80, 25);
        disclaimerT.setBounds(10, 40, 80, 25);

        button.setBounds(10, 80, 80, 25);

        c1.setBounds(10, 100, 80, 25);
        c2.setBounds(10, 110, 80, 25);
        c3.setBounds(10, 120, 80, 25);
        c4.setBounds(10, 130, 80, 25);
        c5.setBounds(10, 140, 80, 25);
        c6.setBounds(10, 150, 80, 25);
        c7.setBounds(10, 160, 80, 25);
        c8.setBounds(10, 170, 80, 25);
        c9.setBounds(10, 180, 80, 25);
        c10.setBounds(10, 190, 80, 25);

        button.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(disclaimerH);
        panel.add(disclaimerB);
        panel.add(disclaimerT);
        panel.add(button);

        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(c4);
        panel.add(c5);
        panel.add(c6);
        panel.add(c7);
        panel.add(c8);
        panel.add(c9);
        panel.add(c10);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("OCC");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new OCC();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        compound = new Compound();
        c1.setText(compound.getName());

        compound = new Compound();
        c2.setText(compound.getName());

        compound = new Compound();
        c3.setText(compound.getName());

        compound = new Compound();
        c4.setText(compound.getName());

        compound = new Compound();
        c5.setText(compound.getName());

        compound = new Compound();
        c6.setText(compound.getName());

        compound = new Compound();
        c7.setText(compound.getName());

        compound = new Compound();
        c8.setText(compound.getName());

        compound = new Compound();
        c9.setText(compound.getName());

        compound = new Compound();
        c10.setText(compound.getName());
    }
}
