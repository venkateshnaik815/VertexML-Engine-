package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity218;
import com.vertexml.generated.repo.GenEntity218Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity218Service {
    private final GenEntity218Repository repo;
    public GenEntity218Service(GenEntity218Repository repo) { this.repo = repo; }
    
    public List<GenEntity218> getAll() { return repo.findAll(); }
    public GenEntity218 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity218 create(GenEntity218 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity218 update(UUID id, GenEntity218 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity218> all = repo.findAll();
        for(GenEntity218 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
