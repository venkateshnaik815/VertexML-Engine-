package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity145;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity145Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/145")
public class EnterpriseAnalyticsEntity145Controller {
    private final EnterpriseAnalyticsEntity145Service service;
    public EnterpriseAnalyticsEntity145Controller(EnterpriseAnalyticsEntity145Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity145> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity145 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity145 create(@RequestBody EnterpriseAnalyticsEntity145 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity145 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity145 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
