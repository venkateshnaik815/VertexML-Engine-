package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity10;
import com.vertexml.generated.repo.GenEntity10Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity10Service {
    private final GenEntity10Repository repo;
    public GenEntity10Service(GenEntity10Repository repo) { this.repo = repo; }
    
    public List<GenEntity10> getAll() { return repo.findAll(); }
    public GenEntity10 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity10 create(GenEntity10 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity10 update(UUID id, GenEntity10 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity10> all = repo.findAll();
        for(GenEntity10 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
