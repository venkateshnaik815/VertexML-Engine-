package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity272;
import com.vertexml.generated.service.GenEntity272Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen272")
public class GenEntity272Controller {
    private final GenEntity272Service service;
    public GenEntity272Controller(GenEntity272Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity272> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity272 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity272 create(@RequestBody GenEntity272 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity272 update(@PathVariable UUID id, @RequestBody GenEntity272 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
