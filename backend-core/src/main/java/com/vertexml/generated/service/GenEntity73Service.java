package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity73;
import com.vertexml.generated.repo.GenEntity73Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity73Service {
    private final GenEntity73Repository repo;
    public GenEntity73Service(GenEntity73Repository repo) { this.repo = repo; }
    
    public List<GenEntity73> getAll() { return repo.findAll(); }
    public GenEntity73 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity73 create(GenEntity73 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity73 update(UUID id, GenEntity73 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity73> all = repo.findAll();
        for(GenEntity73 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
