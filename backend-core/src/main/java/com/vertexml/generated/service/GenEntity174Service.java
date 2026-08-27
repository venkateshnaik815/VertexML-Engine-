package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity174;
import com.vertexml.generated.repo.GenEntity174Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity174Service {
    private final GenEntity174Repository repo;
    public GenEntity174Service(GenEntity174Repository repo) { this.repo = repo; }
    
    public List<GenEntity174> getAll() { return repo.findAll(); }
    public GenEntity174 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity174 create(GenEntity174 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity174 update(UUID id, GenEntity174 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity174> all = repo.findAll();
        for(GenEntity174 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
