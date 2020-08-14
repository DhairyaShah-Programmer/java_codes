import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        //Main
        Scanner choose = new Scanner(System.in);
        System.out.println("Which Option:\n1. Find age\n2.Find birth year: ");
        //Option 1
        int option = choose.nextInt();
        if(option == 1) {
            Scanner yearB = new Scanner(System.in);
            System.out.println("When were you born(year): ");
            int byear = yearB.nextInt();
            Scanner thisYear = new Scanner(System.in);
            System.out.println("What is the current year:  ");
            int year = thisYear.nextInt();    
            int aging = year - byear;
            System.out.println("Congrats!, you are now " + aging + " years old");
        }//Option 2
        else if(option == 2) {
            Scanner scanAge = new Scanner(System.in);
            System.out.println("What is your age: ");
            int age = scanAge.nextInt();
            Scanner thisYear = new Scanner(System.in);
            System.out.println("What is the current year:  ");
            int year = thisYear.nextInt();
            int birth = year - age;        
            System.out.println("You were born in the year of " + birth);
        }else {
            System.out.println("Write only numbers: ");
            
        }
    }
    
}

