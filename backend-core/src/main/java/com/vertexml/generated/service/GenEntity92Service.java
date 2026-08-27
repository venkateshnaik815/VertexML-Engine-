package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity92;
import com.vertexml.generated.repo.GenEntity92Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity92Service {
    private final GenEntity92Repository repo;
    public GenEntity92Service(GenEntity92Repository repo) { this.repo = repo; }
    
    public List<GenEntity92> getAll() { return repo.findAll(); }
    public GenEntity92 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity92 create(GenEntity92 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity92 update(UUID id, GenEntity92 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity92> all = repo.findAll();
        for(GenEntity92 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
