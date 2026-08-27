package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity38;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity38Repository extends JpaRepository<GenEntity38, UUID> {
    List<GenEntity38> findByName(String name);
    List<GenEntity38> findByStatus(String status);
    List<GenEntity38> findByType(String type);
    List<GenEntity38> findByIsActiveTrue();
}
