package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity239;
import com.vertexml.generated.repo.GenEntity239Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity239Service {
    private final GenEntity239Repository repo;
    public GenEntity239Service(GenEntity239Repository repo) { this.repo = repo; }
    
    public List<GenEntity239> getAll() { return repo.findAll(); }
    public GenEntity239 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity239 create(GenEntity239 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity239 update(UUID id, GenEntity239 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity239> all = repo.findAll();
        for(GenEntity239 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
