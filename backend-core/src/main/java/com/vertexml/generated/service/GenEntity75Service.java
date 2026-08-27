package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity75;
import com.vertexml.generated.repo.GenEntity75Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity75Service {
    private final GenEntity75Repository repo;
    public GenEntity75Service(GenEntity75Repository repo) { this.repo = repo; }
    
    public List<GenEntity75> getAll() { return repo.findAll(); }
    public GenEntity75 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity75 create(GenEntity75 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity75 update(UUID id, GenEntity75 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity75> all = repo.findAll();
        for(GenEntity75 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
