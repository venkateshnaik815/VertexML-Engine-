package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity175;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity175Repository extends JpaRepository<GenEntity175, UUID> {
    List<GenEntity175> findByName(String name);
    List<GenEntity175> findByStatus(String status);
    List<GenEntity175> findByType(String type);
    List<GenEntity175> findByIsActiveTrue();
}
