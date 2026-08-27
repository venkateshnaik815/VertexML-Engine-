package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity44;
import com.vertexml.generated.repo.GenEntity44Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity44Service {
    private final GenEntity44Repository repo;
    public GenEntity44Service(GenEntity44Repository repo) { this.repo = repo; }
    
    public List<GenEntity44> getAll() { return repo.findAll(); }
    public GenEntity44 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity44 create(GenEntity44 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity44 update(UUID id, GenEntity44 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity44> all = repo.findAll();
        for(GenEntity44 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
