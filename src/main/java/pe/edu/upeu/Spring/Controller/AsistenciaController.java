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
import pe.edu.upeu.Spring.service.AsistenciaService;
import pe.edu.upeu.Spring.entity.Asistencia;



@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/asistencia")
@Api(value = "Microservicio de gestión de Asistencia", description = "Microservicio de Asistencia")
public class AsistenciaController {
    
@Autowired
    private AsistenciaService asistenciaService;

    @ApiOperation(value = "Lista de Asistencia")
    @GetMapping
    public ResponseEntity<?> findAll() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Lista de Asistencia");
        result.put("data", asistenciaService.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @ApiOperation(value = "Obtiene datos de Asistencia")
    @GetMapping("/{id}")
    public ResponseEntity<Asistencia> findById(@PathVariable Long id) {
        Asistencia asistencia = asistenciaService.findById(id);
        return ResponseEntity.ok(asistencia);
    }

    @ApiOperation(value = "Crea Asistencia")
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Asistencia asistencia) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Programa registrado correctamente");
        result.put("data", asistenciaService.save(asistencia));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @ApiOperation(value = "Modifica Asistencia")
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(value = "id") Long id, @RequestBody Asistencia asistencia) {
        HashMap<String, Object> result = new HashMap<>();
        Asistencia data = asistenciaService.findById(id);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con Id: " + id);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            asistencia.setAsisId(id);
            asistenciaService.save(asistencia);
            result.put("success", true);
            result.put("message", "Datos actualizados correctamente.");
            result.put("data", asistencia);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Elimina Asistencia")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        HashMap<String, Object> result = new HashMap<>();
        Asistencia data = asistenciaService.findById(id);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + id);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            asistenciaService.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            return new ResponseEntity<>(result, HttpStatus.OK);

        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
