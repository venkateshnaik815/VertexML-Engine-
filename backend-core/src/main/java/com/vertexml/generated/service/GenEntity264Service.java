package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity264;
import com.vertexml.generated.repo.GenEntity264Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity264Service {
    private final GenEntity264Repository repo;
    public GenEntity264Service(GenEntity264Repository repo) { this.repo = repo; }
    
    public List<GenEntity264> getAll() { return repo.findAll(); }
    public GenEntity264 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity264 create(GenEntity264 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity264 update(UUID id, GenEntity264 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity264> all = repo.findAll();
        for(GenEntity264 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
