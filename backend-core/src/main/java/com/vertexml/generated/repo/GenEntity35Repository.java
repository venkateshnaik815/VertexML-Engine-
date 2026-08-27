package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity35;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity35Repository extends JpaRepository<GenEntity35, UUID> {
    List<GenEntity35> findByName(String name);
    List<GenEntity35> findByStatus(String status);
    List<GenEntity35> findByType(String type);
    List<GenEntity35> findByIsActiveTrue();
}
