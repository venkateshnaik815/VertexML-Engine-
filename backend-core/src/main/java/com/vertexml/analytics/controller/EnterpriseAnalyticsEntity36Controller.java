package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity36;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity36Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/36")
public class EnterpriseAnalyticsEntity36Controller {
    private final EnterpriseAnalyticsEntity36Service service;
    public EnterpriseAnalyticsEntity36Controller(EnterpriseAnalyticsEntity36Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity36> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity36 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity36 create(@RequestBody EnterpriseAnalyticsEntity36 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity36 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity36 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
