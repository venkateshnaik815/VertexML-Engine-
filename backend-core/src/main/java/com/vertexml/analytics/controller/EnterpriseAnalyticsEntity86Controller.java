package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity86;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity86Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/86")
public class EnterpriseAnalyticsEntity86Controller {
    private final EnterpriseAnalyticsEntity86Service service;
    public EnterpriseAnalyticsEntity86Controller(EnterpriseAnalyticsEntity86Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity86> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity86 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity86 create(@RequestBody EnterpriseAnalyticsEntity86 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity86 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity86 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
