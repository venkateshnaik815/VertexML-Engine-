package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity32;
import com.vertexml.generated.service.GenEntity32Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen32")
public class GenEntity32Controller {
    private final GenEntity32Service service;
    public GenEntity32Controller(GenEntity32Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity32> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity32 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity32 create(@RequestBody GenEntity32 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity32 update(@PathVariable UUID id, @RequestBody GenEntity32 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
