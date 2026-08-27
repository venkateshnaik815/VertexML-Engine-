package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity206;
import com.vertexml.generated.service.GenEntity206Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen206")
public class GenEntity206Controller {
    private final GenEntity206Service service;
    public GenEntity206Controller(GenEntity206Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity206> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity206 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity206 create(@RequestBody GenEntity206 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity206 update(@PathVariable UUID id, @RequestBody GenEntity206 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
