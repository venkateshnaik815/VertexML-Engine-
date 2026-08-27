package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity27;
import com.vertexml.generated.service.GenEntity27Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen27")
public class GenEntity27Controller {
    private final GenEntity27Service service;
    public GenEntity27Controller(GenEntity27Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity27> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity27 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity27 create(@RequestBody GenEntity27 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity27 update(@PathVariable UUID id, @RequestBody GenEntity27 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
