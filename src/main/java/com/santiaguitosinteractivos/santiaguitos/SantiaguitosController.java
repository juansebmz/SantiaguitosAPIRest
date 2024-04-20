package com.santiaguitosinteractivos.santiaguitos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/santiaguitos")
public class SantiaguitosController {

    @Autowired
    SantiaguitosService santiaguitosService;

    @GetMapping
    private ResponseEntity getAllSantiaguitos() {
        return new ResponseEntity<List<Santiaguitos>>(santiaguitosService.getAllSantiaguitos(), HttpStatus.OK
         );
    }

    @GetMapping("estudiante/{identificacion}")
    public ResponseEntity<Optional<Santiaguitos>> getOneSantiaguitos(@PathVariable int identificacion) {
        return new ResponseEntity<Optional<Santiaguitos>>(santiaguitosService.oneSantiaguito(identificacion), HttpStatus.OK);
    }

}
