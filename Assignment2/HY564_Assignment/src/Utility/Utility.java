/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.awt.Dimension;
import javax.swing.JComponent;

/**
 *
 * @author koutsop
 */
public class Utility {
    public static void SetJComponentSize (JComponent c, int width, int heigt) {
        SetJComponentSize(c, new Dimension(width, heigt));
    }
    
    public static void SetJComponentSize (JComponent c, Dimension size) {
        c.setMinimumSize(size);
        c.setMaximumSize(size);
        c.setPreferredSize(size);
    }
}
