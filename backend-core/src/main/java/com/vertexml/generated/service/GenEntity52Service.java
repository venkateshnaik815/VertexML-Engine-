package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity52;
import com.vertexml.generated.repo.GenEntity52Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity52Service {
    private final GenEntity52Repository repo;
    public GenEntity52Service(GenEntity52Repository repo) { this.repo = repo; }
    
    public List<GenEntity52> getAll() { return repo.findAll(); }
    public GenEntity52 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity52 create(GenEntity52 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity52 update(UUID id, GenEntity52 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity52> all = repo.findAll();
        for(GenEntity52 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
