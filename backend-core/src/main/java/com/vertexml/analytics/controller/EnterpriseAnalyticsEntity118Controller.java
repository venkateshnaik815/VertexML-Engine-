package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity118;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity118Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/118")
public class EnterpriseAnalyticsEntity118Controller {
    private final EnterpriseAnalyticsEntity118Service service;
    public EnterpriseAnalyticsEntity118Controller(EnterpriseAnalyticsEntity118Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity118> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity118 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity118 create(@RequestBody EnterpriseAnalyticsEntity118 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity118 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity118 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
