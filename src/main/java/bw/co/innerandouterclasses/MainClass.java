package bw.co.innerandouterclasses;


import bw.co.innerandouterclasses.OuterClass;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ishmael
 */
public class MainClass {
    public static void main(String[] args){
        
        OuterClass outer = new OuterClass();
        outer.heyThere();
        
        //OuterClass.InnerClass inner = outer.new InnerClass(); // if InnerClass is not static i.e  "class InnerClass"  require instance to be created e.g.  inner
        OuterClass.InnerClass inner = new OuterClass.InnerClass(); // if  Innerclass is already static i.e.  "static class InnerClass" 
        inner.whatsup();
        
        LocalInnerClass localInnerClass = new LocalInnerClass();  //demostrate local class within a method!!1
        localInnerClass.heyThere();
    }
}
