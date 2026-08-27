package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity180;
import com.vertexml.generated.repo.GenEntity180Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity180Service {
    private final GenEntity180Repository repo;
    public GenEntity180Service(GenEntity180Repository repo) { this.repo = repo; }
    
    public List<GenEntity180> getAll() { return repo.findAll(); }
    public GenEntity180 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity180 create(GenEntity180 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity180 update(UUID id, GenEntity180 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity180> all = repo.findAll();
        for(GenEntity180 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
