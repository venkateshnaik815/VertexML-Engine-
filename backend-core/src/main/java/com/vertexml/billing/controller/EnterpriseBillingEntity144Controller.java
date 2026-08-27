package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity144;
import com.vertexml.billing.service.EnterpriseBillingEntity144Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/144")
public class EnterpriseBillingEntity144Controller {
    private final EnterpriseBillingEntity144Service service;
    public EnterpriseBillingEntity144Controller(EnterpriseBillingEntity144Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity144> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity144 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity144 create(@RequestBody EnterpriseBillingEntity144 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity144 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity144 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
