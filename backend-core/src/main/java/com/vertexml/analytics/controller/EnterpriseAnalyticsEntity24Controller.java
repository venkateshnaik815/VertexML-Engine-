package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity24;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity24Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/24")
public class EnterpriseAnalyticsEntity24Controller {
    private final EnterpriseAnalyticsEntity24Service service;
    public EnterpriseAnalyticsEntity24Controller(EnterpriseAnalyticsEntity24Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity24> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity24 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity24 create(@RequestBody EnterpriseAnalyticsEntity24 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity24 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity24 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
