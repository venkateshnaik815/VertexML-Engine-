package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity168;
import com.vertexml.generated.repo.GenEntity168Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity168Service {
    private final GenEntity168Repository repo;
    public GenEntity168Service(GenEntity168Repository repo) { this.repo = repo; }
    
    public List<GenEntity168> getAll() { return repo.findAll(); }
    public GenEntity168 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity168 create(GenEntity168 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity168 update(UUID id, GenEntity168 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity168> all = repo.findAll();
        for(GenEntity168 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
