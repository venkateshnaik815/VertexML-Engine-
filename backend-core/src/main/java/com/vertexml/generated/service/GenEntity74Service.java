package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity74;
import com.vertexml.generated.repo.GenEntity74Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity74Service {
    private final GenEntity74Repository repo;
    public GenEntity74Service(GenEntity74Repository repo) { this.repo = repo; }
    
    public List<GenEntity74> getAll() { return repo.findAll(); }
    public GenEntity74 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity74 create(GenEntity74 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity74 update(UUID id, GenEntity74 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity74> all = repo.findAll();
        for(GenEntity74 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
