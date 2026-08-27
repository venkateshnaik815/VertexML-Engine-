package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity4;
import com.vertexml.generated.repo.GenEntity4Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity4Service {
    private final GenEntity4Repository repo;
    public GenEntity4Service(GenEntity4Repository repo) { this.repo = repo; }
    
    public List<GenEntity4> getAll() { return repo.findAll(); }
    public GenEntity4 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity4 create(GenEntity4 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity4 update(UUID id, GenEntity4 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity4> all = repo.findAll();
        for(GenEntity4 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
