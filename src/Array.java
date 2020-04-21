import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String Array[] = new String[3];
        String Array1[] = new String[3];
            System.out.println("Podaj imie pracownika");
            Scanner scan = new Scanner(System.in);
            Array[0]=scan.nextLine();
            System.out.println("Podaj nazwisko pracownika");
            Scanner scan1 = new Scanner(System.in);
            Array[1]=scan1.nextLine();
            System.out.println("Podaj pensje pracownika");
            Scanner scan2 = new Scanner(System.in);
            Array[2]=scan2.nextLine();
        int salary = Integer.parseInt(Array[2]);
        Employee employee = new Employee(Array[0], Array[1], salary);

            System.out.println("Podaj imie drugiego pracownika");
            Scanner scan3 = new Scanner(System.in);
            Array1[0]=scan3.nextLine();
            System.out.println("Podaj nazwisko drugiego pracownika");
            Scanner scan4 = new Scanner(System.in);
            Array1[1]=scan4.nextLine();
            System.out.println("Podaj pensje drugiego pracownika");
            Scanner scan5 = new Scanner(System.in);
            Array1[2]=scan5.nextLine();
        int salary1 = Integer.parseInt(Array1[2]);
        int result = salary1+salary;
        Employee employee1 = new Employee(Array1[0], Array1[1], salary1);
        System.out.println("Wydatki firmy na pracowników  :" + result);
    }
}
