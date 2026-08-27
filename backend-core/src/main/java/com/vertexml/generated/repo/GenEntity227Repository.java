package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity227;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity227Repository extends JpaRepository<GenEntity227, UUID> {
    List<GenEntity227> findByName(String name);
    List<GenEntity227> findByStatus(String status);
    List<GenEntity227> findByType(String type);
    List<GenEntity227> findByIsActiveTrue();
}
