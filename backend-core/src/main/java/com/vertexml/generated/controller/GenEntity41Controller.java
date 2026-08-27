package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity41;
import com.vertexml.generated.service.GenEntity41Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen41")
public class GenEntity41Controller {
    private final GenEntity41Service service;
    public GenEntity41Controller(GenEntity41Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity41> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity41 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity41 create(@RequestBody GenEntity41 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity41 update(@PathVariable UUID id, @RequestBody GenEntity41 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
