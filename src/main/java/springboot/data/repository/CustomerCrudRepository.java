// Description    :   Déclaration des requetes. 
// Version        :   1.0 

package springboot.data.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import springboot.data.model.Customer;

public interface CustomerCrudRepository extends CrudRepository<Customer, Long> {

	
    List<Customer> findByLastName(String lastName);
    
    
}

