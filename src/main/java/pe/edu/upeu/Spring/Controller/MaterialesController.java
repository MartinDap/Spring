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
import pe.edu.upeu.Spring.entity.Materiales;
import pe.edu.upeu.Spring.service.MaterialesService;


@RestController
@RequestMapping("/material")
@Api(value = "Microservicios de gestion de materiales", description ="Microservicio de materiales")
public class MaterialesController {
    @Autowired
    private MaterialesService materialesService;

    @ApiOperation(value="Lista de material")
    @GetMapping("/all")
    public List<Materiales> findAll() {
        return materialesService.findAll();
    }

    @ApiOperation(value="Obtiene datos de una material")
    @GetMapping("/{id}")
    public ResponseEntity<Materiales> findById(@PathVariable Long id) {
        Materiales materiales = materialesService.findById(id);
        return ResponseEntity.ok(materiales);
    }

    @ApiOperation(value="Elimina una material")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        materialesService.deleteById(id);
    }

    @ApiOperation(value="Crea una material")
    @PostMapping("/save")
    public Materiales save(@RequestBody Materiales materiales) {
        return materialesService.save(materiales);
    }

    @ApiOperation(value="Modifica una material")
    @PutMapping("/update")
    public Materiales update(@RequestBody Materiales materiales) {
        return materialesService.save(materiales);
    }
}
