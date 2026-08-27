package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity160;
import com.vertexml.generated.repo.GenEntity160Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity160Service {
    private final GenEntity160Repository repo;
    public GenEntity160Service(GenEntity160Repository repo) { this.repo = repo; }
    
    public List<GenEntity160> getAll() { return repo.findAll(); }
    public GenEntity160 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity160 create(GenEntity160 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity160 update(UUID id, GenEntity160 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity160> all = repo.findAll();
        for(GenEntity160 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
