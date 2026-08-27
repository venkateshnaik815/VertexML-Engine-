package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity64;
import com.vertexml.generated.repo.GenEntity64Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity64Service {
    private final GenEntity64Repository repo;
    public GenEntity64Service(GenEntity64Repository repo) { this.repo = repo; }
    
    public List<GenEntity64> getAll() { return repo.findAll(); }
    public GenEntity64 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity64 create(GenEntity64 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity64 update(UUID id, GenEntity64 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity64> all = repo.findAll();
        for(GenEntity64 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
