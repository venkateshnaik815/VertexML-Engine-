package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity32;
import com.vertexml.generated.repo.GenEntity32Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity32Service {
    private final GenEntity32Repository repo;
    public GenEntity32Service(GenEntity32Repository repo) { this.repo = repo; }
    
    public List<GenEntity32> getAll() { return repo.findAll(); }
    public GenEntity32 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity32 create(GenEntity32 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity32 update(UUID id, GenEntity32 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity32> all = repo.findAll();
        for(GenEntity32 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
