package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity269;
import com.vertexml.generated.repo.GenEntity269Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity269Service {
    private final GenEntity269Repository repo;
    public GenEntity269Service(GenEntity269Repository repo) { this.repo = repo; }
    
    public List<GenEntity269> getAll() { return repo.findAll(); }
    public GenEntity269 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity269 create(GenEntity269 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity269 update(UUID id, GenEntity269 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity269> all = repo.findAll();
        for(GenEntity269 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
