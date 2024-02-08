import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        System.out.println("What cities do you want to add? ");
        String addCity = input.nextLine();
        while( !(addCity.equals("Stop"))) {
            System.out.println("What cities do you want to add? ");
            Set<String> cities = new HashSet<>();
            cities.add(input.nextLine());

        }



    }
    static void addingCity(ArrayList<String>a, String ciudad){
        a.add(ciudad);
    }
    static Double cityAverage(ArrayList<String> a){
        System.out.println("Average Temperature for Monday: ");
        double temp1 = input.nextDouble();
        System.out.println("Average Temperature for Tuesday: ");
        double temp2 = input.nextDouble();
        System.out.println("Average Temperature for Wednesday: ");
        double temp3 = input.nextDouble();
        System.out.println("Average Temperature for Thursday: ");
        double temp4 = input.nextDouble();
        System.out.println("Average Temperature for Friday: ");
        double temp5= input.nextDouble();

        double average = temp1 + temp2 + temp3 +temp4 +temp5/5;
        return average;
    }
}