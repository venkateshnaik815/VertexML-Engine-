package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity170;
import com.vertexml.generated.repo.GenEntity170Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity170Service {
    private final GenEntity170Repository repo;
    public GenEntity170Service(GenEntity170Repository repo) { this.repo = repo; }
    
    public List<GenEntity170> getAll() { return repo.findAll(); }
    public GenEntity170 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity170 create(GenEntity170 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity170 update(UUID id, GenEntity170 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity170> all = repo.findAll();
        for(GenEntity170 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
