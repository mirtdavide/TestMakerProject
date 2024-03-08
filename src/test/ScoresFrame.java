/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Davide
 */
public class ScoresFrame extends JFrame{
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x= (int) d.getWidth();
    int y= (int) d.getHeight();
    JFrame f = new JFrame();
    JList list = new JList();
    JScrollPane jsp = new JScrollPane(list);
    ArrayList as=new ArrayList();
    BinaryFilesManagement bfm=new BinaryFilesManagement();
    String p,str;
    public ScoresFrame(String path,String s,String user){
            
            
            p=path;
            str=s;
            as=bfm.readScoresFile(p, str);
            f.getContentPane().add(jsp, BorderLayout.CENTER);
            f.setLocation(x / 2 - 150, y / 2 - 250);
            f.setSize(300, 500);
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setTitle("Punteggi");
            f.addWindowListener(new Wl(user));
            if(!as.isEmpty()){
                String[] tests = new String[as.size()];
            for (int i = 0; i < as.size(); i++) {
                tests[i] = (String) as.get(i);
            }

            list.setListData(tests);
            jsp = new JScrollPane(list);

            f.getContentPane().add(jsp, BorderLayout.CENTER);

            f.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(ScoresFrame.this, "Non sono presenti punteggi per questo test");
                ScoresFrame.this.dispose();
                new UserFrame(user);
            }
            
            
            

        
        
    }
    
    public class Wl implements WindowListener{
        
        String userr;
        public Wl(String u){
            userr=u;
        }
        
        public void windowOpened(WindowEvent e) {
        }


        public void windowClosing(WindowEvent e) {
            
        }

      
        public void windowClosed(WindowEvent e) {
            new UserFrame(userr);
           
        }


        public void windowIconified(WindowEvent e) {
         
        }


        public void windowDeiconified(WindowEvent e) {
        
        }


        public void windowActivated(WindowEvent e) {
         
        }


        public void windowDeactivated(WindowEvent e) {
          
        }
        
    }
}
