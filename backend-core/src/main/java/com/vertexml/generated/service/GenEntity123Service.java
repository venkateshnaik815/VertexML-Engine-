package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity123;
import com.vertexml.generated.repo.GenEntity123Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity123Service {
    private final GenEntity123Repository repo;
    public GenEntity123Service(GenEntity123Repository repo) { this.repo = repo; }
    
    public List<GenEntity123> getAll() { return repo.findAll(); }
    public GenEntity123 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity123 create(GenEntity123 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity123 update(UUID id, GenEntity123 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity123> all = repo.findAll();
        for(GenEntity123 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
