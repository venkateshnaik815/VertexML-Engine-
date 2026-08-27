package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity42;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity42Repository extends JpaRepository<GenEntity42, UUID> {
    List<GenEntity42> findByName(String name);
    List<GenEntity42> findByStatus(String status);
    List<GenEntity42> findByType(String type);
    List<GenEntity42> findByIsActiveTrue();
}
