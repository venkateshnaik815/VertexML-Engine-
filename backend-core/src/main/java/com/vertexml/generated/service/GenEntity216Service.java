package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity216;
import com.vertexml.generated.repo.GenEntity216Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity216Service {
    private final GenEntity216Repository repo;
    public GenEntity216Service(GenEntity216Repository repo) { this.repo = repo; }
    
    public List<GenEntity216> getAll() { return repo.findAll(); }
    public GenEntity216 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity216 create(GenEntity216 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity216 update(UUID id, GenEntity216 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity216> all = repo.findAll();
        for(GenEntity216 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
