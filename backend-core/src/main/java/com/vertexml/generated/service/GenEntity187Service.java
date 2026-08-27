package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity187;
import com.vertexml.generated.repo.GenEntity187Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity187Service {
    private final GenEntity187Repository repo;
    public GenEntity187Service(GenEntity187Repository repo) { this.repo = repo; }
    
    public List<GenEntity187> getAll() { return repo.findAll(); }
    public GenEntity187 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity187 create(GenEntity187 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity187 update(UUID id, GenEntity187 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity187> all = repo.findAll();
        for(GenEntity187 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
