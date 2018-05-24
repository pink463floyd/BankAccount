package test;

import main.BankAccount;
import org.junit.Before;
import org.junit.Test;
import java.lang.Math;

import static java.lang.Math.abs;
import static main.BankAccount.OVERDRAFT_FEE;
import static org.junit.Assert.assertEquals;


public class BankAccountTest {
    BankAccount bankAccount;


    @Before
    public void setUp() {
        bankAccount = new BankAccount();
    }

    @Test
    public void MakeFirstDeposit() {
        bankAccount.deposit(50);
        assertEquals(50, bankAccount.balance);
    }
}

























/*


    @Test
    public void createBankAccountAndMakeFistDepositAndWithdraw() {
        bankAccount.deposit(50);
        bankAccount.withdraw(25);
        assertEquals(25, bankAccount.getBalance());
    }

    @Test
    public void createBankAccountAndMakeFistDepositAndOverDraft() {
        bankAccount.deposit(50);
        bankAccount.withdraw(60);
        assertEquals(-15, bankAccount.getBalance());
    }












    @Test
    public void FirstWithdrawal() {
    }

    @Test
    public void FirstOverdraw() {
    }

    @Test
    public void FirstOverdrawCharge() {
    }






/*








/*
    @Test
    public void FirstWithdrawal() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(50);
        bankAccount.withdraw(25);
        assertEquals(25, bankAccount.getBalance());
    }

    @Test
    public void FirstOverdraw() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(50);
        bankAccount.withdraw(75);
        assertEquals(-25, bankAccount.getBalance());
    }

    @Test
    public void FirstOverdrawCharge() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(50);
        bankAccount.withdraw(150);
        assertEquals(-110, bankAccount.getBalance());
    }
*/