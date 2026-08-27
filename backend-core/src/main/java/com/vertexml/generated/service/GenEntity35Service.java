package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity35;
import com.vertexml.generated.repo.GenEntity35Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity35Service {
    private final GenEntity35Repository repo;
    public GenEntity35Service(GenEntity35Repository repo) { this.repo = repo; }
    
    public List<GenEntity35> getAll() { return repo.findAll(); }
    public GenEntity35 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity35 create(GenEntity35 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity35 update(UUID id, GenEntity35 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity35> all = repo.findAll();
        for(GenEntity35 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
