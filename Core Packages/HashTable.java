import java.util.*;

class HashTable {
    public static void main(String[] args) {
        Hashtable<String, Double> account = new Hashtable<>();

        Enumeration<String> names;
        Double balance;
        String name;

        account.put("Gaurab", 10000.0);
        account.put("Bses", 20000.0);
        account.put("Mandy", 30000.0);

        names = account.keys();

        while (names.hasMoreElements()) {
            name = names.nextElement();
            System.out.println(name + " " + account.get(name));
        }

        balance = account.get("Gaurab");

        account.put("Gaurab", balance + 1000);

        System.out.println(account.get("Gaurab"));
    }
}