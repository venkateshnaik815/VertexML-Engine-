package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity71;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity71Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/71")
public class EnterpriseAnalyticsEntity71Controller {
    private final EnterpriseAnalyticsEntity71Service service;
    public EnterpriseAnalyticsEntity71Controller(EnterpriseAnalyticsEntity71Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity71> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity71 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity71 create(@RequestBody EnterpriseAnalyticsEntity71 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity71 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity71 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
