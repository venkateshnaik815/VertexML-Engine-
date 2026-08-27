package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity278;
import com.vertexml.generated.repo.GenEntity278Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity278Service {
    private final GenEntity278Repository repo;
    public GenEntity278Service(GenEntity278Repository repo) { this.repo = repo; }
    
    public List<GenEntity278> getAll() { return repo.findAll(); }
    public GenEntity278 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity278 create(GenEntity278 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity278 update(UUID id, GenEntity278 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity278> all = repo.findAll();
        for(GenEntity278 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
