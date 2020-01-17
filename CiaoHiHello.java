/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CiaoHiHello;

/**
 *
 * @author fabio.alfieri
 */
public class CiaoHiHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        Hi a = new Hi();
        Hello b = new Hello();
        Say c = new Say();
        a.start();
        b.start();
        c.start();
    }

}
