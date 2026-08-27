package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity220;
import com.vertexml.generated.repo.GenEntity220Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity220Service {
    private final GenEntity220Repository repo;
    public GenEntity220Service(GenEntity220Repository repo) { this.repo = repo; }
    
    public List<GenEntity220> getAll() { return repo.findAll(); }
    public GenEntity220 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity220 create(GenEntity220 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity220 update(UUID id, GenEntity220 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity220> all = repo.findAll();
        for(GenEntity220 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
