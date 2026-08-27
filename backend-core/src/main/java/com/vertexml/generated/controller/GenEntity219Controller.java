package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity219;
import com.vertexml.generated.service.GenEntity219Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen219")
public class GenEntity219Controller {
    private final GenEntity219Service service;
    public GenEntity219Controller(GenEntity219Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity219> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity219 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity219 create(@RequestBody GenEntity219 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity219 update(@PathVariable UUID id, @RequestBody GenEntity219 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
