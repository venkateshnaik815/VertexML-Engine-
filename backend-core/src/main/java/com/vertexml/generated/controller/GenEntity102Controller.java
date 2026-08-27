package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity102;
import com.vertexml.generated.service.GenEntity102Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen102")
public class GenEntity102Controller {
    private final GenEntity102Service service;
    public GenEntity102Controller(GenEntity102Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity102> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity102 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity102 create(@RequestBody GenEntity102 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity102 update(@PathVariable UUID id, @RequestBody GenEntity102 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
