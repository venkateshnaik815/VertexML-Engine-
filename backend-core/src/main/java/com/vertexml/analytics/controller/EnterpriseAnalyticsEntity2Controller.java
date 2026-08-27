package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity2;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity2Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/2")
public class EnterpriseAnalyticsEntity2Controller {
    private final EnterpriseAnalyticsEntity2Service service;
    public EnterpriseAnalyticsEntity2Controller(EnterpriseAnalyticsEntity2Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity2> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity2 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity2 create(@RequestBody EnterpriseAnalyticsEntity2 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity2 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity2 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
