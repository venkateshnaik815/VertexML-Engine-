package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity34;
import com.vertexml.generated.repo.GenEntity34Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity34Service {
    private final GenEntity34Repository repo;
    public GenEntity34Service(GenEntity34Repository repo) { this.repo = repo; }
    
    public List<GenEntity34> getAll() { return repo.findAll(); }
    public GenEntity34 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity34 create(GenEntity34 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity34 update(UUID id, GenEntity34 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity34> all = repo.findAll();
        for(GenEntity34 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
