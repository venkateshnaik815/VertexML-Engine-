package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity254;
import com.vertexml.generated.service.GenEntity254Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen254")
public class GenEntity254Controller {
    private final GenEntity254Service service;
    public GenEntity254Controller(GenEntity254Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity254> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity254 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity254 create(@RequestBody GenEntity254 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity254 update(@PathVariable UUID id, @RequestBody GenEntity254 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
