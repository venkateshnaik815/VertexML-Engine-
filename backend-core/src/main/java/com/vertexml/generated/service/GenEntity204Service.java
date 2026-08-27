package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity204;
import com.vertexml.generated.repo.GenEntity204Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity204Service {
    private final GenEntity204Repository repo;
    public GenEntity204Service(GenEntity204Repository repo) { this.repo = repo; }
    
    public List<GenEntity204> getAll() { return repo.findAll(); }
    public GenEntity204 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity204 create(GenEntity204 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity204 update(UUID id, GenEntity204 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity204> all = repo.findAll();
        for(GenEntity204 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
