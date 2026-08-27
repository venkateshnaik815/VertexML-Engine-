package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity143;
import com.vertexml.generated.repo.GenEntity143Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity143Service {
    private final GenEntity143Repository repo;
    public GenEntity143Service(GenEntity143Repository repo) { this.repo = repo; }
    
    public List<GenEntity143> getAll() { return repo.findAll(); }
    public GenEntity143 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity143 create(GenEntity143 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity143 update(UUID id, GenEntity143 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity143> all = repo.findAll();
        for(GenEntity143 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
