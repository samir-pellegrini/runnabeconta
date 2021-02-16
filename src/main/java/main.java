/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Integer c=35;
       
        Runnable r1=new decrementarun(c);
        Runnable r2=new incrementarun(c);
        
        Thread y1=new Thread(r2,"incrementa");
        Thread y2=new Thread(r1,"decrementa");
        
                y1.start();
                y2.start();
 }
    
}
