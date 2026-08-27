package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity223;
import com.vertexml.generated.repo.GenEntity223Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity223Service {
    private final GenEntity223Repository repo;
    public GenEntity223Service(GenEntity223Repository repo) { this.repo = repo; }
    
    public List<GenEntity223> getAll() { return repo.findAll(); }
    public GenEntity223 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity223 create(GenEntity223 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity223 update(UUID id, GenEntity223 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity223> all = repo.findAll();
        for(GenEntity223 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
