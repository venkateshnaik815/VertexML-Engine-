package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity237;
import com.vertexml.generated.repo.GenEntity237Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity237Service {
    private final GenEntity237Repository repo;
    public GenEntity237Service(GenEntity237Repository repo) { this.repo = repo; }
    
    public List<GenEntity237> getAll() { return repo.findAll(); }
    public GenEntity237 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity237 create(GenEntity237 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity237 update(UUID id, GenEntity237 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity237> all = repo.findAll();
        for(GenEntity237 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
