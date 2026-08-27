package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity58;
import com.vertexml.generated.service.GenEntity58Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen58")
public class GenEntity58Controller {
    private final GenEntity58Service service;
    public GenEntity58Controller(GenEntity58Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity58> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity58 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity58 create(@RequestBody GenEntity58 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity58 update(@PathVariable UUID id, @RequestBody GenEntity58 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
