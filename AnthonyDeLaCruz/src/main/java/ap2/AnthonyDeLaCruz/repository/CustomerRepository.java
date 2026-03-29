package ap2.AnthonyDeLaCruz.repository;

import ap2.AnthonyDeLaCruz.model.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // ⚙️🔍 Definir método Listar por Estado
    List<Customer> findByState(String state);
    
}
