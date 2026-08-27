package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity256;
import com.vertexml.generated.repo.GenEntity256Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity256Service {
    private final GenEntity256Repository repo;
    public GenEntity256Service(GenEntity256Repository repo) { this.repo = repo; }
    
    public List<GenEntity256> getAll() { return repo.findAll(); }
    public GenEntity256 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity256 create(GenEntity256 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity256 update(UUID id, GenEntity256 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity256> all = repo.findAll();
        for(GenEntity256 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
