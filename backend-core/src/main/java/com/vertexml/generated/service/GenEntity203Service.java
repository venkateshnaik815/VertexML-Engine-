package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity203;
import com.vertexml.generated.repo.GenEntity203Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity203Service {
    private final GenEntity203Repository repo;
    public GenEntity203Service(GenEntity203Repository repo) { this.repo = repo; }
    
    public List<GenEntity203> getAll() { return repo.findAll(); }
    public GenEntity203 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity203 create(GenEntity203 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity203 update(UUID id, GenEntity203 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity203> all = repo.findAll();
        for(GenEntity203 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
