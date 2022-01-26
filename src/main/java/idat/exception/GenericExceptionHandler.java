package idat.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import roger.idat.util.GenericResponse;
import roger.idat.util.Global;

@RestControllerAdvice
public class GenericExceptionHandler {
    //para mostrar una operacion erronea en caso de que la imagen no se pueda subir

    @ExceptionHandler(Exception.class)
    public GenericResponse genericException(Exception ex) {
        return new GenericResponse("exception", -1, Global.OPERACION_ERRONEA, ex.getMessage());
    }
}
