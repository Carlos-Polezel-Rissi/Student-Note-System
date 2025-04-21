import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> School = new ArrayList<>();
        Scanner myobj = new Scanner(System.in);
        int option;
        int StudentNumber = 0;
        while(true) {
            System.out.println("== MENU ==");
            System.out.println("1 - register a new student");
            System.out.println("2 - list all student by registration");
            System.out.println("3 - search a student by registration");
            System.out.println("4 - update the note of student");
            System.out.println("5 - show average note of class");
            System.out.println("0 - exit");
            System.out.println("chose an option: ");
            option = myobj.nextInt();
            switch (option){
                case 1:
                    //1 - register a new student//
                        System.out.println("Registration: ");
                        int registration = myobj.nextInt();
                        System.out.println("Note: ");
                        int note = myobj.nextInt();
                        myobj.nextLine();
                        System.out.println("Name: ");
                        String name = myobj.nextLine();
                        School.add(new Student(name, registration, note));
                        StudentNumber++;
                break;
                case 2:
                    //2 - list all student by registration//
                    System.out.println("\nAll students bt registration");
                    for(Student s : School){
                        System.out.println("Registration = " + s.getRegistration());
                        System.out.println("Name = " + s.getName());
                        System.out.println("Note = " + s.getNote());

                    }
                break;
                case 3:
                    //3 - search a student by registration//
                    myobj.nextLine();
                    boolean found = false;
                    System.out.println("\n insert the registration to search: ");
                    int search = myobj.nextInt();
                    for(Student s : School){
                        if(s.getRegistration() == search) {
                            System.out.println("\n student found: ");
                            System.out.println("the name is " + s.getName());
                            System.out.println("the note is " + s.getNote());
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("student not found");
                    }
                break;
                case 4:
                    //"4 - update the note of student")//
                    myobj.nextLine();
                    System.out.println("insert the registration of the student: ");
                    int update = myobj.nextInt();
                    boolean Update = false;
                    for(Student s : School) {
                        if (s.getRegistration() == update) {
                            System.out.println("\n student found: ");
                            System.out.println("\n what the new note?");
                            int NewNote = myobj.nextInt();
                            myobj.nextLine();
                            s.SetNote(NewNote);
                            Update = true;
                        }
                    }
                    if(!Update){
                        System.out.println("Student not found");
                    }
                break;
                case 5:
                    //5 - show average note of class//
                    if(School.isEmpty()){
                        System.out.println("No student note are registered");
                    } else{
                        int TotalNote =0;
                        for(Student s : School){
                            TotalNote += s.getNote();
                        }
                        double average = (double) TotalNote/ StudentNumber;
                        System.out.println("The average note is " + average);
                    }
                break;
                case 0:
                    //0 - exit//
                    System.out.println("closing...");
                    return;
                default:
                    System.out.println("insert a valid option");
            }
        }
    }
}