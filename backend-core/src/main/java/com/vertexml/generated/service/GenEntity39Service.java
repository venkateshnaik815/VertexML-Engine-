package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity39;
import com.vertexml.generated.repo.GenEntity39Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity39Service {
    private final GenEntity39Repository repo;
    public GenEntity39Service(GenEntity39Repository repo) { this.repo = repo; }
    
    public List<GenEntity39> getAll() { return repo.findAll(); }
    public GenEntity39 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity39 create(GenEntity39 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity39 update(UUID id, GenEntity39 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity39> all = repo.findAll();
        for(GenEntity39 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
