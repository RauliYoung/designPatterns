package swingborder.sandbox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Sandbox extends JFrame {

    public static void main(String[] args) {

        Sandbox test = new Sandbox();
        test.setBounds(20, 20, 500, 800);
        test.show();
       String fly = "fly", weight = "weight";
        String fly2 = "fly", weight2 = "weight";

        System.out.println(fly == fly2);
        System.out.println(weight == weight2);

        String distinctString = fly + weight;
        System.out.println(distinctString == "flyweight");

        String flyweight = (fly + weight).intern();
        System.out.println(flyweight == "flyweight");


        String message = "fly == fly2: " + (fly == fly2) + "\n"
                + "weight == weight2: " + (weight == weight2) + "\n"
                + "distinctString == \"flyweight\": " + (distinctString == "flyweight") + "\n"
                + "flyweight == \"flyweight\": " + (flyweight == "flyweight");

        JOptionPane.showMessageDialog(null, message, "String Comparison", JOptionPane.INFORMATION_MESSAGE);
    }

    public Sandbox() {
        super("Border flyweights");
        JPanel panel = new JPanel(), panel2 = new JPanel(), panel3 = new JPanel();
        Border border = BorderFactory.createRaisedBevelBorder();
        Border border2 = BorderFactory.createRaisedBevelBorder();
        Border border3 = BorderFactory.createRaisedBevelBorder();
        panel.setBorder(border);
        panel.setPreferredSize(new Dimension(300, 100));
        panel2.setBorder(border2);
        panel3.setBorder(border3);
        panel2.setPreferredSize(new Dimension(300, 100));
        panel3.setPreferredSize(new Dimension(300, 300));
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(panel);
        contentPane.add(panel2);
        contentPane.add(panel3);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
        if (border == border2) {
            System.out.println("bevel borders are shared");
            JLabel text = new JLabel("bevel borders are shared");
            panel.add(text);
            if(border == border2 && border2 == border3){
                JLabel truish = new JLabel("All borders are shared..");
                panel3.add(truish);
            }

        } else {
            System.out.println("bevel borders are NOT shared");
            JLabel text = new JLabel("bevel borders are NOT shared");
            panel2.add(text);
        }
    }
}
