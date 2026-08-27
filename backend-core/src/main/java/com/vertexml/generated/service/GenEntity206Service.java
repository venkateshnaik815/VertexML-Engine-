package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity206;
import com.vertexml.generated.repo.GenEntity206Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity206Service {
    private final GenEntity206Repository repo;
    public GenEntity206Service(GenEntity206Repository repo) { this.repo = repo; }
    
    public List<GenEntity206> getAll() { return repo.findAll(); }
    public GenEntity206 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity206 create(GenEntity206 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity206 update(UUID id, GenEntity206 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity206> all = repo.findAll();
        for(GenEntity206 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
