package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity29;
import com.vertexml.generated.repo.GenEntity29Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity29Service {
    private final GenEntity29Repository repo;
    public GenEntity29Service(GenEntity29Repository repo) { this.repo = repo; }
    
    public List<GenEntity29> getAll() { return repo.findAll(); }
    public GenEntity29 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity29 create(GenEntity29 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity29 update(UUID id, GenEntity29 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity29> all = repo.findAll();
        for(GenEntity29 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
