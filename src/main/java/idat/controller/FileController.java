package idat.controller;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import idat.entity.File;
import idat.service.FileService;
import idat.util.GenericResponse;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/file")
public class FileController {
    private FileService service;

    public FileController(FileService service) {
        this.service = service;
    }

    //listar file
    @GetMapping
    public GenericResponse list() {
        return service.list();
    }


    //buscar file por id
    @GetMapping("/{id}")
    public GenericResponse find(@PathVariable Long id) {
        return null;
    }


    //descargar el file
    @GetMapping("/download/{fileName}")
    public ResponseEntity<Resource> download(@PathVariable String fileName, HttpServletRequest request) {
        return service.downloadByFileName(fileName, request);
    }

    //guardar la file
    @PostMapping
    public GenericResponse save(@ModelAttribute File obj) {
        return service.save(obj);
    }

    public GenericResponse update(Long aLong, File obj) {
        return null;
    }

    public GenericResponse delete(Long aLong) {
        return null;
    }
}
