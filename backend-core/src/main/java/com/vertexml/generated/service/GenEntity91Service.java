package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity91;
import com.vertexml.generated.repo.GenEntity91Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity91Service {
    private final GenEntity91Repository repo;
    public GenEntity91Service(GenEntity91Repository repo) { this.repo = repo; }
    
    public List<GenEntity91> getAll() { return repo.findAll(); }
    public GenEntity91 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity91 create(GenEntity91 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity91 update(UUID id, GenEntity91 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity91> all = repo.findAll();
        for(GenEntity91 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
