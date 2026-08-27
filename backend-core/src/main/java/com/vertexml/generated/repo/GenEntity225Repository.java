package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity225;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity225Repository extends JpaRepository<GenEntity225, UUID> {
    List<GenEntity225> findByName(String name);
    List<GenEntity225> findByStatus(String status);
    List<GenEntity225> findByType(String type);
    List<GenEntity225> findByIsActiveTrue();
}
