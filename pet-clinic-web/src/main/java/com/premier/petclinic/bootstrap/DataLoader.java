package com.premier.petclinic.bootstrap;

import com.premier.petclinic.model.Owner;
import com.premier.petclinic.model.Vet;
import com.premier.petclinic.services.OwnerService;
import com.premier.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        try {
            Owner owner1 = new Owner();
            owner1.setFirstName("Michael");
            owner1.setLastName("Weston");
            ownerService.save(owner1);

            Owner owner2 = new Owner();
            owner2.setFirstName("Fiona");
            owner2.setLastName("Glenanne");
            ownerService.save(owner2);


            Vet vet1 = new Vet();
            vet1.setFirstName("Sam");
            vet1.setLastName("Axe");
            vetService.save(vet1);

            Vet vet2 = new Vet();
            vet2.setFirstName("Jessie");
            vet2.setLastName("Porter");
            vetService.save(vet2);

        }catch (Exception e){
            throw new Exception( e );
        }



    }


}
