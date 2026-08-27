package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity93;
import com.vertexml.generated.repo.GenEntity93Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity93Service {
    private final GenEntity93Repository repo;
    public GenEntity93Service(GenEntity93Repository repo) { this.repo = repo; }
    
    public List<GenEntity93> getAll() { return repo.findAll(); }
    public GenEntity93 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity93 create(GenEntity93 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity93 update(UUID id, GenEntity93 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity93> all = repo.findAll();
        for(GenEntity93 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
