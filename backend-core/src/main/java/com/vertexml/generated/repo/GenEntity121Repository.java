package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity121;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity121Repository extends JpaRepository<GenEntity121, UUID> {
    List<GenEntity121> findByName(String name);
    List<GenEntity121> findByStatus(String status);
    List<GenEntity121> findByType(String type);
    List<GenEntity121> findByIsActiveTrue();
}
