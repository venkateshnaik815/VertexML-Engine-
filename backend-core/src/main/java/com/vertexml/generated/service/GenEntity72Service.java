package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity72;
import com.vertexml.generated.repo.GenEntity72Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity72Service {
    private final GenEntity72Repository repo;
    public GenEntity72Service(GenEntity72Repository repo) { this.repo = repo; }
    
    public List<GenEntity72> getAll() { return repo.findAll(); }
    public GenEntity72 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity72 create(GenEntity72 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity72 update(UUID id, GenEntity72 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity72> all = repo.findAll();
        for(GenEntity72 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
