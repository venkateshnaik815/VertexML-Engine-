package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity212;
import com.vertexml.generated.repo.GenEntity212Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity212Service {
    private final GenEntity212Repository repo;
    public GenEntity212Service(GenEntity212Repository repo) { this.repo = repo; }
    
    public List<GenEntity212> getAll() { return repo.findAll(); }
    public GenEntity212 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity212 create(GenEntity212 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity212 update(UUID id, GenEntity212 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity212> all = repo.findAll();
        for(GenEntity212 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
