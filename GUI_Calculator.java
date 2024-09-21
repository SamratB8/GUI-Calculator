import javax.swing.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class GUI_Calculator
{
    static JFrame f;
    static JTextField tf;
    static JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, ba, bs, bm, bd, be, bc;
    static String s1, s2, s3;
    static BigDecimal a = new BigDecimal("0.0"), b = new BigDecimal("0.0"), c = new BigDecimal("0.0");
    static long l;

    private static void addKeyBinding(JButton button, String name, int keyCode)
    {
        button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(keyCode, 0), name);
        button.getActionMap().put(name, new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Update s1, s2, and s3 based on the button that is "clicked"
                if (button == ba || button == bs || button == bm || button == bd)
                {
                    s1 = tf.getText();
                    s2 = " " + button.getText() + " ";
                    tf.setText(s1 + s2);
                } else if (button == b0 || button == b1 || button == b2 || button == b3 ||
                        button == b4 || button == b5 || button == b6 ||
                        button == b7 || button == b8 || button == b9)
                {
                    s3 = tf.getText() + button.getText();
                    tf.setText(s3);
                } else if (button == bc)
                {
                    s1 = "";
                    s2 = "";
                    s3 = "";
                    tf.setText("");
                }
                // Perform the click
                button.doClick();
            }
        });
    }

    protected static void Layout()
    {
        f = new JFrame("Calculator");
        tf = new JTextField();
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        ba = new JButton("+");
        bs = new JButton("-");
        bm = new JButton("*");
        bd = new JButton("/");
        be = new JButton("=");
        bc = new JButton("C");

        tf.setBounds(30, 40, 280, 30);
        b0.setBounds(40, 310, 50, 40);
        b1.setBounds(40, 240, 50, 40);
        b2.setBounds(110, 240, 50, 40);
        b3.setBounds(180, 240, 50, 40);
        b4.setBounds(40, 170, 50, 40);
        b5.setBounds(110, 170, 50, 40);
        b6.setBounds(180, 170, 50, 40);
        b7.setBounds(40, 100, 50, 40);
        b8.setBounds(110, 100, 50, 40);
        b9.setBounds(180, 100, 50, 40);
        ba.setBounds(250, 100, 50, 40);
        bs.setBounds(250, 170, 50, 40);
        bm.setBounds(250, 240, 50, 40);
        bd.setBounds(250, 310, 50, 40);
        be.setBounds(110, 310, 50, 40);
        bc.setBounds(180, 310, 50, 40);

        f.add(tf);
        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(ba);
        f.add(bs);
        f.add(bm);
        f.add(bd);
        f.add(be);
        f.add(bc);

        addKeyBinding(b0, "0", KeyEvent.VK_0);
        addKeyBinding(b1, "1", KeyEvent.VK_1);
        addKeyBinding(b2, "2", KeyEvent.VK_2);
        addKeyBinding(b3, "3", KeyEvent.VK_3);
        addKeyBinding(b4, "4", KeyEvent.VK_4);
        addKeyBinding(b5, "5", KeyEvent.VK_5);
        addKeyBinding(b6, "6", KeyEvent.VK_6);
        addKeyBinding(b7, "7", KeyEvent.VK_7);
        addKeyBinding(b8, "8", KeyEvent.VK_8);
        addKeyBinding(b9, "9", KeyEvent.VK_9);
        addKeyBinding(ba, "+", KeyEvent.VK_PLUS);
        addKeyBinding(bs, "-", KeyEvent.VK_MINUS);
        addKeyBinding(bm, "*", KeyEvent.VK_MULTIPLY);
        addKeyBinding(bd, "/", KeyEvent.VK_DIVIDE);
        addKeyBinding(be, "=", KeyEvent.VK_ENTER);
        addKeyBinding(bc, "C", KeyEvent.VK_BACK_SPACE);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    protected static void Function()
    {
        b0.addActionListener(e -> {
            s3 = tf.getText() + b0.getText();
            tf.setText(s3);
        });
        b1.addActionListener(e -> {
            s3 = tf.getText() + b1.getText();
            tf.setText(s3);
        });
        b2.addActionListener(e -> {
            s3 = tf.getText() + b2.getText();
            tf.setText(s3);
        });
        b3.addActionListener(e -> {
            s3 = tf.getText() + b3.getText();
            tf.setText(s3);
        });
        b4.addActionListener(e -> {
            s3 = tf.getText() + b4.getText();
            tf.setText(s3);
        });
        b5.addActionListener(e -> {
            s3 = tf.getText() + b5.getText();
            tf.setText(s3);
        });
        b6.addActionListener(e -> {
            s3 = tf.getText() + b6.getText();
            tf.setText(s3);
        });
        b7.addActionListener(e -> {
            s3 = tf.getText() + b7.getText();
            tf.setText(s3);
        });
        b8.addActionListener(e -> {
            s3 = tf.getText() + b8.getText();
            tf.setText(s3);
        });
        b9.addActionListener(e -> {
            s3 = tf.getText() + b9.getText();
            tf.setText(s3);
        });
        ba.addActionListener(e -> {
            s1 = tf.getText();
            s2 = " + ";
            tf.setText(s1 + s2);
        });
        bs.addActionListener(e -> {
            s1 = tf.getText();
            s2 = " - ";
            tf.setText(s1 + s2);
        });
        bm.addActionListener(e -> {
            s1 = tf.getText();
            s2 = " * ";
            tf.setText(s1 + s2);
        });
        bd.addActionListener(e -> {
            s1 = tf.getText();
            s2 = " / ";
            tf.setText(s1 + s2);

        });
        be.addActionListener(e -> {
            l = tf.getText().length();
            s3 = tf.getText().substring((int) (l - 1));
            tf.setText(s3 + " = ");
            a = new BigDecimal(s1);
            b = new BigDecimal(s3);
            switch (s2)
            {
                case " + " -> {
                    c = a.add(b);
                    s3 = String.valueOf(c);
                    tf.setText(s3);
                }
                case " - " -> {
                    c = a.subtract(b);
                    s3 = String.valueOf(c);
                    tf.setText(s3);
                }
                case " * " -> {
                    c = a.multiply(b);
                    s3 = String.valueOf(c);
                    tf.setText(s3);
                }
                case " / " -> {
                    c = a.divide(b);
                    s3 = String.valueOf(c);
                    tf.setText(s3);
                }
            }
        });
        bc.addActionListener(e -> {
            s1 = "";
            s2 = "";
            s3 = "";
            tf.setText("");
        });
    }

    public static void main(String[] args)
    {
        Layout();
        Function();
    }
}
