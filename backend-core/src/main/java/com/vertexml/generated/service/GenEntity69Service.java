package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity69;
import com.vertexml.generated.repo.GenEntity69Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity69Service {
    private final GenEntity69Repository repo;
    public GenEntity69Service(GenEntity69Repository repo) { this.repo = repo; }
    
    public List<GenEntity69> getAll() { return repo.findAll(); }
    public GenEntity69 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity69 create(GenEntity69 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity69 update(UUID id, GenEntity69 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity69> all = repo.findAll();
        for(GenEntity69 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
