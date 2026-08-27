package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity142;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity142Repository extends JpaRepository<GenEntity142, UUID> {
    List<GenEntity142> findByName(String name);
    List<GenEntity142> findByStatus(String status);
    List<GenEntity142> findByType(String type);
    List<GenEntity142> findByIsActiveTrue();
}
