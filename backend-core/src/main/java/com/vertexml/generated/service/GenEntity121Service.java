package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity121;
import com.vertexml.generated.repo.GenEntity121Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity121Service {
    private final GenEntity121Repository repo;
    public GenEntity121Service(GenEntity121Repository repo) { this.repo = repo; }
    
    public List<GenEntity121> getAll() { return repo.findAll(); }
    public GenEntity121 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity121 create(GenEntity121 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity121 update(UUID id, GenEntity121 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity121> all = repo.findAll();
        for(GenEntity121 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
