package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity241;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity241Repository extends JpaRepository<GenEntity241, UUID> {
    List<GenEntity241> findByName(String name);
    List<GenEntity241> findByStatus(String status);
    List<GenEntity241> findByType(String type);
    List<GenEntity241> findByIsActiveTrue();
}
