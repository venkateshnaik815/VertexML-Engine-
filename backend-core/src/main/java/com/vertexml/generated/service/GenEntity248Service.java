package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity248;
import com.vertexml.generated.repo.GenEntity248Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity248Service {
    private final GenEntity248Repository repo;
    public GenEntity248Service(GenEntity248Repository repo) { this.repo = repo; }
    
    public List<GenEntity248> getAll() { return repo.findAll(); }
    public GenEntity248 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity248 create(GenEntity248 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity248 update(UUID id, GenEntity248 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity248> all = repo.findAll();
        for(GenEntity248 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
