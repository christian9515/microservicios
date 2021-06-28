package microservicio.web.store.servicecustomer.repository;


import microservicio.web.store.servicecustomer.repository.entity.Customer;
import microservicio.web.store.servicecustomer.repository.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
// BUSCAR POR NOMBRE, ID,REGION A LOS CLIENTES
public interface CustomerRepository  extends JpaRepository<Customer,Long> {
    public Customer findByNumberID(String numberID);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByRegion(Region region);
}
