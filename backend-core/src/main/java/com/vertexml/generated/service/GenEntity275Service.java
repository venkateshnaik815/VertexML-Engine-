package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity275;
import com.vertexml.generated.repo.GenEntity275Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity275Service {
    private final GenEntity275Repository repo;
    public GenEntity275Service(GenEntity275Repository repo) { this.repo = repo; }
    
    public List<GenEntity275> getAll() { return repo.findAll(); }
    public GenEntity275 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity275 create(GenEntity275 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity275 update(UUID id, GenEntity275 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity275> all = repo.findAll();
        for(GenEntity275 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
