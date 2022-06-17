package bw.co.innerandouterclasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ishmael
 */
public class OuterClass {

    protected int num = 6;

    protected void heyThere() {
        System.out.println("from OuterClass: hey there!!!");
    }

    public static class  InnerClass{
        private int num = 8;

        protected void whatsup() {
            System.out.println("from InnerClass: hey there!!!");
        }
    }
}

