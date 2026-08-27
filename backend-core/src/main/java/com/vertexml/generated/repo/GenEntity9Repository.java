package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity9;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity9Repository extends JpaRepository<GenEntity9, UUID> {
    List<GenEntity9> findByName(String name);
    List<GenEntity9> findByStatus(String status);
    List<GenEntity9> findByType(String type);
    List<GenEntity9> findByIsActiveTrue();
}
