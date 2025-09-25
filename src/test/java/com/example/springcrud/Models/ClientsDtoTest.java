package com.example.springcrud.Models;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Set;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
public class ClientsDtoTest {

    private static Validator validator;

    @BeforeAll
    static void setupValidator(){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
    

     @Test
        void testFieldMissing(){
            ClientsDto dto = new ClientsDto();
            dto.setName("Upul");
            dto.setEmail("upul@gmail.com");
            dto.setAddress("Homagama");
            Set<ConstraintViolation<ClientsDto>> violations = validator.validate(dto);
            assertTrue(violations.isEmpty());
        }
    

    @Test
    void testValidDto(){
            ClientsDto dto = new ClientsDto();
            dto.setName("Samantha");
            dto.setEmail("samantha@gmail.com");
            dto.setAddress("");

           Set<ConstraintViolation<ClientsDto>> violations = validator.validate(dto);
            assertEquals(1,violations.size());
        }

       

}
