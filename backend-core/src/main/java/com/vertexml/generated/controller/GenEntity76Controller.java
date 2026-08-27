package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity76;
import com.vertexml.generated.service.GenEntity76Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen76")
public class GenEntity76Controller {
    private final GenEntity76Service service;
    public GenEntity76Controller(GenEntity76Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity76> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity76 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity76 create(@RequestBody GenEntity76 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity76 update(@PathVariable UUID id, @RequestBody GenEntity76 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
