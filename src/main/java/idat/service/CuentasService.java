package idat.service;

import org.springframework.stereotype.Service;
import idat.repository.CuentasRepository;
import idat.util.GenericResponse;

import javax.transaction.Transactional;

import static idat.util.Global.*;

@Service
@Transactional
public class CuentasService {
    private final CuentasRepository repository;

    public CuentasService(CuentasRepository repository) {
        this.repository = repository;
    }
    public GenericResponse listarCuentas(){
        return new GenericResponse(TIPO_DATA, RPTA_OK, OPERACION_CORRECTA, this.repository.listarCuentas());
    }
}