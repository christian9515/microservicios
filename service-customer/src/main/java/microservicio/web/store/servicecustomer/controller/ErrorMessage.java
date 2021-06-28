package microservicio.web.store.servicecustomer.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import microservicio.web.store.servicecustomer.repository.entity.Customer;
import microservicio.web.store.servicecustomer.repository.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

@Getter @Setter @Builder
public class ErrorMessage {
    private String code ;
    private List<Map<String, String >> messages ;

    public static interface CustomerRepository  extends JpaRepository<Customer,Long> {
        public Customer findByNumberID(String numberID);
        public List<Customer> findByLastName(String lastName);
        public List<Customer> findByRegion(Region region);
    }
}
