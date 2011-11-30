/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdaptableChat.java
 *
 * Created on 29 Νοε 2011, 10:26:02 πμ
 */
package AdaptableWindows;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class AdaptableChat extends javax.swing.JPanel {
	JPanel p = new JPanel(new CardLayout());
	
	/** Creates new form AdaptableChat */
	public AdaptableChat(Dimension parentSize) {
        initComponents();
        
        p.add(new assignment2.Chat(parentSize), "Chat");
        p.add(new assignment2.Spots.Chat(parentSize), "SpotChat");
        this.add(p);

        CardLayout cl = (CardLayout)(p.getLayout());
        String pid = DMSLConnector.getInstance().getClient(false).Evaluate("SpotChat");
        System.out.println("View:" + pid);
        cl.show(p, pid);
        p.revalidate();
        
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
        this.updateUI();  
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
