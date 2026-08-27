package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity206;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity206Repository extends JpaRepository<GenEntity206, UUID> {
    List<GenEntity206> findByName(String name);
    List<GenEntity206> findByStatus(String status);
    List<GenEntity206> findByType(String type);
    List<GenEntity206> findByIsActiveTrue();
}
