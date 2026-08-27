package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity11;
import com.vertexml.generated.repo.GenEntity11Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity11Service {
    private final GenEntity11Repository repo;
    public GenEntity11Service(GenEntity11Repository repo) { this.repo = repo; }
    
    public List<GenEntity11> getAll() { return repo.findAll(); }
    public GenEntity11 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity11 create(GenEntity11 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity11 update(UUID id, GenEntity11 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity11> all = repo.findAll();
        for(GenEntity11 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
