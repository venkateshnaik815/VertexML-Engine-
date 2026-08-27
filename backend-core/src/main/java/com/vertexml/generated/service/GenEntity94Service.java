package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity94;
import com.vertexml.generated.repo.GenEntity94Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity94Service {
    private final GenEntity94Repository repo;
    public GenEntity94Service(GenEntity94Repository repo) { this.repo = repo; }
    
    public List<GenEntity94> getAll() { return repo.findAll(); }
    public GenEntity94 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity94 create(GenEntity94 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity94 update(UUID id, GenEntity94 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity94> all = repo.findAll();
        for(GenEntity94 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
