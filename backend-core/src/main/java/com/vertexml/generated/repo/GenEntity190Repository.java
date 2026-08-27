package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity190;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity190Repository extends JpaRepository<GenEntity190, UUID> {
    List<GenEntity190> findByName(String name);
    List<GenEntity190> findByStatus(String status);
    List<GenEntity190> findByType(String type);
    List<GenEntity190> findByIsActiveTrue();
}
