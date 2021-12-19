package com.mt.Reto5.crudRepository;

import com.mt.Reto5.model.Gadget;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * @author  CarlosSacristan
 * @since   2021-12-14
 */

public interface GadgetCrudRepository extends MongoRepository<Gadget, Integer> {
    @Query("{price:{$lte:?0}}") 
    public List <Gadget> findByPrice (double price);
    
    public List<Gadget> findByDescriptionContainingIgnoreCase(String description);
       
    
}
