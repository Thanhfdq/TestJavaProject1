/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

/**
 *
 * @author quoct
 */
public class TestAddComponentToPanel extends JFrame{
    
    public TestAddComponentToPanel(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800, 520);
        this.setLayout(null);
        
        JPanel pnl = new JPanel();
        pnl.setBounds(0, 0, 200, 200);
        pnl.setBackground(Color.yellow);
        this.add(pnl);
        
        JTextField txt = new JTextField(10);
        pnl.add(txt);
        
        JPanel redpnl = new JPanel();
        redpnl.setBounds(200, 0, 200, 200);
        redpnl.setBackground(Color.red);
        this.add(redpnl);
        
        WebcamPanel pnlcam;
        Webcam cam;
        cam = Webcam.getWebcams().get(0);
        
        
    }
    
    public static void main(String arg[]){
        new TestAddComponentToPanel().setVisible(true);
    }
}
