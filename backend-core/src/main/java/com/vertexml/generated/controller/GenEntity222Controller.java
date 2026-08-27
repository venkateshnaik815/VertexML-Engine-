package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity222;
import com.vertexml.generated.service.GenEntity222Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen222")
public class GenEntity222Controller {
    private final GenEntity222Service service;
    public GenEntity222Controller(GenEntity222Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity222> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity222 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity222 create(@RequestBody GenEntity222 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity222 update(@PathVariable UUID id, @RequestBody GenEntity222 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
