package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity12;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity12Repository extends JpaRepository<GenEntity12, UUID> {
    List<GenEntity12> findByName(String name);
    List<GenEntity12> findByStatus(String status);
    List<GenEntity12> findByType(String type);
    List<GenEntity12> findByIsActiveTrue();
}
