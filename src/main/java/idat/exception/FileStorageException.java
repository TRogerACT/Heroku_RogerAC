package idat.exception;

//configuraciones para la clase imagenes

public class FileStorageException extends RuntimeException {
    //para evitar un error en la imagen

    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
