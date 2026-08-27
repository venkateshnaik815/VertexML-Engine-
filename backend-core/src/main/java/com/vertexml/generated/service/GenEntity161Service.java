package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity161;
import com.vertexml.generated.repo.GenEntity161Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity161Service {
    private final GenEntity161Repository repo;
    public GenEntity161Service(GenEntity161Repository repo) { this.repo = repo; }
    
    public List<GenEntity161> getAll() { return repo.findAll(); }
    public GenEntity161 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity161 create(GenEntity161 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity161 update(UUID id, GenEntity161 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity161> all = repo.findAll();
        for(GenEntity161 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
