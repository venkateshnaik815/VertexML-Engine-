package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity132;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity132Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/132")
public class EnterpriseAnalyticsEntity132Controller {
    private final EnterpriseAnalyticsEntity132Service service;
    public EnterpriseAnalyticsEntity132Controller(EnterpriseAnalyticsEntity132Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity132> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity132 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity132 create(@RequestBody EnterpriseAnalyticsEntity132 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity132 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity132 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
