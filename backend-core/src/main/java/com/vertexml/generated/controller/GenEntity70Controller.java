package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity70;
import com.vertexml.generated.service.GenEntity70Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen70")
public class GenEntity70Controller {
    private final GenEntity70Service service;
    public GenEntity70Controller(GenEntity70Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity70> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity70 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity70 create(@RequestBody GenEntity70 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity70 update(@PathVariable UUID id, @RequestBody GenEntity70 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
