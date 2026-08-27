package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity204;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity204Repository extends JpaRepository<GenEntity204, UUID> {
    List<GenEntity204> findByName(String name);
    List<GenEntity204> findByStatus(String status);
    List<GenEntity204> findByType(String type);
    List<GenEntity204> findByIsActiveTrue();
}
