package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity125;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity125Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/125")
public class EnterpriseAnalyticsEntity125Controller {
    private final EnterpriseAnalyticsEntity125Service service;
    public EnterpriseAnalyticsEntity125Controller(EnterpriseAnalyticsEntity125Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity125> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity125 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity125 create(@RequestBody EnterpriseAnalyticsEntity125 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity125 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity125 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
