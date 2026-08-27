package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity32;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity32Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/32")
public class EnterpriseAnalyticsEntity32Controller {
    private final EnterpriseAnalyticsEntity32Service service;
    public EnterpriseAnalyticsEntity32Controller(EnterpriseAnalyticsEntity32Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity32> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity32 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity32 create(@RequestBody EnterpriseAnalyticsEntity32 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity32 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity32 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
