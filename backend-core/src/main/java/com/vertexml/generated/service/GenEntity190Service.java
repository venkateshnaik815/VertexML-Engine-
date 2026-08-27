package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity190;
import com.vertexml.generated.repo.GenEntity190Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity190Service {
    private final GenEntity190Repository repo;
    public GenEntity190Service(GenEntity190Repository repo) { this.repo = repo; }
    
    public List<GenEntity190> getAll() { return repo.findAll(); }
    public GenEntity190 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity190 create(GenEntity190 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity190 update(UUID id, GenEntity190 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity190> all = repo.findAll();
        for(GenEntity190 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
