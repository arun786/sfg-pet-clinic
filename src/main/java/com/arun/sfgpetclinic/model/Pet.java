package com.arun.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Pet {
    private PetType pettype;
    private Owner owner;
    private LocalDate birthDate;
}
