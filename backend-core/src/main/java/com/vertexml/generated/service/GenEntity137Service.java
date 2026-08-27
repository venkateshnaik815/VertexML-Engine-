package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity137;
import com.vertexml.generated.repo.GenEntity137Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity137Service {
    private final GenEntity137Repository repo;
    public GenEntity137Service(GenEntity137Repository repo) { this.repo = repo; }
    
    public List<GenEntity137> getAll() { return repo.findAll(); }
    public GenEntity137 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity137 create(GenEntity137 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity137 update(UUID id, GenEntity137 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity137> all = repo.findAll();
        for(GenEntity137 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
