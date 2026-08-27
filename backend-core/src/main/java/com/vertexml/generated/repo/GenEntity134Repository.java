package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity134;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity134Repository extends JpaRepository<GenEntity134, UUID> {
    List<GenEntity134> findByName(String name);
    List<GenEntity134> findByStatus(String status);
    List<GenEntity134> findByType(String type);
    List<GenEntity134> findByIsActiveTrue();
}
