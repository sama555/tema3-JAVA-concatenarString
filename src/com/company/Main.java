package com.company;

public class Main<nombres> {

    public static void main(String[] args) {
	// write your code here
        String[] nombres ={"mesa","telefono","maria","carpeta"};
        String a = " ";
        for(String nombre:nombres) {

            a += " "+ nombre;
        }
        System.out.println(a);
    }



}
