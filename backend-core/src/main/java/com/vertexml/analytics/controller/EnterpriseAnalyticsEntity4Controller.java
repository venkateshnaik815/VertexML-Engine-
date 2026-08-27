package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity4;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity4Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/4")
public class EnterpriseAnalyticsEntity4Controller {
    private final EnterpriseAnalyticsEntity4Service service;
    public EnterpriseAnalyticsEntity4Controller(EnterpriseAnalyticsEntity4Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity4> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity4 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity4 create(@RequestBody EnterpriseAnalyticsEntity4 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity4 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity4 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
