package it.develhope.classesandobjects;

import java.security.Permission;

public class Team{

    public String teamName;

    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();



    public void printDetails(){
        System.out.println(" The team name is " + teamName);
        System.out.println("First programmer : " + p1.printProgrammerDetails());
        System.out.println("Second programmer: " + p2.printProgrammerDetails());
    }
}
