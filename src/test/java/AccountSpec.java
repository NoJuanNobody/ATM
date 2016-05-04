import ATM.Account;
import ATM.OverDraft;
import ATM.Status;
import ATM.Type;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by alejandrolondono on 5/3/16.
 */
public class AccountSpec {

    Account testAct = new Account();
    double balance;
    OverDraft overdraftTest;
    Status statusTest;

    @Before
    public void sandbox(){
        balance = 5000;
        overdraftTest= OverDraft.ON;
        statusTest = Status.OPEN;
    }

    @Test
    public void getAccountTypeTest(){
        Type expectedValue = Type.SAVINGS;
        Type actualValue = testAct.getAccountType();
        assertEquals("the savings accounts should be the same ", expectedValue,actualValue);
    }

    @Test
    public void getAccountIDTest(){
        UUID uniqueID = testAct.getAccountID(Type.SAVINGS);
        assertTrue("should receive unique ID", uniqueID instanceof UUID);
    }

    @Test
    public void setAccountTypeTest(){
        Account mySavings = new Account(Type.INVESTMENT,5000);
        Type expectedType = Type.INVESTMENT;
        Type actualType = mySavings.getAccountType();
        assertEquals("the account types should be the same", expectedType, actualType);
    }

    @Test
    public void willAccountOverDraft(){
        boolean condition = testAct.willAccountOverDraft(5005);
        assertTrue("this should check if the ammount is more than the balance and will overdraft", condition);
    }

    @Test
    public void methodTest(){
        double expectedValue =0.0;
//        run the method in question
//        save to string;

        double actualValue = testAct.getAccountBalance();
        Double marginOfErr =.01;
        assertEquals("input message here", expectedValue,actualValue, marginOfErr);
    }


    @Test
    public void setAccountBalanceTest(){
        double expectedValue = 54000;
        testAct.setAccountBalance(expectedValue);
        double actualValue =testAct.getAccountBalance();
        Double marginOfErr =.01;
        assertEquals("should have set balance to "+expectedValue, expectedValue,actualValue, marginOfErr);
    }

    @Test
    public void SwitchStatusTest(){
        Status firstStatus = testAct.getStatus();
        testAct.switchStatus();
        Status secondStatus = testAct.getStatus();
        boolean condition = firstStatus != secondStatus;
        assertTrue("the status should have switched", condition);
    }

    @Test
    public void getStatus(){
        Status expectedStatus = Status.OPEN;
        Status actualStatus = testAct.getStatus();
        assertEquals("the status should be "+expectedStatus, expectedStatus, actualStatus);
    }

    @Test
    public void setStatusTest(){
        Status expectedStatus = Status.FREEZE;
        testAct.setStatus(expectedStatus);
        Status actualStatus = testAct.getStatus();
        boolean condition = expectedStatus == actualStatus;
        assertTrue("status should have been set", condition);
    }

    @Test
    public void OFACTest(){
        testAct.OFAC();
        Status expectedStatus = Status.FREEZE;
        Status actualStatus = testAct.getStatus();
        assertEquals("the account should have been Frozen", expectedStatus,actualStatus);
    }

}
