package com.premier.petclinic.services;

import com.premier.petclinic.model.Pet;
import java.util.Set;

public interface PerService {


    Pet findById( Long id );
    Pet save( Pet pet);
    Set<Pet> findAll();

}
