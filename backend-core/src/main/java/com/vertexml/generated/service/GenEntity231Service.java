package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity231;
import com.vertexml.generated.repo.GenEntity231Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity231Service {
    private final GenEntity231Repository repo;
    public GenEntity231Service(GenEntity231Repository repo) { this.repo = repo; }
    
    public List<GenEntity231> getAll() { return repo.findAll(); }
    public GenEntity231 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity231 create(GenEntity231 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity231 update(UUID id, GenEntity231 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity231> all = repo.findAll();
        for(GenEntity231 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
