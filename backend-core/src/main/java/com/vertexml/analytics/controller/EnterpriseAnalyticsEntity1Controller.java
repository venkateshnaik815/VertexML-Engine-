package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity1;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity1Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/1")
public class EnterpriseAnalyticsEntity1Controller {
    private final EnterpriseAnalyticsEntity1Service service;
    public EnterpriseAnalyticsEntity1Controller(EnterpriseAnalyticsEntity1Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity1> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity1 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity1 create(@RequestBody EnterpriseAnalyticsEntity1 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity1 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity1 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
// test api
