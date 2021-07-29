package vn.plusplus.project;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GiaoDien {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton buttonOk, buttonRS, buttonExit;
        buttonOk = new JButton("OK");
        buttonOk.setFont(new Font("abc",Font.BOLD,30));
        buttonOk.setForeground(Color.red);
        buttonRS = new JButton("RESET");
        buttonRS.setFont(new Font("abc",Font.BOLD,30));
        buttonRS.setForeground(Color.red);
        buttonExit = new JButton("EXIT");
        buttonExit.setFont(new Font("abc",Font.BOLD,30));
        buttonExit.setForeground(Color.red);

        JPanel panel8 = new JPanel();
        panel8.setBounds(0,235,700,70);
        panel8.setBackground(new Color(179, 194, 187));
        panel8.add(buttonOk);
        panel8.add(buttonRS);
        panel8.add(buttonExit);


        JLabel label = new JLabel("THỰC HIỆN PHÉP TÍNH");
        label.setForeground(new Color(14, 62, 205));
        label.setFont(new Font("abc",Font.BOLD,30));
        JPanel panel1 = new JPanel();
        panel1.add(label);
        panel1.setBackground(new Color(179, 194, 187));
        panel1.setBounds(0,0,700,600);


        JPanel panel2 = new JPanel(null);
        panel2.setBackground(new Color(199, 240, 198));
        panel2.setBounds(5,50,300,180);

        JLabel label1 = new JLabel("Thông tin cần nhập");
        label1.setBounds(5,0,150,30);

        JPanel panel5 = new JPanel(null);
        panel5.setBackground(new Color(168, 230, 168));
        panel5.setBounds(25,80,260,129);
        Border border = BorderFactory.createLineBorder(new Color(129, 150, 129),3);
        panel5.setBorder(border);

        JLabel label2 = new JLabel("Nhập a: ");
        label2.setBounds(10,10,100,30);
        label2.setForeground(new Color(6, 44, 154));
        label2.setFont(new Font("abc",Font.BOLD,20));
        JLabel label3 = new JLabel("Nhập b: ");
        label3.setBounds(10,80,100,30);
        label3.setForeground(new Color(6, 44, 154));
        label3.setFont(new Font("abc",Font.BOLD,20));

        JTextField a = new JTextField();
        a.setBounds(100,15,150,30);
        JTextField b = new JTextField();
        b.setBounds(100,80,150,30);

        panel2.add(label1);
        panel5.add(label2);
        panel5.add(a);
        panel5.add(label3);
        panel5.add(b);

        JPanel panel3 = new JPanel(null);
        panel3.setBackground(new Color(199, 240, 198));
        panel3.setBounds(330,50,355,180);
        JLabel label4 = new JLabel("Các tùy chọn tính toán");
        label4.setBounds(5,0,150,30);


        JRadioButton radioButton1 = new JRadioButton("Giải phương trình bậc nhất");
        radioButton1.setMargin(new Insets(5,5,5,5));
        radioButton1.setFont(new Font("abc",Font.ITALIC,20));
        radioButton1.setBackground(new Color(168, 230, 168));
        JRadioButton radioButton2 = new JRadioButton("Ước chung lớn nhất");
        radioButton2.setMargin(new Insets(5,5,5,5));
        radioButton2.setFont(new Font("abc",Font.ITALIC,20));
        radioButton2.setBackground(new Color(168, 230, 168));
        JRadioButton radioButton3 = new JRadioButton("Bội chung nhỏ nhất");
        radioButton3.setMargin(new Insets(5,5,5,5));
        radioButton3.setFont(new Font("abc",Font.ITALIC,20));
        radioButton3.setBackground(new Color(168, 230, 168));
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        JPanel panel4 = new JPanel(null);
        panel4.setBackground(new Color(168, 230, 168));
        panel4.setBounds(350,80,315,129);
        panel4.setLayout(new BoxLayout(panel4,BoxLayout.Y_AXIS));
        panel4.setBorder(border);
        panel4.add(radioButton1);
        panel4.add(radioButton2);
        panel4.add(radioButton3);
        panel3.add(label4);

        JPanel panel6 = new JPanel(null);
        panel6.setBackground(new Color(199, 240, 198));
        panel6.setBounds(5,300,680,160);
        JLabel label6 = new JLabel("Kết quả tính toán");
        label6.setBounds(5,0,150,30);
        panel6.add(label6);

        JPanel panel7 = new JPanel(null);
        panel7.setBackground(new Color(168, 230, 168));
        panel7.setBounds(25,330,640,109);
        JLabel label7 = new JLabel("Hiển thị kết quả");
        label7.setFont(new Font("abc",Font.BOLD,20));
        panel7.add(label7);
        FlowLayout layout = new FlowLayout(20,20,20);
        panel7.setLayout(layout);
        panel7.setBorder(border);

        frame.setLayout(null);
        frame.add(panel8);
        frame.add(panel7);
        frame.add(panel6);
        frame.add(panel5);
        frame.add(panel4);
        frame.add(panel3);
        frame.add(panel2);
        frame.add(panel1);
        frame.setSize(695,495);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
