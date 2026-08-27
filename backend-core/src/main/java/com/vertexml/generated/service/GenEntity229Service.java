package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity229;
import com.vertexml.generated.repo.GenEntity229Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity229Service {
    private final GenEntity229Repository repo;
    public GenEntity229Service(GenEntity229Repository repo) { this.repo = repo; }
    
    public List<GenEntity229> getAll() { return repo.findAll(); }
    public GenEntity229 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity229 create(GenEntity229 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity229 update(UUID id, GenEntity229 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity229> all = repo.findAll();
        for(GenEntity229 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
