package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity214;
import com.vertexml.generated.repo.GenEntity214Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity214Service {
    private final GenEntity214Repository repo;
    public GenEntity214Service(GenEntity214Repository repo) { this.repo = repo; }
    
    public List<GenEntity214> getAll() { return repo.findAll(); }
    public GenEntity214 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity214 create(GenEntity214 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity214 update(UUID id, GenEntity214 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity214> all = repo.findAll();
        for(GenEntity214 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
