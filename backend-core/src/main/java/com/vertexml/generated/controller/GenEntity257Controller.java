package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity257;
import com.vertexml.generated.service.GenEntity257Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen257")
public class GenEntity257Controller {
    private final GenEntity257Service service;
    public GenEntity257Controller(GenEntity257Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity257> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity257 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity257 create(@RequestBody GenEntity257 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity257 update(@PathVariable UUID id, @RequestBody GenEntity257 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
