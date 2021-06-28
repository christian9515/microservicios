package microservicio.web.store.service.repository;


import microservicio.web.store.service.entity.Category;
import microservicio.web.store.service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}
