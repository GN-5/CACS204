import java.util.Scanner;

public class TelephoneNumberExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a telephone number (in the form (555) 555-5555): ");
        String phoneNumber = scanner.nextLine();

        // Remove all non-digit characters from the phone number
        String cleanedNumber = phoneNumber.replaceAll("\\D", "");

        // Split the cleaned number into area code, first three digits, and last four
        // digits
        String[] tokens = cleanedNumber.split("(?<=^\\d{3})(?=\\d{3})|(?<=\\d{3})(?=\\d{4}$)");

        // Extract area code, first three digits, and last four digits
        String areaCode = tokens[0];
        String firstThreeDigits = tokens[1];
        String lastFourDigits = tokens[2];

        // Concatenate the seven digits into one string
        String phoneNumberDigits = areaCode + firstThreeDigits + lastFourDigits;

        // Print the area code and phone number
        System.out.println("Area Code: " + areaCode);
        System.out.println("Phone Number: " + phoneNumberDigits);

        scanner.close();

    }
}
