import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleAWTLayout extends Frame {
    SimpleAWTLayout(){

        //frame layout setup
        setTitle("Simple layout");
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

        //header bar

        Panel header = new Panel(null);
        header.setBounds(0,40,500,50);
        header.setBackground(new Color(0,32,92));
        add(header);

        Label headerText = new Label("SIMPLE JAVA AWT LAYOUT", Label.CENTER);
        headerText.setBounds(50,10,400,30);
        headerText.setForeground(Color.white);
        headerText.setFont(new Font("Arial",Font.BOLD,16));
        header.add(headerText);

        //center login form
        Panel center = new Panel(null);
        center.setBounds(150,90,200,230);
        center.setBackground(new Color(230,235,225));
        add(center);

        Label loginTitle = new Label("LOGIN PAGE!", Label.CENTER);
        loginTitle.setBounds(40,20,120,20);
        loginTitle.setFont(new Font("Arial",Font.BOLD,13));
        center.add(loginTitle);

        Label username = new Label("USERNAME:");
        username.setBounds(20,60,70,25);
        center.add(username);

        TextField user = new TextField();
        user.setBounds(100,60,80,25);
        center.add(user);

        Label password = new Label("PASSWORD:");
        password.setBounds(20,100,70,25);
        center.add(password);

        TextField pass = new TextField();
        pass.setBounds(100,100,80,25);
        center.add(pass);

        Button btnlogin = new Button("Login");
        btnlogin.setBounds(100,130,80,30);
        btnlogin.setBackground(new Color(0,32,64));
        btnlogin.setForeground(Color.white);
        center.add(btnlogin);

        //bottom panel

        Panel bottom = new Panel(null);
        bottom.setBounds(0, 320, 500, 80);
        bottom.setBackground(new Color(80, 120, 160));
        add(bottom);

        Label copyright = new Label("this is my work - 2025", Label.CENTER);
        copyright.setBounds(100, 25, 300, 30); // centered vertically within 80px height
        copyright.setForeground(Color.white);
        copyright.setFont(new Font("Arial", Font.BOLD, 13));
        bottom.add(copyright);












    }

}
