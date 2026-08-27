package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity66;
import com.vertexml.generated.repo.GenEntity66Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity66Service {
    private final GenEntity66Repository repo;
    public GenEntity66Service(GenEntity66Repository repo) { this.repo = repo; }
    
    public List<GenEntity66> getAll() { return repo.findAll(); }
    public GenEntity66 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity66 create(GenEntity66 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity66 update(UUID id, GenEntity66 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity66> all = repo.findAll();
        for(GenEntity66 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
