package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity3;
import com.vertexml.generated.service.GenEntity3Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen3")
public class GenEntity3Controller {
    private final GenEntity3Service service;
    public GenEntity3Controller(GenEntity3Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity3> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity3 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity3 create(@RequestBody GenEntity3 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity3 update(@PathVariable UUID id, @RequestBody GenEntity3 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
