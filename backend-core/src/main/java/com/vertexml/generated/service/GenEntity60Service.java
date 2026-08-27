package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity60;
import com.vertexml.generated.repo.GenEntity60Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity60Service {
    private final GenEntity60Repository repo;
    public GenEntity60Service(GenEntity60Repository repo) { this.repo = repo; }
    
    public List<GenEntity60> getAll() { return repo.findAll(); }
    public GenEntity60 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity60 create(GenEntity60 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity60 update(UUID id, GenEntity60 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity60> all = repo.findAll();
        for(GenEntity60 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
