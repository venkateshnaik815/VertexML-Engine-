package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity130;
import com.vertexml.generated.service.GenEntity130Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen130")
public class GenEntity130Controller {
    private final GenEntity130Service service;
    public GenEntity130Controller(GenEntity130Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity130> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity130 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity130 create(@RequestBody GenEntity130 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity130 update(@PathVariable UUID id, @RequestBody GenEntity130 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
