package pc;


import assignment2.Login;
import demo.RestaurantDemo;
import javax.swing.JPanel;
import utilities.Adaptation;
import utilities.DMSLConnector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainWindow.java
 *
 * Created on 26 Οκτ 2010, 11:44:56 πμ
 */

/**
 *
 * @author leonidis
 */
public class MainWindowPC extends javax.swing.JFrame {

    public void initAdaptationParameters(){

        /*Set user age to be 50*/
        DMSLConnector.getInstance().getClient(false).SetAttribute("user.profile", "no_disability");

    }

    /** Creates new form MainWindow */
    public MainWindowPC() {

        initAdaptationParameters();
        Adaptation.initLookAndFeel(this);

        initComponents();

        Login login = new Login();
        mainPanel.add(login);
        //RestaurantDemo rd = new RestaurantDemo();
        //mainPanel.add(rd);
        
        this.setSize(login.getSize());
        this.setMinimumSize(login.getMinimumSize());
        this.setMaximumSize(login.getMaximumSize());
        this.setPreferredSize(login.getPreferredSize());
        this.setSize(login.getPreferredSize());
        
        //this.setMinimumSize(new Dimension(1000,720));
        //this.setMaximumSize(new Dimension(1000,720));
        //this.setPreferredSize(new Dimension(1000,720));
        this.setResizable(true);

        

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        getContentPane().add(mainPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void showPanel(JPanel p)
    {
        mainPanel.removeAll();
        
        mainPanel.add(p);
        mainPanel.setSize(p.getPreferredSize());
        mainPanel.repaint();
        mainPanel.validate();
                
        frame.setSize(p.getPreferredSize());     
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DMSLConnector.getInstance().close();
    }//GEN-LAST:event_formWindowClosing

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                (frame = new MainWindowPC()).setVisible(true);
            }
        });
    }

    private static MainWindowPC frame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

}
