public class Main {
    public static void main(String[] args) {

        BankAccount larry = new BankAccount("Larry", 5000);
        larry.withdraw(100);

        BankAccount mary = new BankAccount("Mary", 300);
        mary.deposit(100);

        larry.accountDetails();
        mary.accountDetails();


        Product gas = new Product(4.0, 10, "Gallon of gast");
        gas.printProduct();
        gas.totalCost();



    }
}