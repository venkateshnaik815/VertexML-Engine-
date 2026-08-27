package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity108;
import com.vertexml.generated.repo.GenEntity108Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity108Service {
    private final GenEntity108Repository repo;
    public GenEntity108Service(GenEntity108Repository repo) { this.repo = repo; }
    
    public List<GenEntity108> getAll() { return repo.findAll(); }
    public GenEntity108 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity108 create(GenEntity108 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity108 update(UUID id, GenEntity108 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity108> all = repo.findAll();
        for(GenEntity108 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
