package pe.edu.upeu.Spring.Controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/materiales")
@Api(value = "Microservicios de gestion de materiales", description ="Microservicio de materiales")
public class MaterialesController {
    
    @Autowired
    MaterialesService materialesService;

    @ApiOperation(value="Lista de material")
    @GetMapping
    public ResponseEntity<?> findAll() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Lista de materiales");
        result.put("data", materialesService.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @ApiOperation(value="Obtiene datos de una material")
    @GetMapping("/{id}")
    public ResponseEntity<Materiales> findById(@PathVariable Long id) {
        Materiales materiales = materialesService.findById(id);
        return ResponseEntity.ok(materiales);
    }

        @ApiOperation(value = "Crea un Material")
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Materiales materiales) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Programa registrado correctamente");
        result.put("data", materialesService.save(materiales));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @ApiOperation(value = "Modifica un material")
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(value = "id") Long id, @RequestBody Materiales materiales) {
        HashMap<String, Object> result = new HashMap<>();
        Materiales data = materialesService.findById(id);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con Id: " + id);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            materiales.setMateId(id);
            materialesService.save(materiales);
            result.put("success", true);
            result.put("message", "Datos actualizados correctamente.");
            result.put("data", materiales);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Elimina un material")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        HashMap<String, Object> result = new HashMap<>();
        Materiales data = materialesService.findById(id);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + id);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            materialesService.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            return new ResponseEntity<>(result, HttpStatus.OK);

        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

