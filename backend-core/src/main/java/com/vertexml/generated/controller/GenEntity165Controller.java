package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity165;
import com.vertexml.generated.service.GenEntity165Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen165")
public class GenEntity165Controller {
    private final GenEntity165Service service;
    public GenEntity165Controller(GenEntity165Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity165> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity165 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity165 create(@RequestBody GenEntity165 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity165 update(@PathVariable UUID id, @RequestBody GenEntity165 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
