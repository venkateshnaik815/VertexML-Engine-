package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity121;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity121Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/121")
public class EnterpriseAnalyticsEntity121Controller {
    private final EnterpriseAnalyticsEntity121Service service;
    public EnterpriseAnalyticsEntity121Controller(EnterpriseAnalyticsEntity121Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity121> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity121 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity121 create(@RequestBody EnterpriseAnalyticsEntity121 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity121 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity121 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
