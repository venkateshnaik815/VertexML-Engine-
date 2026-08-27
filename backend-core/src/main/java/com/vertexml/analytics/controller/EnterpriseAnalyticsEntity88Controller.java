package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity88;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity88Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/88")
public class EnterpriseAnalyticsEntity88Controller {
    private final EnterpriseAnalyticsEntity88Service service;
    public EnterpriseAnalyticsEntity88Controller(EnterpriseAnalyticsEntity88Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity88> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity88 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity88 create(@RequestBody EnterpriseAnalyticsEntity88 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity88 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity88 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
