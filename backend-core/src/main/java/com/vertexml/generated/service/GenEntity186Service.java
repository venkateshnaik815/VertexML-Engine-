package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity186;
import com.vertexml.generated.repo.GenEntity186Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity186Service {
    private final GenEntity186Repository repo;
    public GenEntity186Service(GenEntity186Repository repo) { this.repo = repo; }
    
    public List<GenEntity186> getAll() { return repo.findAll(); }
    public GenEntity186 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity186 create(GenEntity186 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity186 update(UUID id, GenEntity186 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity186> all = repo.findAll();
        for(GenEntity186 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
