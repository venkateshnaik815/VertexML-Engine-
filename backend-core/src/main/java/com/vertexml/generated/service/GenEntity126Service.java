package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity126;
import com.vertexml.generated.repo.GenEntity126Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity126Service {
    private final GenEntity126Repository repo;
    public GenEntity126Service(GenEntity126Repository repo) { this.repo = repo; }
    
    public List<GenEntity126> getAll() { return repo.findAll(); }
    public GenEntity126 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity126 create(GenEntity126 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity126 update(UUID id, GenEntity126 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity126> all = repo.findAll();
        for(GenEntity126 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
