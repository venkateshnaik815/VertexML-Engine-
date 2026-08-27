package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity60;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity60Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/60")
public class EnterpriseAnalyticsEntity60Controller {
    private final EnterpriseAnalyticsEntity60Service service;
    public EnterpriseAnalyticsEntity60Controller(EnterpriseAnalyticsEntity60Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity60> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity60 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity60 create(@RequestBody EnterpriseAnalyticsEntity60 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity60 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity60 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
