package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity133;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity133Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/133")
public class EnterpriseAnalyticsEntity133Controller {
    private final EnterpriseAnalyticsEntity133Service service;
    public EnterpriseAnalyticsEntity133Controller(EnterpriseAnalyticsEntity133Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity133> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity133 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity133 create(@RequestBody EnterpriseAnalyticsEntity133 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity133 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity133 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
