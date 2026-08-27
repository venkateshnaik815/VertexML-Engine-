package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity42;
import com.vertexml.generated.service.GenEntity42Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen42")
public class GenEntity42Controller {
    private final GenEntity42Service service;
    public GenEntity42Controller(GenEntity42Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity42> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity42 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity42 create(@RequestBody GenEntity42 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity42 update(@PathVariable UUID id, @RequestBody GenEntity42 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
