package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity213;
import com.vertexml.generated.repo.GenEntity213Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity213Service {
    private final GenEntity213Repository repo;
    public GenEntity213Service(GenEntity213Repository repo) { this.repo = repo; }
    
    public List<GenEntity213> getAll() { return repo.findAll(); }
    public GenEntity213 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity213 create(GenEntity213 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity213 update(UUID id, GenEntity213 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity213> all = repo.findAll();
        for(GenEntity213 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
