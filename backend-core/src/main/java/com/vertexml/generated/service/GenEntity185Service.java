package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity185;
import com.vertexml.generated.repo.GenEntity185Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity185Service {
    private final GenEntity185Repository repo;
    public GenEntity185Service(GenEntity185Repository repo) { this.repo = repo; }
    
    public List<GenEntity185> getAll() { return repo.findAll(); }
    public GenEntity185 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity185 create(GenEntity185 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity185 update(UUID id, GenEntity185 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity185> all = repo.findAll();
        for(GenEntity185 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
