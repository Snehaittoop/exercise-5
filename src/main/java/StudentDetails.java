import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String>Name=new ArrayList<>();
        ArrayList<Integer>Rollnumber=new ArrayList<>();
        ArrayList<Integer>Admissionnumber=new ArrayList<>();
        ArrayList<String>College=new ArrayList<>();
        while(true){
            System.out.println("1 student entry");
            System.out.println("2 search student Rollnumber");
            System.out.println("3 student delete");
            System.out.println("4 exist");
            System.out.println("select an option");
            int option= input.nextInt();
            switch (option){
                case 1:
                    System.out.println("enter student name");
                    String studentname= input.next();
                    Name.add(studentname);

                    System.out.println("enter the rollnumber");
                    Integer rollnum= input.nextInt();
                    Rollnumber.add(rollnum);

                    System.out.println("enter admission number");
                    Integer admissionnum= input.nextInt();
                    Admissionnumber.add(admissionnum);

                    System.out.println("enter college name");
                    String collegename= input.next();
                    College.add(collegename);
                    break;

                case 2:
                    System.out.println("enter roll number");
                    int RollNUM= input.nextInt();
                    int index=0;
                    if (Rollnumber.contains(RollNUM)){
                        index=Rollnumber.indexOf(RollNUM);
                        System.out.println("Name:" +Name.get(index));
                        System.out.println("Rollnumber:" + Rollnumber.get(index));
                        System.out.println("Admissionnumber: " +Admissionnumber.get(index));
                        System.out.println("college:" +College.get(index));

                    }
                    else {
                        System.out.println("student not found");

                    }
                    break;
                case 3:
                    System.out.println("delete student name");
                    String name= input.next();
                    int index1=0;
                    if (Name.contains(name)){
                        index1=Name.indexOf(name);
                        Name.remove(index1);
                        Admissionnumber.remove(index1);
                        Rollnumber.remove(index1);
                        College.remove(index1);
                        System.out.println("removed:"+Name);
                    }
                    else {
                        System.out.println("student not found");
                    }
                    break;
                case 4:
                    return;
                default:
                    break;







            }


        }
    }
}
