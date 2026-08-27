package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity254;
import com.vertexml.generated.repo.GenEntity254Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity254Service {
    private final GenEntity254Repository repo;
    public GenEntity254Service(GenEntity254Repository repo) { this.repo = repo; }
    
    public List<GenEntity254> getAll() { return repo.findAll(); }
    public GenEntity254 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity254 create(GenEntity254 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity254 update(UUID id, GenEntity254 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity254> all = repo.findAll();
        for(GenEntity254 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
