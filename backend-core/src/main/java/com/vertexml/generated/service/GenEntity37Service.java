package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity37;
import com.vertexml.generated.repo.GenEntity37Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity37Service {
    private final GenEntity37Repository repo;
    public GenEntity37Service(GenEntity37Repository repo) { this.repo = repo; }
    
    public List<GenEntity37> getAll() { return repo.findAll(); }
    public GenEntity37 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity37 create(GenEntity37 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity37 update(UUID id, GenEntity37 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity37> all = repo.findAll();
        for(GenEntity37 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
