package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity19;
import com.vertexml.generated.repo.GenEntity19Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity19Service {
    private final GenEntity19Repository repo;
    public GenEntity19Service(GenEntity19Repository repo) { this.repo = repo; }
    
    public List<GenEntity19> getAll() { return repo.findAll(); }
    public GenEntity19 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity19 create(GenEntity19 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity19 update(UUID id, GenEntity19 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity19> all = repo.findAll();
        for(GenEntity19 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
