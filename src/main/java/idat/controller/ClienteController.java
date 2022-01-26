package idat.controller;

import org.springframework.web.bind.annotation.*;
import roger.idat.entity.Cliente;
import roger.idat.service.ClienteService;
import roger.idat.util.GenericResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public GenericResponse save(@Valid @RequestBody Cliente c){
        return this.service.save(c);
    }

    @PutMapping("/{id}")
    public GenericResponse update(@PathVariable int id, @Valid @RequestBody Cliente c){
        c.setId(id);
        return this.service.save(c);
    }
}