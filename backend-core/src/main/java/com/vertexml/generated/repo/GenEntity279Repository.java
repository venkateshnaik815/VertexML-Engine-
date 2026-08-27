package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity279;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity279Repository extends JpaRepository<GenEntity279, UUID> {
    List<GenEntity279> findByName(String name);
    List<GenEntity279> findByStatus(String status);
    List<GenEntity279> findByType(String type);
    List<GenEntity279> findByIsActiveTrue();
}
