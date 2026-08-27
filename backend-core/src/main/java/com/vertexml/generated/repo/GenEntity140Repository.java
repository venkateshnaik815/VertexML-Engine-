package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity140;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity140Repository extends JpaRepository<GenEntity140, UUID> {
    List<GenEntity140> findByName(String name);
    List<GenEntity140> findByStatus(String status);
    List<GenEntity140> findByType(String type);
    List<GenEntity140> findByIsActiveTrue();
}
