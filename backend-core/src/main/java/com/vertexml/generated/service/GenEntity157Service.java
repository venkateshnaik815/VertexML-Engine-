package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity157;
import com.vertexml.generated.repo.GenEntity157Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity157Service {
    private final GenEntity157Repository repo;
    public GenEntity157Service(GenEntity157Repository repo) { this.repo = repo; }
    
    public List<GenEntity157> getAll() { return repo.findAll(); }
    public GenEntity157 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity157 create(GenEntity157 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity157 update(UUID id, GenEntity157 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity157> all = repo.findAll();
        for(GenEntity157 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
