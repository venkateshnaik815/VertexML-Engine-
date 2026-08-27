package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity27;
import com.vertexml.generated.repo.GenEntity27Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity27Service {
    private final GenEntity27Repository repo;
    public GenEntity27Service(GenEntity27Repository repo) { this.repo = repo; }
    
    public List<GenEntity27> getAll() { return repo.findAll(); }
    public GenEntity27 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity27 create(GenEntity27 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity27 update(UUID id, GenEntity27 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity27> all = repo.findAll();
        for(GenEntity27 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
