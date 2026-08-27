package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity26;
import com.vertexml.generated.repo.GenEntity26Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity26Service {
    private final GenEntity26Repository repo;
    public GenEntity26Service(GenEntity26Repository repo) { this.repo = repo; }
    
    public List<GenEntity26> getAll() { return repo.findAll(); }
    public GenEntity26 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity26 create(GenEntity26 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity26 update(UUID id, GenEntity26 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity26> all = repo.findAll();
        for(GenEntity26 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
