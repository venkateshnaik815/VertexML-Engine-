package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity198;
import com.vertexml.generated.repo.GenEntity198Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity198Service {
    private final GenEntity198Repository repo;
    public GenEntity198Service(GenEntity198Repository repo) { this.repo = repo; }
    
    public List<GenEntity198> getAll() { return repo.findAll(); }
    public GenEntity198 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity198 create(GenEntity198 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity198 update(UUID id, GenEntity198 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity198> all = repo.findAll();
        for(GenEntity198 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
