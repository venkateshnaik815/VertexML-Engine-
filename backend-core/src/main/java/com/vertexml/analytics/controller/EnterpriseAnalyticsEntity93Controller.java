package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity93;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity93Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/93")
public class EnterpriseAnalyticsEntity93Controller {
    private final EnterpriseAnalyticsEntity93Service service;
    public EnterpriseAnalyticsEntity93Controller(EnterpriseAnalyticsEntity93Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity93> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity93 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity93 create(@RequestBody EnterpriseAnalyticsEntity93 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity93 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity93 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
