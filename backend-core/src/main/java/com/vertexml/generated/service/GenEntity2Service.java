package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity2;
import com.vertexml.generated.repo.GenEntity2Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity2Service {
    private final GenEntity2Repository repo;
    public GenEntity2Service(GenEntity2Repository repo) { this.repo = repo; }
    
    public List<GenEntity2> getAll() { return repo.findAll(); }
    public GenEntity2 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity2 create(GenEntity2 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity2 update(UUID id, GenEntity2 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity2> all = repo.findAll();
        for(GenEntity2 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
