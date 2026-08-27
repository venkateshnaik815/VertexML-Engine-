package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity47;
import com.vertexml.generated.repo.GenEntity47Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity47Service {
    private final GenEntity47Repository repo;
    public GenEntity47Service(GenEntity47Repository repo) { this.repo = repo; }
    
    public List<GenEntity47> getAll() { return repo.findAll(); }
    public GenEntity47 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity47 create(GenEntity47 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity47 update(UUID id, GenEntity47 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity47> all = repo.findAll();
        for(GenEntity47 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
