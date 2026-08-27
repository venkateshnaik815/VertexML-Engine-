package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity38;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity38Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/38")
public class EnterpriseAnalyticsEntity38Controller {
    private final EnterpriseAnalyticsEntity38Service service;
    public EnterpriseAnalyticsEntity38Controller(EnterpriseAnalyticsEntity38Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity38> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity38 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity38 create(@RequestBody EnterpriseAnalyticsEntity38 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity38 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity38 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
