package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity250;
import com.vertexml.generated.service.GenEntity250Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen250")
public class GenEntity250Controller {
    private final GenEntity250Service service;
    public GenEntity250Controller(GenEntity250Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity250> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity250 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity250 create(@RequestBody GenEntity250 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity250 update(@PathVariable UUID id, @RequestBody GenEntity250 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
