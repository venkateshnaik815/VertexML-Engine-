package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity200;
import com.vertexml.generated.service.GenEntity200Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen200")
public class GenEntity200Controller {
    private final GenEntity200Service service;
    public GenEntity200Controller(GenEntity200Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity200> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity200 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity200 create(@RequestBody GenEntity200 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity200 update(@PathVariable UUID id, @RequestBody GenEntity200 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
