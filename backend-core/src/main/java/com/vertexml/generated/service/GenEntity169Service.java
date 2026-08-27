package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity169;
import com.vertexml.generated.repo.GenEntity169Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity169Service {
    private final GenEntity169Repository repo;
    public GenEntity169Service(GenEntity169Repository repo) { this.repo = repo; }
    
    public List<GenEntity169> getAll() { return repo.findAll(); }
    public GenEntity169 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity169 create(GenEntity169 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity169 update(UUID id, GenEntity169 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity169> all = repo.findAll();
        for(GenEntity169 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
