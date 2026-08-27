package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity56;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity56Repository extends JpaRepository<GenEntity56, UUID> {
    List<GenEntity56> findByName(String name);
    List<GenEntity56> findByStatus(String status);
    List<GenEntity56> findByType(String type);
    List<GenEntity56> findByIsActiveTrue();
}
