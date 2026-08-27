package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity238;
import com.vertexml.generated.repo.GenEntity238Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity238Service {
    private final GenEntity238Repository repo;
    public GenEntity238Service(GenEntity238Repository repo) { this.repo = repo; }
    
    public List<GenEntity238> getAll() { return repo.findAll(); }
    public GenEntity238 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity238 create(GenEntity238 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity238 update(UUID id, GenEntity238 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity238> all = repo.findAll();
        for(GenEntity238 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
