package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity138;
import com.vertexml.generated.repo.GenEntity138Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity138Service {
    private final GenEntity138Repository repo;
    public GenEntity138Service(GenEntity138Repository repo) { this.repo = repo; }
    
    public List<GenEntity138> getAll() { return repo.findAll(); }
    public GenEntity138 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity138 create(GenEntity138 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity138 update(UUID id, GenEntity138 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity138> all = repo.findAll();
        for(GenEntity138 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
