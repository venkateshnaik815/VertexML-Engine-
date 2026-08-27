package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity23;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity23Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/23")
public class EnterpriseAnalyticsEntity23Controller {
    private final EnterpriseAnalyticsEntity23Service service;
    public EnterpriseAnalyticsEntity23Controller(EnterpriseAnalyticsEntity23Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity23> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity23 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity23 create(@RequestBody EnterpriseAnalyticsEntity23 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity23 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity23 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
