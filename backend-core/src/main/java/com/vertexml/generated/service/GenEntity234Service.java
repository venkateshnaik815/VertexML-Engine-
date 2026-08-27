package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity234;
import com.vertexml.generated.repo.GenEntity234Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity234Service {
    private final GenEntity234Repository repo;
    public GenEntity234Service(GenEntity234Repository repo) { this.repo = repo; }
    
    public List<GenEntity234> getAll() { return repo.findAll(); }
    public GenEntity234 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity234 create(GenEntity234 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity234 update(UUID id, GenEntity234 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity234> all = repo.findAll();
        for(GenEntity234 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
