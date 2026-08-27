package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity17;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity17Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/17")
public class EnterpriseAnalyticsEntity17Controller {
    private final EnterpriseAnalyticsEntity17Service service;
    public EnterpriseAnalyticsEntity17Controller(EnterpriseAnalyticsEntity17Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity17> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity17 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity17 create(@RequestBody EnterpriseAnalyticsEntity17 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity17 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity17 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
