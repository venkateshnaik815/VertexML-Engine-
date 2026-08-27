package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity119;
import com.vertexml.generated.repo.GenEntity119Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity119Service {
    private final GenEntity119Repository repo;
    public GenEntity119Service(GenEntity119Repository repo) { this.repo = repo; }
    
    public List<GenEntity119> getAll() { return repo.findAll(); }
    public GenEntity119 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity119 create(GenEntity119 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity119 update(UUID id, GenEntity119 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity119> all = repo.findAll();
        for(GenEntity119 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
