package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity56;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity56Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/56")
public class EnterpriseAnalyticsEntity56Controller {
    private final EnterpriseAnalyticsEntity56Service service;
    public EnterpriseAnalyticsEntity56Controller(EnterpriseAnalyticsEntity56Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity56> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity56 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity56 create(@RequestBody EnterpriseAnalyticsEntity56 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity56 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity56 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
