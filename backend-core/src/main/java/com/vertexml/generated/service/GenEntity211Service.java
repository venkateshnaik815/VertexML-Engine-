package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity211;
import com.vertexml.generated.repo.GenEntity211Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity211Service {
    private final GenEntity211Repository repo;
    public GenEntity211Service(GenEntity211Repository repo) { this.repo = repo; }
    
    public List<GenEntity211> getAll() { return repo.findAll(); }
    public GenEntity211 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity211 create(GenEntity211 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity211 update(UUID id, GenEntity211 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity211> all = repo.findAll();
        for(GenEntity211 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
