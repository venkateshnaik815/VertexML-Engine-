package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity256;
import com.vertexml.generated.service.GenEntity256Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen256")
public class GenEntity256Controller {
    private final GenEntity256Service service;
    public GenEntity256Controller(GenEntity256Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity256> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity256 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity256 create(@RequestBody GenEntity256 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity256 update(@PathVariable UUID id, @RequestBody GenEntity256 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
