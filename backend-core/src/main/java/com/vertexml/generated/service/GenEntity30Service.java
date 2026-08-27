package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity30;
import com.vertexml.generated.repo.GenEntity30Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity30Service {
    private final GenEntity30Repository repo;
    public GenEntity30Service(GenEntity30Repository repo) { this.repo = repo; }
    
    public List<GenEntity30> getAll() { return repo.findAll(); }
    public GenEntity30 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity30 create(GenEntity30 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity30 update(UUID id, GenEntity30 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity30> all = repo.findAll();
        for(GenEntity30 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
