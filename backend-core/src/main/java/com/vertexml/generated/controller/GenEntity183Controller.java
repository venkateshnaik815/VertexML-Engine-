package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity183;
import com.vertexml.generated.service.GenEntity183Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen183")
public class GenEntity183Controller {
    private final GenEntity183Service service;
    public GenEntity183Controller(GenEntity183Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity183> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity183 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity183 create(@RequestBody GenEntity183 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity183 update(@PathVariable UUID id, @RequestBody GenEntity183 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
