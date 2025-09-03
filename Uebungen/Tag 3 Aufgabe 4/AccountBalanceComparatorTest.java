package ch.schule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountBalanceComparatorTest {

    @Test
    void compare() {
        SalaryAccount salaryAccount1 = new SalaryAccount("1", -100);
        salaryAccount1.deposit(1, 10);
        SalaryAccount salaryAccount2 = new SalaryAccount("2", -100);
        salaryAccount2.deposit(1, 100);
        AccountBalanceComparator comparator = new AccountBalanceComparator();

        int result = comparator.compare(salaryAccount1, salaryAccount2);

        assertEquals(1, result);
    }
}