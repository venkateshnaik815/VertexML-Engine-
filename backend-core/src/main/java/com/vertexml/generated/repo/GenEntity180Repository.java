package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity180;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity180Repository extends JpaRepository<GenEntity180, UUID> {
    List<GenEntity180> findByName(String name);
    List<GenEntity180> findByStatus(String status);
    List<GenEntity180> findByType(String type);
    List<GenEntity180> findByIsActiveTrue();
}
