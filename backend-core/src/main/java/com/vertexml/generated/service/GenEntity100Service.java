package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity100;
import com.vertexml.generated.repo.GenEntity100Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity100Service {
    private final GenEntity100Repository repo;
    public GenEntity100Service(GenEntity100Repository repo) { this.repo = repo; }
    
    public List<GenEntity100> getAll() { return repo.findAll(); }
    public GenEntity100 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity100 create(GenEntity100 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity100 update(UUID id, GenEntity100 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity100> all = repo.findAll();
        for(GenEntity100 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
