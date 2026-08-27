package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity117;
import com.vertexml.generated.repo.GenEntity117Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity117Service {
    private final GenEntity117Repository repo;
    public GenEntity117Service(GenEntity117Repository repo) { this.repo = repo; }
    
    public List<GenEntity117> getAll() { return repo.findAll(); }
    public GenEntity117 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity117 create(GenEntity117 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity117 update(UUID id, GenEntity117 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity117> all = repo.findAll();
        for(GenEntity117 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
