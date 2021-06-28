package microservicio.web.store.service.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
 // Clase encargada de mandar el valor de error de las validaciones
@Getter @Setter @Builder
public class ErrorMessage {
    private String code ;
    private List<Map<String, String >> messages ;
}
