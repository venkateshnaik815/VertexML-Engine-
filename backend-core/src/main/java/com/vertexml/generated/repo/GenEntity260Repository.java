package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity260;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity260Repository extends JpaRepository<GenEntity260, UUID> {
    List<GenEntity260> findByName(String name);
    List<GenEntity260> findByStatus(String status);
    List<GenEntity260> findByType(String type);
    List<GenEntity260> findByIsActiveTrue();
}
