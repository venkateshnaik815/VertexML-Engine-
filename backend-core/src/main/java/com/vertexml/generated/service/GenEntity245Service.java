package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity245;
import com.vertexml.generated.repo.GenEntity245Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity245Service {
    private final GenEntity245Repository repo;
    public GenEntity245Service(GenEntity245Repository repo) { this.repo = repo; }
    
    public List<GenEntity245> getAll() { return repo.findAll(); }
    public GenEntity245 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity245 create(GenEntity245 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity245 update(UUID id, GenEntity245 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity245> all = repo.findAll();
        for(GenEntity245 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
