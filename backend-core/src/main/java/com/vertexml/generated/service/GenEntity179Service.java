package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity179;
import com.vertexml.generated.repo.GenEntity179Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity179Service {
    private final GenEntity179Repository repo;
    public GenEntity179Service(GenEntity179Repository repo) { this.repo = repo; }
    
    public List<GenEntity179> getAll() { return repo.findAll(); }
    public GenEntity179 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity179 create(GenEntity179 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity179 update(UUID id, GenEntity179 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity179> all = repo.findAll();
        for(GenEntity179 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
