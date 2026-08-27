package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity176;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity176Repository extends JpaRepository<GenEntity176, UUID> {
    List<GenEntity176> findByName(String name);
    List<GenEntity176> findByStatus(String status);
    List<GenEntity176> findByType(String type);
    List<GenEntity176> findByIsActiveTrue();
}
