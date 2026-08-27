package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity172;
import com.vertexml.generated.repo.GenEntity172Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity172Service {
    private final GenEntity172Repository repo;
    public GenEntity172Service(GenEntity172Repository repo) { this.repo = repo; }
    
    public List<GenEntity172> getAll() { return repo.findAll(); }
    public GenEntity172 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity172 create(GenEntity172 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity172 update(UUID id, GenEntity172 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity172> all = repo.findAll();
        for(GenEntity172 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
