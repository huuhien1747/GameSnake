/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackages;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huu Hien
 */
public class TestThread extends Thread {
    public String caller;
    public TestThread(String caller){
        this.caller = caller;
    }
    
    public static void main(String[] args) {
        TestThread testStart = new TestThread("start");
        TestThread testRun = new TestThread("run");
        testStart.start();
        //testStart.start();
        //testRun.run();
    }
    
    @Override
    public void run(){   
        System.out.println("Caller: "+ this.caller + 
                " and code on this Thread is exeuted by : " + 
                Thread.currentThread().getName());   
        int i= 0;
        do{
            try {
            this.sleep(2000);
            i+= 2;
            } catch (InterruptedException ex) {
                Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Thread sleep in 2s!, counting: " +i);
        }while(i <100);
    }
}
