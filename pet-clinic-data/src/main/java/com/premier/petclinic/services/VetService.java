package com.premier.petclinic.services;

import com.premier.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById( Long id );
    Vet save( Vet vet);
    Set<Vet> findAll();
}
