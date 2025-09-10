package ch.tbz.m450.util;

import ch.tbz.m450.repository.Address;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AddressComparatorTest {

    @Test
    void compare_differentDates() {
        Address a1 = new Address();
        a1.setRegistrationDate(new Date(1000000000));

        Address a2 = new Address();
        a2.setRegistrationDate(new Date(2000000000));

        AddressComparator comparator = new AddressComparator();

        assertTrue(comparator.compare(a1, a2) < 0);

        assertTrue(comparator.compare(a2, a1) > 0);
    }

    @Test
    void compare_sameDate_differentLastName() {
        Address a1 = new Address();
        a1.setRegistrationDate(new Date(1000000000));
        a1.setLastname("A");

        Address a2 = new Address();
        a2.setRegistrationDate(new Date(1000000000));
        a2.setLastname("B");

        AddressComparator comparator = new AddressComparator();

        assertTrue(comparator.compare(a1, a2) < 0);
    }

    @Test
    void compare_sameDate_sameLastName_differentFirstName() {
        Address a1 = new Address();
        a1.setRegistrationDate(new Date(1000000000));
        a1.setLastname("A");
        a1.setFirstname("A");

        Address a2 = new Address();
        a2.setRegistrationDate(new Date(1000000000));
        a2.setLastname("A");
        a2.setFirstname("B");

        AddressComparator comparator = new AddressComparator();

        assertTrue(comparator.compare(a1, a2) < 0);
    }

    @Test
    void compare_sameDate_sameLastName_sameFirstName() {
        Address a1 = new Address();
        a1.setRegistrationDate(new Date(1000000000));
        a1.setLastname("A");
        a1.setFirstname("A");

        Address a2 = new Address();
        a2.setRegistrationDate(new Date(1000000000));
        a2.setLastname("A");
        a2.setFirstname("A");

        AddressComparator comparator = new AddressComparator();

        assertTrue(comparator.compare(a1, a2) == 0);
    }
}