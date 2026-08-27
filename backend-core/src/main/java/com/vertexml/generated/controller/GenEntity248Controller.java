package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity248;
import com.vertexml.generated.service.GenEntity248Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen248")
public class GenEntity248Controller {
    private final GenEntity248Service service;
    public GenEntity248Controller(GenEntity248Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity248> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity248 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity248 create(@RequestBody GenEntity248 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity248 update(@PathVariable UUID id, @RequestBody GenEntity248 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
