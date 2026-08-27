package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity164;
import com.vertexml.generated.service.GenEntity164Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen164")
public class GenEntity164Controller {
    private final GenEntity164Service service;
    public GenEntity164Controller(GenEntity164Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity164> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity164 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity164 create(@RequestBody GenEntity164 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity164 update(@PathVariable UUID id, @RequestBody GenEntity164 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
