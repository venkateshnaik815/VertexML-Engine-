package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity233;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity233Repository extends JpaRepository<GenEntity233, UUID> {
    List<GenEntity233> findByName(String name);
    List<GenEntity233> findByStatus(String status);
    List<GenEntity233> findByType(String type);
    List<GenEntity233> findByIsActiveTrue();
}
