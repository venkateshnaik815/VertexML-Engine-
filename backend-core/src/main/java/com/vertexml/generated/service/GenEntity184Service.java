package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity184;
import com.vertexml.generated.repo.GenEntity184Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity184Service {
    private final GenEntity184Repository repo;
    public GenEntity184Service(GenEntity184Repository repo) { this.repo = repo; }
    
    public List<GenEntity184> getAll() { return repo.findAll(); }
    public GenEntity184 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity184 create(GenEntity184 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity184 update(UUID id, GenEntity184 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity184> all = repo.findAll();
        for(GenEntity184 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
