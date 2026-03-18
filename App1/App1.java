import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App1 extends JFrame {

    JTextField txtName;
    JLabel lblDisplay;

    App1() {

        setTitle("Type & Click");
        setSize(450, 150);
        setLocation(200, 200);

        Container con = getContentPane();
        FlowLayout flow = new FlowLayout();
        con.setLayout(flow);

        txtName = new JTextField(20);
        lblDisplay = new JLabel("Type and Click");
        JButton btnShow = new JButton("Show");
        JButton btnClear = new JButton("Clear");


        btnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showName(e);
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                txtName.setText("");
                lblDisplay.setText("Type & Click");
            }            
        });


        con.add(txtName);
        con.add(btnShow);
        con.add(btnClear);
        con.add(lblDisplay);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void showName(ActionEvent evt) {
        
        String name = txtName.getText();
        System.out.println(name);  
        lblDisplay.setText( name );
    }

    public static void main(String args[]) {
        App1 app = new App1();
    }

}
