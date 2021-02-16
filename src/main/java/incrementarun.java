/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class incrementarun implements Runnable{
    private Integer c;
    public incrementarun(Integer c)
    {
        this.c = c;
    }
    public void run()       
    {
        while(1==1)
        {
              if(c<99)
              {
                  c++;
                  System.out.println("il numero è"+ c);
              }
        }
        
    }
}
