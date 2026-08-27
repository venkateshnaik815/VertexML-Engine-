package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity7;
import com.vertexml.generated.service.GenEntity7Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen7")
public class GenEntity7Controller {
    private final GenEntity7Service service;
    public GenEntity7Controller(GenEntity7Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity7> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity7 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity7 create(@RequestBody GenEntity7 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity7 update(@PathVariable UUID id, @RequestBody GenEntity7 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
