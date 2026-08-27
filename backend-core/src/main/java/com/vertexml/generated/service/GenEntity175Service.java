package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity175;
import com.vertexml.generated.repo.GenEntity175Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity175Service {
    private final GenEntity175Repository repo;
    public GenEntity175Service(GenEntity175Repository repo) { this.repo = repo; }
    
    public List<GenEntity175> getAll() { return repo.findAll(); }
    public GenEntity175 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity175 create(GenEntity175 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity175 update(UUID id, GenEntity175 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity175> all = repo.findAll();
        for(GenEntity175 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
