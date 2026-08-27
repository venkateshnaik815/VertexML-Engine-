package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity289;
import com.vertexml.generated.repo.GenEntity289Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity289Service {
    private final GenEntity289Repository repo;
    public GenEntity289Service(GenEntity289Repository repo) { this.repo = repo; }
    
    public List<GenEntity289> getAll() { return repo.findAll(); }
    public GenEntity289 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity289 create(GenEntity289 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity289 update(UUID id, GenEntity289 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity289> all = repo.findAll();
        for(GenEntity289 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
