package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity258;
import com.vertexml.generated.repo.GenEntity258Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity258Service {
    private final GenEntity258Repository repo;
    public GenEntity258Service(GenEntity258Repository repo) { this.repo = repo; }
    
    public List<GenEntity258> getAll() { return repo.findAll(); }
    public GenEntity258 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity258 create(GenEntity258 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity258 update(UUID id, GenEntity258 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity258> all = repo.findAll();
        for(GenEntity258 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
