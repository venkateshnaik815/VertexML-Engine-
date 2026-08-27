package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity146;
import com.vertexml.generated.repo.GenEntity146Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity146Service {
    private final GenEntity146Repository repo;
    public GenEntity146Service(GenEntity146Repository repo) { this.repo = repo; }
    
    public List<GenEntity146> getAll() { return repo.findAll(); }
    public GenEntity146 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity146 create(GenEntity146 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity146 update(UUID id, GenEntity146 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity146> all = repo.findAll();
        for(GenEntity146 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
