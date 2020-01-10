/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conflittotrathread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alfieri.fabio
 */
public class Inc1000 extends Thread {

    static int count = 0;
    
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                count++;
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Inc1000.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
