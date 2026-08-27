package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity251;
import com.vertexml.generated.repo.GenEntity251Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity251Service {
    private final GenEntity251Repository repo;
    public GenEntity251Service(GenEntity251Repository repo) { this.repo = repo; }
    
    public List<GenEntity251> getAll() { return repo.findAll(); }
    public GenEntity251 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity251 create(GenEntity251 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity251 update(UUID id, GenEntity251 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity251> all = repo.findAll();
        for(GenEntity251 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
