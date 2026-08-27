package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity262;
import com.vertexml.generated.repo.GenEntity262Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity262Service {
    private final GenEntity262Repository repo;
    public GenEntity262Service(GenEntity262Repository repo) { this.repo = repo; }
    
    public List<GenEntity262> getAll() { return repo.findAll(); }
    public GenEntity262 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity262 create(GenEntity262 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity262 update(UUID id, GenEntity262 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity262> all = repo.findAll();
        for(GenEntity262 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
