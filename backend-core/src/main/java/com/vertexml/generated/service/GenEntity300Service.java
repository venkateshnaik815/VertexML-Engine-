package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity300;
import com.vertexml.generated.repo.GenEntity300Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity300Service {
    private final GenEntity300Repository repo;
    public GenEntity300Service(GenEntity300Repository repo) { this.repo = repo; }
    
    public List<GenEntity300> getAll() { return repo.findAll(); }
    public GenEntity300 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity300 create(GenEntity300 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity300 update(UUID id, GenEntity300 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity300> all = repo.findAll();
        for(GenEntity300 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
