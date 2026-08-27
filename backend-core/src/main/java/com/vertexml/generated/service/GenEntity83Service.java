package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity83;
import com.vertexml.generated.repo.GenEntity83Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity83Service {
    private final GenEntity83Repository repo;
    public GenEntity83Service(GenEntity83Repository repo) { this.repo = repo; }
    
    public List<GenEntity83> getAll() { return repo.findAll(); }
    public GenEntity83 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity83 create(GenEntity83 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity83 update(UUID id, GenEntity83 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity83> all = repo.findAll();
        for(GenEntity83 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
