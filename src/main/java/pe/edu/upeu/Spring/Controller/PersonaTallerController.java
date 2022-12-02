package pe.edu.upeu.Spring.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.Spring.entity.PersonaTaller;
import pe.edu.upeu.Spring.service.PersonaTallerService;


@RestController
@RequestMapping("/personaTaller")
@Api(value = "Microservicios de gestion de personas taller", description ="Microservicio de Persona taller")
public class PersonaTallerController {
    @Autowired
    private PersonaTallerService personaTallerService;

    @ApiOperation(value="Lista de personas taller")
    @GetMapping("/all")
    public List<PersonaTaller> findAll() {
        return personaTallerService.findAll();
    }

    @ApiOperation(value="Obtiene datos de una persona taller")
    @GetMapping("/{id}")
    public ResponseEntity<PersonaTaller> findById(@PathVariable Long id) {
        PersonaTaller personaTaller = personaTallerService.findById(id);
        return ResponseEntity.ok(personaTaller);
    }

    @ApiOperation(value="Elimina una persona taller")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        personaTallerService.deleteById(id);
    }

    @ApiOperation(value="Crea una persona taller")
    @PostMapping("/save")
    public PersonaTaller save(@RequestBody PersonaTaller personaTaller) {
        return personaTallerService.save(personaTaller);
    }

    @ApiOperation(value="Modifica una persona taller")
    @PutMapping("/update")
    public PersonaTaller update(@RequestBody PersonaTaller personaTaller) {
        return personaTallerService.save(personaTaller);
    }
}