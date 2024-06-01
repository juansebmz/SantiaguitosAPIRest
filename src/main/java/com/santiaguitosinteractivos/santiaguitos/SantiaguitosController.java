package com.santiaguitosinteractivos.santiaguitos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin (origins = "* ")
@RequestMapping("/api/v1/santiaguitos")
public class SantiaguitosController {

    @Autowired
    SantiaguitosService santiaguitosService;


    @PostMapping(value = "/save")
    public String saveSantiaguito(@RequestBody Santiaguitos santiaguitos) {

         santiaguitosService.saveorUpdate(santiaguitos);
        return santiaguitos.get_id();
    }


    @GetMapping(value = "/getAll")
    public Iterable<Santiaguitos>getSantiaguitos() {

        return santiaguitosService.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private Santiaguitos update(@RequestBody Santiaguitos santiaguitos, @PathVariable(name = "id")String _id){
        santiaguitos.set_id(_id);
        santiaguitosService.saveorUpdate(santiaguitos);
        return santiaguitos;

    }

    @DeleteMapping ("/delete/{id}")
    private void deleteSantiaguito(@PathVariable("id")String _id){
        santiaguitosService.deleteSantiaguito(_id);
    }

    @RequestMapping("/search/{id}")
    private Santiaguitos getSantiaguito(@PathVariable("id")String santiaguitoid){
        return santiaguitosService.getSantiaguitoById(santiaguitoid);
    }
}
