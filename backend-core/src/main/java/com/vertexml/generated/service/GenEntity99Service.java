package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity99;
import com.vertexml.generated.repo.GenEntity99Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity99Service {
    private final GenEntity99Repository repo;
    public GenEntity99Service(GenEntity99Repository repo) { this.repo = repo; }
    
    public List<GenEntity99> getAll() { return repo.findAll(); }
    public GenEntity99 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity99 create(GenEntity99 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity99 update(UUID id, GenEntity99 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity99> all = repo.findAll();
        for(GenEntity99 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
