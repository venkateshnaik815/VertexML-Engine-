package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity88;
import com.vertexml.generated.service.GenEntity88Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen88")
public class GenEntity88Controller {
    private final GenEntity88Service service;
    public GenEntity88Controller(GenEntity88Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity88> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity88 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity88 create(@RequestBody GenEntity88 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity88 update(@PathVariable UUID id, @RequestBody GenEntity88 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
