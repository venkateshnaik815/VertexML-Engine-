package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity208;
import com.vertexml.generated.repo.GenEntity208Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity208Service {
    private final GenEntity208Repository repo;
    public GenEntity208Service(GenEntity208Repository repo) { this.repo = repo; }
    
    public List<GenEntity208> getAll() { return repo.findAll(); }
    public GenEntity208 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity208 create(GenEntity208 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity208 update(UUID id, GenEntity208 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity208> all = repo.findAll();
        for(GenEntity208 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
