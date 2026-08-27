package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity158;
import com.vertexml.generated.repo.GenEntity158Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity158Service {
    private final GenEntity158Repository repo;
    public GenEntity158Service(GenEntity158Repository repo) { this.repo = repo; }
    
    public List<GenEntity158> getAll() { return repo.findAll(); }
    public GenEntity158 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity158 create(GenEntity158 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity158 update(UUID id, GenEntity158 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity158> all = repo.findAll();
        for(GenEntity158 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
