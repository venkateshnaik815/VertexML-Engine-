package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity1;
import com.vertexml.generated.repo.GenEntity1Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity1Service {
    private final GenEntity1Repository repo;
    public GenEntity1Service(GenEntity1Repository repo) { this.repo = repo; }
    
    public List<GenEntity1> getAll() { return repo.findAll(); }
    public GenEntity1 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity1 create(GenEntity1 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity1 update(UUID id, GenEntity1 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity1> all = repo.findAll();
        for(GenEntity1 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
