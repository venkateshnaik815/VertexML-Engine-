package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity33;
import com.vertexml.generated.repo.GenEntity33Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity33Service {
    private final GenEntity33Repository repo;
    public GenEntity33Service(GenEntity33Repository repo) { this.repo = repo; }
    
    public List<GenEntity33> getAll() { return repo.findAll(); }
    public GenEntity33 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity33 create(GenEntity33 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity33 update(UUID id, GenEntity33 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity33> all = repo.findAll();
        for(GenEntity33 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
