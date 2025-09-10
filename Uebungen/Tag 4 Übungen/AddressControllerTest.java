package ch.tbz.m450.controller;

import ch.tbz.m450.repository.Address;
import ch.tbz.m450.service.AddressService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AddressControllerTest {

    @Mock
    AddressService addressService;

    @InjectMocks
    AddressController addressController;

    Address address1;
    List<Address> addresses = new ArrayList<>();

    @BeforeEach
    void setUp() {
        address1 = new Address();
        Address address2 = new Address();
        addresses.add(address1);
        addresses.add(address2);
    }

    @Test
    void createAddress() {
        ResponseEntity<Address> responseEntity = ResponseEntity.status(201).body(address1);
        when(addressService.save(address1)).thenReturn(address1);

        var result = addressController.createAddress(address1);

        assertEquals(responseEntity, result);
    }

    @Test
    void getAddresses() {
        when(addressService.getAll()).thenReturn(addresses);
        ResponseEntity<List<Address>> responseEntity = ResponseEntity.status(200).body(addresses);

        var result = addressController.getAddresses();

        assertEquals(responseEntity, result);
    }

    @Test
    void getAddress_WithCorrectAddress() {
        when(addressService.getAddress(1)).thenReturn(Optional.of(address1));
        ResponseEntity<Address> responseEntity = ResponseEntity.status(200).body(address1);

        var result = addressController.getAddress(1);

        assertEquals(responseEntity, result);
    }

    @Test
    void getAddress_WithNoAddress() {
        when(addressService.getAddress(1)).thenReturn(Optional.empty());
        ResponseEntity<Object> responseEntity = ResponseEntity.status(404).build();

        var result = addressController.getAddress(1);

        assertEquals(responseEntity, result);
    }
}