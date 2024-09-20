public class BankDemo {

    public static void main(String args[]) {

        BankAccount[] arrayAccount = new BankAccount[4];
        double withdrawAmount = 10;
        double depositAmount = 20;

        for (int i = 0; i < 4; i++) {
            arrayAccount[i] = new BankAccount(i, 100);
        }

        for (int i = 0; i < 4; i++) {

            arrayAccount[i].withdraw(withdrawAmount);

            System.out.println("Withdrawn amount is " + withdrawAmount + " and the remaining balance is "
                    + arrayAccount[i].getBalance());

            withdrawAmount = withdrawAmount + 10;
        }
        System.out.println("\n");

        for (int i = 0; i < 4; i++) {

            arrayAccount[i].deposit(depositAmount);

            System.out.println("Deposited amount is " + depositAmount + " and the new balance is "
                    + arrayAccount[i].getBalance());
            if (i % 2 == 0) {
                depositAmount = depositAmount - 10;
            } else {
                depositAmount = depositAmount + 10;
            }
        }
    }

}
