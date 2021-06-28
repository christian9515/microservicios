package microservicio.web.store.Shopping.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
//import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// esta seria la cabecera de la factura
@Data
@Entity
@Table(name = "tlb_invoices")
public class Invoice {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number_invoice")
    private String numberInvoice;

    private String description;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;



  //  @Valid
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "invoice_id")
    private List<InvoiceItem> items;

    private String state;

    public Invoice(){
        items = new ArrayList<>();
    }

    @PrePersist
    // se inserta antes de anotarse en la base de datos la fecha
    public void prePersist() {
        this.createAt = new Date();
    }

}
