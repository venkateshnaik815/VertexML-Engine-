package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity153;
import com.vertexml.generated.repo.GenEntity153Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity153Service {
    private final GenEntity153Repository repo;
    public GenEntity153Service(GenEntity153Repository repo) { this.repo = repo; }
    
    public List<GenEntity153> getAll() { return repo.findAll(); }
    public GenEntity153 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity153 create(GenEntity153 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity153 update(UUID id, GenEntity153 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity153> all = repo.findAll();
        for(GenEntity153 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
