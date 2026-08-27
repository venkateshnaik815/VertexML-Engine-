package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity164;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity164Repository extends JpaRepository<GenEntity164, UUID> {
    List<GenEntity164> findByName(String name);
    List<GenEntity164> findByStatus(String status);
    List<GenEntity164> findByType(String type);
    List<GenEntity164> findByIsActiveTrue();
}
