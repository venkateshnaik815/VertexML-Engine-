package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity50;
import com.vertexml.generated.repo.GenEntity50Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity50Service {
    private final GenEntity50Repository repo;
    public GenEntity50Service(GenEntity50Repository repo) { this.repo = repo; }
    
    public List<GenEntity50> getAll() { return repo.findAll(); }
    public GenEntity50 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity50 create(GenEntity50 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity50 update(UUID id, GenEntity50 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity50> all = repo.findAll();
        for(GenEntity50 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
