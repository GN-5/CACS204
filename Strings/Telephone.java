import java.util.*;

class StringDemo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter phone number ");
        String str = input.next();

        String[] numbers = str.split("[\\(|\\)-]", -1);
        String areacode = numbers[1];
        String firstThree = numbers[2];
        String lastThree = numbers[3];

        System.out.println("Areacode : " + areacode.toString());
        System.out.println("Phone number : " + areacode.concat(firstThree).concat(lastThree));
        input.close();

    }
}