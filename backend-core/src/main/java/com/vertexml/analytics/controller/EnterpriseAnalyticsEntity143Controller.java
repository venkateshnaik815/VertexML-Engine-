package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity143;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity143Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/143")
public class EnterpriseAnalyticsEntity143Controller {
    private final EnterpriseAnalyticsEntity143Service service;
    public EnterpriseAnalyticsEntity143Controller(EnterpriseAnalyticsEntity143Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity143> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity143 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity143 create(@RequestBody EnterpriseAnalyticsEntity143 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity143 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity143 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
