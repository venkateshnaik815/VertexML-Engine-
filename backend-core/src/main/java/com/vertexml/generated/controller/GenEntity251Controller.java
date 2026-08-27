package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity251;
import com.vertexml.generated.service.GenEntity251Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen251")
public class GenEntity251Controller {
    private final GenEntity251Service service;
    public GenEntity251Controller(GenEntity251Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity251> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity251 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity251 create(@RequestBody GenEntity251 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity251 update(@PathVariable UUID id, @RequestBody GenEntity251 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
