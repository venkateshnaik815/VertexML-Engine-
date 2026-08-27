package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity80;
import com.vertexml.generated.repo.GenEntity80Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity80Service {
    private final GenEntity80Repository repo;
    public GenEntity80Service(GenEntity80Repository repo) { this.repo = repo; }
    
    public List<GenEntity80> getAll() { return repo.findAll(); }
    public GenEntity80 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity80 create(GenEntity80 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity80 update(UUID id, GenEntity80 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity80> all = repo.findAll();
        for(GenEntity80 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
