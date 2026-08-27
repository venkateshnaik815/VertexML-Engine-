package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity21;
import com.vertexml.generated.repo.GenEntity21Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity21Service {
    private final GenEntity21Repository repo;
    public GenEntity21Service(GenEntity21Repository repo) { this.repo = repo; }
    
    public List<GenEntity21> getAll() { return repo.findAll(); }
    public GenEntity21 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity21 create(GenEntity21 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity21 update(UUID id, GenEntity21 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity21> all = repo.findAll();
        for(GenEntity21 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
