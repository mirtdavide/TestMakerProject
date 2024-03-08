/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author soprasteria
 */
public class LoginFrame extends JFrame {

    DataManagement dm = new DataManagement();

    
    
    ImageIcon userimage_icon = new ImageIcon(getClass().getResource("/res/user.png"));

    JLabel user_label = new JLabel("User ID :");
    JLabel password_label = new JLabel("Password :");
    JLabel userimage_label = new JLabel(userimage_icon);
    JLabel checkuser_label = new JLabel("Vuoto");
    JLabel checkpassword_label = new JLabel("Vuoto");

    JButton login_button = new JButton("LOGIN");
    JButton register_button = new JButton("REGISTRATI");

    JTextField user_textfield = new JTextField();
    JPasswordField password_textfield = new JPasswordField();

    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) d.getWidth();
    int y = (int) d.getHeight();

    int result;

    public LoginFrame() {

        setLayout(null);
        setLocation(x / 2 - 200, 100);
        setSize(400, 500);
        setVisible(true);
        setResizable(false);
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(user_textfield);
        add(password_textfield);
        add(user_label);
        add(userimage_label);
        add(password_label);
        add(checkuser_label);
        add(checkpassword_label);
        add(login_button);
        add(register_button);

        login_button.addActionListener(new LoginActions());
        login_button.setBounds(145, 380, 110, 20);
        register_button.addActionListener(new RegisterActions());
        register_button.setBounds(145, 410, 110, 20);

        user_textfield.addKeyListener(new IDTextFieldActions());
        user_textfield.setBounds(120, 300, 170, 20);
        password_textfield.addKeyListener(new PasswordTextFieldActions());
        password_textfield.setBounds(120, 340, 170, 20);

        user_label.setBounds(50, 300, 100, 20);
        checkuser_label.setVisible(false);
        checkuser_label.setBounds(300, 300, 100, 20);
        checkpassword_label.setVisible(false);
        checkpassword_label.setBounds(300, 340, 100, 20);

        userimage_label.setBounds(70, 100, 240, 170);
        password_label.setBounds(50, 340, 100, 20);

    }

    public class LoginActions implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            
            int counter = 2;
            
            if (checkuser_label.getText().equals("Vuoto")) {
                counter--;
            }
            if (checkpassword_label.getText().equals("Vuoto")) {
                counter--;
            }

            if (counter == 2) {
                result = dm.findUser(user_textfield.getText(), String.valueOf(password_textfield.getPassword()));
                if (result >= 0) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Login effettuato con successo, benvenuto " + dm.user_array.get(result).getId());
                    if(dm.user_array.get(result).isAdmin()==true){
                        LoginFrame.this.dispose();
                        new AdminFrame();
                    }else{
                       LoginFrame.this.dispose();
                        new UserFrame(dm.user_array.get(result).getId());
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Utente non trovato");
                }
            } else {
                JOptionPane.showMessageDialog(LoginFrame.this, "Uno o piu campi sono vuoti");
            }
        }
    }

    public class RegisterActions implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            LoginFrame.this.dispose();
            new RegisterFrame();
        }

    }

    public class IDTextFieldActions implements KeyListener {

        public void keyTyped(KeyEvent ke) {

            if (user_textfield.getText().trim().isEmpty()) {

                checkuser_label.setVisible(true);
                checkuser_label.setText("Vuoto");
                checkuser_label.setForeground(Color.red);
            } else {
                checkuser_label.setForeground(Color.red);
                checkuser_label.setVisible(true);
                checkuser_label.setText("Ok");
                checkuser_label.setForeground(Color.green);

            }
        }

        public void keyPressed(KeyEvent ke) {
        }

        public void keyReleased(KeyEvent ke) {
            if (user_textfield.getText().trim().isEmpty()) {

                checkuser_label.setVisible(true);
                checkuser_label.setText("Vuoto");
                checkuser_label.setForeground(Color.red);
            } else {
                checkuser_label.setForeground(Color.red);
                checkuser_label.setVisible(true);
                checkuser_label.setText("Ok");
                checkuser_label.setForeground(Color.green);

            }
        }

    }

    public class PasswordTextFieldActions implements KeyListener {

        public void keyTyped(KeyEvent ke) {

            if (String.valueOf(password_textfield.getPassword()).trim().isEmpty()) {

                checkpassword_label.setVisible(true);
                checkpassword_label.setText("Vuoto");
                checkpassword_label.setForeground(Color.red);
            } else {
                checkpassword_label.setVisible(true);
                checkpassword_label.setForeground(Color.red);
                checkpassword_label.setText("Ok");
                checkpassword_label.setForeground(Color.green);

            }
        }

        public void keyPressed(KeyEvent ke) {

        }

        public void keyReleased(KeyEvent ke) {
            if (String.valueOf(password_textfield.getPassword()).trim().isEmpty()) {

                checkpassword_label.setVisible(true);
                checkpassword_label.setText("Vuoto");
                checkpassword_label.setForeground(Color.red);
            } else {
                checkpassword_label.setVisible(true);
                checkpassword_label.setForeground(Color.red);
                checkpassword_label.setText("Ok");
                checkpassword_label.setForeground(Color.green);

            }
        }

    }

}
