package idat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import idat.service.CuentasService;
import idat.util.GenericResponse;

@RestController
@RequestMapping("api/Cuentas")
public class CuentasController {
    private final CuentasService service;

    public CuentasController(CuentasService service) {
        this.service = service;
    }

    @GetMapping
    public GenericResponse listarCuentas(){
        return this.service.listarCuentas();
    }

}
