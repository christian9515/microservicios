package microservicio.web.store.Shopping.repository;


import microservicio.web.store.Shopping.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
