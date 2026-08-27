package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity81;
import com.vertexml.generated.repo.GenEntity81Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity81Service {
    private final GenEntity81Repository repo;
    public GenEntity81Service(GenEntity81Repository repo) { this.repo = repo; }
    
    public List<GenEntity81> getAll() { return repo.findAll(); }
    public GenEntity81 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity81 create(GenEntity81 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity81 update(UUID id, GenEntity81 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity81> all = repo.findAll();
        for(GenEntity81 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
