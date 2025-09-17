package ch.tbz.m450.testing.tools.controller;

import ch.tbz.m450.testing.tools.repository.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class StudentControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void getStudents() {
        ResponseEntity<String> response = restTemplate.getForEntity("/students", String.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("[{\"id\":1,\"name\":\"Jonas\",\"email\":\"jonas@tbz.ch\"},{\"id\":2,\"name\":\"Patrick\",\"email\":\"patrick@tbz.ch\"},{\"id\":3,\"name\":\"Yves\",\"email\":\"yves@tbz.ch\"},{\"id\":4,\"name\":\"Peter\",\"email\":\"peter@tbz.ch\"},{\"id\":5,\"name\":\"Ann\",\"email\":\"ann@tbz.ch\"}]",
                response.getBody().toString());
    }

    @Test
    void addStudent() {
        Student student = new Student("Hans", "hans@tbz.ch");
        ResponseEntity<String> response = restTemplate.postForEntity("/students", student, String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}