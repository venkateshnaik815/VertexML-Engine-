package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity227;
import com.vertexml.generated.repo.GenEntity227Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity227Service {
    private final GenEntity227Repository repo;
    public GenEntity227Service(GenEntity227Repository repo) { this.repo = repo; }
    
    public List<GenEntity227> getAll() { return repo.findAll(); }
    public GenEntity227 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity227 create(GenEntity227 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity227 update(UUID id, GenEntity227 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity227> all = repo.findAll();
        for(GenEntity227 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
