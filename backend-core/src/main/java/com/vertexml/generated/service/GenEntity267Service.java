package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity267;
import com.vertexml.generated.repo.GenEntity267Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity267Service {
    private final GenEntity267Repository repo;
    public GenEntity267Service(GenEntity267Repository repo) { this.repo = repo; }
    
    public List<GenEntity267> getAll() { return repo.findAll(); }
    public GenEntity267 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity267 create(GenEntity267 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity267 update(UUID id, GenEntity267 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity267> all = repo.findAll();
        for(GenEntity267 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
