package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity101;
import com.vertexml.generated.repo.GenEntity101Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity101Service {
    private final GenEntity101Repository repo;
    public GenEntity101Service(GenEntity101Repository repo) { this.repo = repo; }
    
    public List<GenEntity101> getAll() { return repo.findAll(); }
    public GenEntity101 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity101 create(GenEntity101 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity101 update(UUID id, GenEntity101 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity101> all = repo.findAll();
        for(GenEntity101 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
