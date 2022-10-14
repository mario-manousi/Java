public class Main {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();
//
//        bankAccount.withdrawal(100);
//        bankAccount.getCustomerName();

        BankAccount account = new BankAccount("Timy", "tim@tim.com", "4445464");
        System.out.println("Customer name: " + account.getCustomerName() + " email: " + account.getEmail() + " phone number: " + account.getPhoneNumber());
        account.withdrawal(100.55);
//        BankAccount bankAccount1 = new BankAccount("Tim", "asda@asdas.com","556-125-4445");
//        System.out.println(bankAccount1.getAccountNumber() + " number " + bankAccount1.getCustomerName() + " customer name " + bankAccount1.getBalance() + "$");
//
//        VipPerson vip = new VipPerson("VIP#1", 50002.025, "someVIP@vip.com");
//        System.out.println("Vip name: " + vip.getName()+ " Vip credit limit: " + vip.getCreditLimit() + " Vip email:" + vip.getEmail());
//
//        VipPerson vip2 = new VipPerson();
//        System.out.println("Vip name: " + vip2.getName()+ " Vip credit limit: " + vip2.getCreditLimit() + " Vip email:" + vip2.getEmail());
//
//        VipPerson vip3 = new VipPerson("Lali", 10000.278);
//        System.out.println("Vip name: " + vip3.getName()+ " Vip credit limit: " + vip3.getCreditLimit() + " Vip email:" + vip3.getEmail());
    }
}
