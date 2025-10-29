import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.cert.PolicyNode;

class simpleLayout extends Frame {
    simpleLayout(){
        //set frame layout

        setTitle("Simple Layout");
        setLayout(null);
        setSize(500,400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        //header

        Panel header = new Panel(null);
        header.setBounds(0,30,500,50);
        header.setBackground(new Color(0,32,92));
        add(header);

        Label headerText = new Label("SIMPLE JAVA AWT LAYOUT", Label.CENTER);
        headerText.setBounds(50,10,400,30);
        headerText.setForeground(Color.white);
        headerText.setFont(new Font("Arial",Font.BOLD,16));
        header.add(headerText);

        //left panel
        Panel leftP = new Panel(null);
        leftP.setBounds(10,100,130,230);
        leftP.setBackground(Color.lightGray);
        add(leftP);

        //right panel

        Panel rightP = new Panel(null);
        rightP.setBounds(360,100,140,230);
        rightP.setBackground(Color.lightGray);
        add(rightP);




        //set content

        Panel center = new Panel(null);
        center.setBounds(150,100,200,230);
        center.setBackground(new Color(230,235,225));
        add(center);

        Label h2 = new Label("REGISTRATION FORM",Label.CENTER);
        h2.setBounds(20,10,150,50);
        header.setForeground(Color.black);
        header.setFont(new Font("Arial", Font.BOLD,16));
        center.add(h2);

        Label username = new Label("username:");
        username.setBounds(20,60,70,25);
        center.add(username);

        TextField user = new TextField();
        user.setBounds(100,60,80,25);
        center.add(user);

        Label password = new Label("Password:");
        password.setBounds(20,100,70,25);
        center.add(password);

        TextField pass = new TextField();
        pass.setBounds(100,100,80,25);
        center.add(pass);

        Button btnLogin = new Button("Register");
        btnLogin.setBounds(20,140,70,30);
        btnLogin.setBackground(new Color(0,32,92));
        btnLogin.setForeground(Color.white);
        center.add(btnLogin);

        Button btnCancel = new Button("Cancel");
        btnCancel.setBounds(110,140,70,30);
        btnCancel.setBackground(Color.red);
        center.add(btnCancel);

        Panel bottom = new Panel(null);
        bottom.setBounds(0,350,500,60);
        bottom.setBackground(Color.CYAN);
        add(bottom);

        Label h3 = new Label("2025 copy-Right", Label.CENTER);
        h3.setBounds(60,10,400,30);
        h3.setForeground(Color.white);
        bottom.add(h3);

    }
}
