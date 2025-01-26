package ATMMachine;
import java.util.Scanner;

class ATM{

    float balance;
    int PIN = 5674;

    public void checkpin(){
        System.out.println("Enter your PIN:");
        Scanner sc= new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid PIN: ");
        }
    }
    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C Balance: ");
        System.out.println("2. Withdraw Money: ");
        System.out.println("3. Deposit Money: ");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt ==1){
            checkBalance();
        }
        else if(opt ==2){
            withdrawmoney();
        }
        else if(opt ==3){
            depositmoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");;
        }
    }
    public void checkBalance(){
        System.out.println("Balance: " + balance);
        menu();
    }
    public void withdrawmoney(){
        System.out.println("Enter amount to withdraw:");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextFloat();
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else {
            balance=balance - amount;
            System.out.println("Money withdrawl successful");
            System.out.println("Available Balance: " + balance);
            System.out.println(("-------------------------------"));
        }
        menu();
    }
    public void depositmoney(){
        System.out.println("Enter the amount to deposit:");
        Scanner sc= new Scanner(System.in);
        float amt = sc.nextFloat();
        balance= balance+amt;
        System.out.println("Deposited money successfully");
        menu();
    }
}
public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
