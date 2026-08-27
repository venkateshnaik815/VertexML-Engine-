package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity137;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity137Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/137")
public class EnterpriseAnalyticsEntity137Controller {
    private final EnterpriseAnalyticsEntity137Service service;
    public EnterpriseAnalyticsEntity137Controller(EnterpriseAnalyticsEntity137Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity137> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity137 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity137 create(@RequestBody EnterpriseAnalyticsEntity137 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity137 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity137 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
