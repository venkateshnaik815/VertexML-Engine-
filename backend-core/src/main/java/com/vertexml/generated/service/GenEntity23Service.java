package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity23;
import com.vertexml.generated.repo.GenEntity23Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity23Service {
    private final GenEntity23Repository repo;
    public GenEntity23Service(GenEntity23Repository repo) { this.repo = repo; }
    
    public List<GenEntity23> getAll() { return repo.findAll(); }
    public GenEntity23 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity23 create(GenEntity23 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity23 update(UUID id, GenEntity23 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity23> all = repo.findAll();
        for(GenEntity23 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
