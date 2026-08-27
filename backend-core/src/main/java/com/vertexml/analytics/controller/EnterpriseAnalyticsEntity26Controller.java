package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity26;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity26Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/26")
public class EnterpriseAnalyticsEntity26Controller {
    private final EnterpriseAnalyticsEntity26Service service;
    public EnterpriseAnalyticsEntity26Controller(EnterpriseAnalyticsEntity26Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity26> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity26 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity26 create(@RequestBody EnterpriseAnalyticsEntity26 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity26 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity26 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
