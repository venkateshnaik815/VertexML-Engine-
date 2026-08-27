package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity4;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity4Repository extends JpaRepository<GenEntity4, UUID> {
    List<GenEntity4> findByName(String name);
    List<GenEntity4> findByStatus(String status);
    List<GenEntity4> findByType(String type);
    List<GenEntity4> findByIsActiveTrue();
}
