package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity85;
import com.vertexml.generated.repo.GenEntity85Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity85Service {
    private final GenEntity85Repository repo;
    public GenEntity85Service(GenEntity85Repository repo) { this.repo = repo; }
    
    public List<GenEntity85> getAll() { return repo.findAll(); }
    public GenEntity85 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity85 create(GenEntity85 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity85 update(UUID id, GenEntity85 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity85> all = repo.findAll();
        for(GenEntity85 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
