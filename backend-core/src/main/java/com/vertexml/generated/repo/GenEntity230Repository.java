package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity230;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity230Repository extends JpaRepository<GenEntity230, UUID> {
    List<GenEntity230> findByName(String name);
    List<GenEntity230> findByStatus(String status);
    List<GenEntity230> findByType(String type);
    List<GenEntity230> findByIsActiveTrue();
}
