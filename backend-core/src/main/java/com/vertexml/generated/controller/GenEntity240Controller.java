package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity240;
import com.vertexml.generated.service.GenEntity240Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen240")
public class GenEntity240Controller {
    private final GenEntity240Service service;
    public GenEntity240Controller(GenEntity240Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity240> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity240 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity240 create(@RequestBody GenEntity240 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity240 update(@PathVariable UUID id, @RequestBody GenEntity240 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
