/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class CollegeManagement extends Student {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("-------------WELCOME TO COLLEGE MANAGEMENT SYSTEM-------------");
        System.out.println("1.STUDENT \n2.FACULTY");
        System.out.print("Enter Your Choice -> ");
        int choice = scn.nextInt();
        if (choice == 1) {
            Student Student = new Student();
            boolean continued = true;
            while (continued) {
                System.out.println("\n1.Add Student \n2. Delete Student");
                System.out.print("Enter Your Choice -> ");
                int ch = scn.nextInt();
                if (ch == 1) {
                    Student.add();
                }
                else if(ch == 2){
                    Student.delete();
                } 
                
                System.out.println("Do you want to continue?(Y/N)");
                char c = scn.next().charAt(0);
                if (c == 'Y' || c == 'y') {
                    continued = true;
                } else {
                    continued = false;
                }
            }
        }
            
        else if (choice == 2) {
            Faculty Faculty = new Faculty();
            boolean continued = true;
            while (continued) {
                System.out.println("\n1.Add Faculty \n2. Delete Faculty");
                System.out.print("Enter Your Choice -> ");
                int ch = scn.nextInt();
                if (ch == 1) {
                    Faculty.add();
                }
                else if(ch == 2){
                    Faculty.delete();
                }
                
                System.out.println("Do you want to continue?(Y/N)");
                char c = scn.next().charAt(0);
                if (c == 'Y' || c == 'y') {
                    continued = true;
                } else {
                    continued = false;
                }
            }
        }
        else {
            System.exit(0);
        }
    }
}

interface CMS{
    void add();
    void delete();
}

class Student implements CMS{
    String name;
    int enrollmentNo;
    
    public void add(){
        System.out.println("Enter Name of student -> ");
        Scanner scn=new Scanner(System.in);
        this.name= scn.nextLine();
        System.out.println("Enter Enrollment Number of student -> ");
        this.enrollmentNo= scn.nextInt();
    }
    
    public void delete(){
        System.out.println("Enter Enrollment Number of student -> ");
        Scanner scn=new Scanner(System.in);
        int roll= scn.nextInt();
        System.out.println("Records of " + name + " are deleted");
    }
}

class Faculty implements CMS{
    String name;
    int facultyID;
    
    public void add(){
        System.out.println("Enter Name of Faculty -> ");
        Scanner scn=new Scanner(System.in);
        this.name= scn.nextLine();
        System.out.println("Enter ID of Faculty -> ");
        this.facultyID= scn.nextInt();
    }
    
    public void delete(){
        System.out.println("Enter ID of Faculty -> ");
        Scanner scn=new Scanner(System.in);
        int id= scn.nextInt();
        System.out.println("Records of " + name + " are deleted");
    }
}