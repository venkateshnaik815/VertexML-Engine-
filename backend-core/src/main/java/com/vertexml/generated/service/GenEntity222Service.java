package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity222;
import com.vertexml.generated.repo.GenEntity222Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity222Service {
    private final GenEntity222Repository repo;
    public GenEntity222Service(GenEntity222Repository repo) { this.repo = repo; }
    
    public List<GenEntity222> getAll() { return repo.findAll(); }
    public GenEntity222 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity222 create(GenEntity222 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity222 update(UUID id, GenEntity222 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity222> all = repo.findAll();
        for(GenEntity222 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
