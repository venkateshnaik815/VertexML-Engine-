package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity57;
import com.vertexml.generated.repo.GenEntity57Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity57Service {
    private final GenEntity57Repository repo;
    public GenEntity57Service(GenEntity57Repository repo) { this.repo = repo; }
    
    public List<GenEntity57> getAll() { return repo.findAll(); }
    public GenEntity57 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity57 create(GenEntity57 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity57 update(UUID id, GenEntity57 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity57> all = repo.findAll();
        for(GenEntity57 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
