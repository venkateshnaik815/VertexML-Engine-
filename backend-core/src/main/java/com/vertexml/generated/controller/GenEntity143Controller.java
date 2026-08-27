package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity143;
import com.vertexml.generated.service.GenEntity143Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen143")
public class GenEntity143Controller {
    private final GenEntity143Service service;
    public GenEntity143Controller(GenEntity143Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity143> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity143 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity143 create(@RequestBody GenEntity143 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity143 update(@PathVariable UUID id, @RequestBody GenEntity143 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
