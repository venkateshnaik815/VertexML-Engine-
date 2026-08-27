package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity26;
import com.vertexml.generated.service.GenEntity26Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen26")
public class GenEntity26Controller {
    private final GenEntity26Service service;
    public GenEntity26Controller(GenEntity26Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity26> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity26 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity26 create(@RequestBody GenEntity26 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity26 update(@PathVariable UUID id, @RequestBody GenEntity26 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
