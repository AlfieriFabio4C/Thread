/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HiHello;

/**
 *
 * @author fabio.alfieri
 */
public class HiHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        Hi a = new Hi();
        Hello b = new Hello();
        a.start();
        b.start();
    }

}
