package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity51;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity51Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/51")
public class EnterpriseAnalyticsEntity51Controller {
    private final EnterpriseAnalyticsEntity51Service service;
    public EnterpriseAnalyticsEntity51Controller(EnterpriseAnalyticsEntity51Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity51> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity51 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity51 create(@RequestBody EnterpriseAnalyticsEntity51 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity51 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity51 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
