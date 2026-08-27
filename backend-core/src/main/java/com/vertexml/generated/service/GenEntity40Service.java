package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity40;
import com.vertexml.generated.repo.GenEntity40Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity40Service {
    private final GenEntity40Repository repo;
    public GenEntity40Service(GenEntity40Repository repo) { this.repo = repo; }
    
    public List<GenEntity40> getAll() { return repo.findAll(); }
    public GenEntity40 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity40 create(GenEntity40 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity40 update(UUID id, GenEntity40 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity40> all = repo.findAll();
        for(GenEntity40 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
