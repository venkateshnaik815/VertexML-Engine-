package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity24;
import com.vertexml.generated.repo.GenEntity24Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity24Service {
    private final GenEntity24Repository repo;
    public GenEntity24Service(GenEntity24Repository repo) { this.repo = repo; }
    
    public List<GenEntity24> getAll() { return repo.findAll(); }
    public GenEntity24 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity24 create(GenEntity24 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity24 update(UUID id, GenEntity24 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity24> all = repo.findAll();
        for(GenEntity24 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
