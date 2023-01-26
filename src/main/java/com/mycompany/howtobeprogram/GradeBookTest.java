/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.howtobeprogram;

import java.util.Scanner;

/**
 *
 * @author amr
 */
public class GradeBookTest {
    
    public static void main(String[] args) {
        
       // create Scanner to obtain input from command window
        Scanner input = new Scanner( System.in );
        
        // create a GradeBook object and assign it to myGradeBook
        GradeBook myGradeBook = new GradeBook();
        
        // prompt for and input course name
        System.out.println( "Please enter the course name:" );
        
        String nameOfCourse = input.nextLine(); // read a line of text
        
        System.out.println(); // outputs a blank line
        
        // call myGradeBook's displayMessage method
        // and pass nameOfCourse as an argument
        myGradeBook.displayMessage(nameOfCourse);
    }// end main
}// end class GradeBookTest
