package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity13;
import com.vertexml.generated.repo.GenEntity13Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity13Service {
    private final GenEntity13Repository repo;
    public GenEntity13Service(GenEntity13Repository repo) { this.repo = repo; }
    
    public List<GenEntity13> getAll() { return repo.findAll(); }
    public GenEntity13 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity13 create(GenEntity13 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity13 update(UUID id, GenEntity13 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity13> all = repo.findAll();
        for(GenEntity13 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
