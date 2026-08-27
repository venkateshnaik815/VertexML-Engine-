package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity294;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity294Repository extends JpaRepository<GenEntity294, UUID> {
    List<GenEntity294> findByName(String name);
    List<GenEntity294> findByStatus(String status);
    List<GenEntity294> findByType(String type);
    List<GenEntity294> findByIsActiveTrue();
}
