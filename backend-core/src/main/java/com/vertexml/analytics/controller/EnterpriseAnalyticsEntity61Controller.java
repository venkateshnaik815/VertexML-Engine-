package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity61;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity61Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/61")
public class EnterpriseAnalyticsEntity61Controller {
    private final EnterpriseAnalyticsEntity61Service service;
    public EnterpriseAnalyticsEntity61Controller(EnterpriseAnalyticsEntity61Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity61> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity61 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity61 create(@RequestBody EnterpriseAnalyticsEntity61 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity61 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity61 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
