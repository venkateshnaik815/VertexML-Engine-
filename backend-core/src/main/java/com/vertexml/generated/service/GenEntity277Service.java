package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity277;
import com.vertexml.generated.repo.GenEntity277Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity277Service {
    private final GenEntity277Repository repo;
    public GenEntity277Service(GenEntity277Repository repo) { this.repo = repo; }
    
    public List<GenEntity277> getAll() { return repo.findAll(); }
    public GenEntity277 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity277 create(GenEntity277 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity277 update(UUID id, GenEntity277 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity277> all = repo.findAll();
        for(GenEntity277 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
