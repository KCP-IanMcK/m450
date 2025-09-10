package ch.tbz.m450.service;

import ch.tbz.m450.repository.Address;
import ch.tbz.m450.repository.AddressRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class AddressServiceTest {

    @Mock
    AddressRepository addressRepository;

    @InjectMocks
    AddressService addressService;

    Address address1;
    List<Address> addresses = new ArrayList<>();

    @BeforeEach
    void setUp() {
        address1 = new Address();
        address1.setRegistrationDate(new Date(1000000000));
        Address address2 = new Address();
        address2.setRegistrationDate(new Date(2000000000));
        addresses.add(address1);
        addresses.add(address2);
    }

    @Test
    void save() {
        when(addressRepository.save(address1)).thenReturn(address1);

        var response = addressService.save(address1);

        assertEquals(response, address1);
    }

    @Test
    void getAll() {
        when(addressRepository.findAll()).thenReturn(addresses);

        var response = addressService.getAll();

        assertTrue(response.containsAll(addresses));
    }

    @Test
    void getAddress() {
        when(addressRepository.findById(1)).thenReturn(Optional.of(address1));

        var response = addressService.getAddress(1);

        assertEquals(response, Optional.of(address1));
    }
}