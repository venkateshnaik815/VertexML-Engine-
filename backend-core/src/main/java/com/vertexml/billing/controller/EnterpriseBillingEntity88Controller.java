package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity88;
import com.vertexml.billing.service.EnterpriseBillingEntity88Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/88")
public class EnterpriseBillingEntity88Controller {
    private final EnterpriseBillingEntity88Service service;
    public EnterpriseBillingEntity88Controller(EnterpriseBillingEntity88Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity88> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity88 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity88 create(@RequestBody EnterpriseBillingEntity88 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity88 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity88 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
