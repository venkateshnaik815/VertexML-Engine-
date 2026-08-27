package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity46;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity46Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/46")
public class EnterpriseAnalyticsEntity46Controller {
    private final EnterpriseAnalyticsEntity46Service service;
    public EnterpriseAnalyticsEntity46Controller(EnterpriseAnalyticsEntity46Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity46> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity46 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity46 create(@RequestBody EnterpriseAnalyticsEntity46 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity46 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity46 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
