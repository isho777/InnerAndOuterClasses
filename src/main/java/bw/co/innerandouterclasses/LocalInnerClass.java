/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bw.co.innerandouterclasses;

public class LocalInnerClass {

    protected int num = 6;

    protected void heyThere() {
        System.out.println("from LocalInnerClass: hey there!!!");
        
        class Local{
            String localString = "local string here!!!";
            void printLocalString(){
                System.out.println(localString);
            }
        }
        
       Local loc = new Local();
       loc.printLocalString();
                
    }

 
}
