package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity124;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity124Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/124")
public class EnterpriseAnalyticsEntity124Controller {
    private final EnterpriseAnalyticsEntity124Service service;
    public EnterpriseAnalyticsEntity124Controller(EnterpriseAnalyticsEntity124Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity124> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity124 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity124 create(@RequestBody EnterpriseAnalyticsEntity124 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity124 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity124 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
