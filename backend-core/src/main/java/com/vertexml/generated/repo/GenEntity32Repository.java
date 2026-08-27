package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity32;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity32Repository extends JpaRepository<GenEntity32, UUID> {
    List<GenEntity32> findByName(String name);
    List<GenEntity32> findByStatus(String status);
    List<GenEntity32> findByType(String type);
    List<GenEntity32> findByIsActiveTrue();
}
