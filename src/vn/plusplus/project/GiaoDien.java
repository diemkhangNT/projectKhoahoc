package vn.plusplus.project;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.spec.ECParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiaoDien implements ActionListener {
    JFrame frame = new JFrame();
    JButton buttonOk, buttonRS, buttonExit;
    JLabel label,label1,label2,label3,label4,label6,label7,labelkq;
    JTextField a,b;
    JPanel panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8;
    JRadioButton radioButton1, radioButton2,radioButton3;
    ButtonGroup buttonGroup = new ButtonGroup();
    public static void main(String[] args) {
        GiaoDien gd = new GiaoDien();
    }
     public GiaoDien() {
        buttonOk = new JButton("OK");
        buttonOk.addActionListener(this);
        buttonOk.setFont(new Font("abc",Font.BOLD,30));
        buttonOk.setForeground(Color.red);
        buttonRS = new JButton("RESET");
        buttonRS.addActionListener(this);
        buttonRS.setFont(new Font("abc",Font.BOLD,30));
        buttonRS.setForeground(Color.red);
        buttonExit = new JButton("EXIT");
        buttonExit.addActionListener(this);
        buttonExit.setFont(new Font("abc",Font.BOLD,30));
        buttonExit.setForeground(Color.red);

        panel8 = new JPanel();
        panel8.setBounds(0,235,700,70);
        panel8.setBackground(new Color(179, 194, 187));
        panel8.add(buttonOk);
        panel8.add(buttonRS);
        panel8.add(buttonExit);


        label = new JLabel("THỰC HIỆN PHÉP TÍNH");
        label.setForeground(new Color(14, 62, 205));
        label.setFont(new Font("abc",Font.BOLD,30));
        panel1 = new JPanel();
        panel1.add(label);
        panel1.setBackground(new Color(179, 194, 187));
        panel1.setBounds(0,0,700,600);


        panel2 = new JPanel(null);
        panel2.setBackground(new Color(199, 240, 198));
        panel2.setBounds(5,50,300,180);

        label1 = new JLabel("Thông tin cần nhập");
        label1.setBounds(5,0,150,30);

        panel5 = new JPanel(null);
        panel5.setBackground(new Color(168, 230, 168));
        panel5.setBounds(25,80,260,129);
        panel5.setBorder(BorderFactory.createLineBorder(new Color(129, 150, 129)));

        label2 = new JLabel("Nhập a: ");
        label2.setBounds(10,10,100,30);
        label2.setForeground(new Color(6, 44, 154));
        label2.setFont(new Font("abc",Font.BOLD,20));
        label3 = new JLabel("Nhập b: ");
        label3.setBounds(10,80,100,30);
        label3.setForeground(new Color(6, 44, 154));
        label3.setFont(new Font("abc",Font.BOLD,20));


        a = new JTextField();
        a.setBounds(100,15,150,30);
        a.addActionListener(e -> {
            a.getText();
        });
        b = new JTextField();
        b.setBounds(100,80,150,30);
        b.addActionListener(e -> {
            b.getText();
        });

        panel2.add(label1);
        panel5.add(label2);
        panel5.add(a);
        panel5.add(label3);
        panel5.add(b);

        panel3 = new JPanel(null);
        panel3.setBackground(new Color(199, 240, 198));
        panel3.setBounds(330,50,355,180);
        label4 = new JLabel("Các tùy chọn tính toán");
        label4.setBounds(5,0,150,30);


        radioButton1 = new JRadioButton("Giải phương trình bậc nhất");
        radioButton1.setMargin(new Insets(5,5,5,5));
        radioButton1.setFont(new Font("abc",Font.ITALIC,20));
        radioButton1.setBackground(new Color(168, 230, 168));
        radioButton1.addActionListener(this);

        radioButton2 = new JRadioButton("Ước chung lớn nhất");
        radioButton2.setMargin(new Insets(5,5,5,5));
        radioButton2.setFont(new Font("abc",Font.ITALIC,20));
        radioButton2.setBackground(new Color(168, 230, 168));
        radioButton2.addActionListener(this);

        radioButton3 = new JRadioButton("Bội chung nhỏ nhất");
        radioButton3.setMargin(new Insets(5,5,5,5));
        radioButton3.setFont(new Font("abc",Font.ITALIC,20));
        radioButton3.setBackground(new Color(168, 230, 168));
        radioButton3.addActionListener(this);


        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        panel4 = new JPanel(null);
        panel4.setBackground(new Color(168, 230, 168));
        panel4.setBounds(350,80,315,129);
        panel4.setLayout(new BoxLayout(panel4,BoxLayout.Y_AXIS));
        panel4.setBorder(BorderFactory.createLineBorder(new Color(129, 150, 129)));
        panel4.add(radioButton1);
        panel4.add(radioButton2);
        panel4.add(radioButton3);
        panel3.add(label4);

        panel6 = new JPanel(null);
        panel6.setBackground(new Color(199, 240, 198));
        panel6.setBounds(5,300,680,160);
        label6 = new JLabel("Kết quả tính toán");
        label6.setBounds(5,0,150,30);
        panel6.add(label6);

        panel7 = new JPanel(null);
        panel7.setBackground(new Color(168, 230, 168));
        panel7.setBounds(25,330,640,109);
        label7 = new JLabel();
        labelkq = new JLabel();
        labelkq.setText(" ");
        label7.setText("Hiển thị kết quả");
        label7.setFont(new Font("abc",Font.BOLD,20));
        labelkq.setFont(new Font("abc",Font.BOLD,20));
        panel7.add(labelkq);
        panel7.add(label7);
        BoxLayout layout = new BoxLayout(panel7,BoxLayout.Y_AXIS);
        panel7.setLayout(layout);
        panel7.setBorder(BorderFactory.createLineBorder(new Color(129, 150, 129)));

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
    int aa,bb;
    public void input(){
        float x;
        try{
// (if có) Lỗi ép kiểu NumberFormatException (Giá trị đưa vào không đúng với kiểu dữ liệu)
            aa = Integer.parseInt(a.getText());
            bb = Integer.parseInt(b.getText());
            if(aa==0&&bb==0){
                String s=null;
                System.out.println(s.length());
                // Lỗi NullPointerException (Không tìm thấy giá trị yêu cầu)
            }
            if(aa<0||bb<0){
                int arr[]=new int[5];
                arr[10]=50; // Lỗi ArrayIndexOutOfBoundsException (Vượt quá chiều dài của mảng)
            }
            // Nếu aa=0 -> ArithmeticException (Lỗi phép toán)
            x = (float) (bb/aa);
            // Nếu bb=0 -> ArithmeticException (Lỗi phép toán)
            x = (float) (aa/bb);
        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(frame,"a và b phải KHÁC 0, mời nhập lại!","Error!", JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(frame,"a và b phải là SỐ TỰ NHIÊN LỚN HƠN 0, mời nhập lại!","Error!",JOptionPane.INFORMATION_MESSAGE);
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(frame,"a và b phải LỚN HƠN 0, mời nhập lại!","Error!",JOptionPane.INFORMATION_MESSAGE);
        }catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(frame,"a và b phải LỚN HƠN 0, mời nhập lại!","Error!",JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(frame,"a và b phải là SỐ TỰ NHIÊN LỚN HƠN 0, mời nhập lại!","Error!",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    float x;
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == radioButton1){
            input();
            x = (float) -bb/aa;
            labelkq.setText("Phương trình có dạng: y = "+aa+"x + "+bb);
            label7.setText("x = "+x+", y = 0");
            labelkq.setVisible(true);
            label7.setVisible(false);
        }
        if(e.getSource()==radioButton2){
            input();
            int max = 1;
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 1; i <= aa && i <= bb; i++)
            {
                if(aa%i==0 && bb%i==0){
                    list.add(i);
                    max= i;
                }
            }
            x = max;
            labelkq.setText("Ước chung của "+aa+" và "+bb+": "+list.toString());
            label7.setText("Ước chung lớn nhất là: "+(int)x);
            label7.setVisible(false);
            labelkq.setVisible(true);
        }
        if(e.getSource()==radioButton3){
            input();
            int max = 1;
            for(int i = 1; i <= aa && i <= bb; i++){
                if(aa%i==0 && bb%i==0)
                    max = i;
            }
            x= (float) (aa*bb)/max;
            label7.setText("Bội chung nhỏ nhất là: "+(int)x);
            label7.setVisible(false);
            labelkq.setVisible(false);
        }
        if(e.getSource()==buttonOk){
            input();
            label7.setVisible(true);
        }else if(e.getSource()==buttonRS){
            labelkq.setText(" ");
            label7.setText("Hiển thị kết quả");
            labelkq.setVisible(true);
            label7.setVisible(true);
            a.setText("0");
            b.setText("0");
            buttonGroup.clearSelection();
        }else if(e.getSource()==buttonExit){
            System.exit(0);
        }
    }
}
