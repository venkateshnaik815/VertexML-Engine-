package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity64;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity64Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/64")
public class EnterpriseAnalyticsEntity64Controller {
    private final EnterpriseAnalyticsEntity64Service service;
    public EnterpriseAnalyticsEntity64Controller(EnterpriseAnalyticsEntity64Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity64> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity64 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity64 create(@RequestBody EnterpriseAnalyticsEntity64 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity64 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity64 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
