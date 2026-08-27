package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity12;
import com.vertexml.generated.repo.GenEntity12Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity12Service {
    private final GenEntity12Repository repo;
    public GenEntity12Service(GenEntity12Repository repo) { this.repo = repo; }
    
    public List<GenEntity12> getAll() { return repo.findAll(); }
    public GenEntity12 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity12 create(GenEntity12 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity12 update(UUID id, GenEntity12 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity12> all = repo.findAll();
        for(GenEntity12 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
