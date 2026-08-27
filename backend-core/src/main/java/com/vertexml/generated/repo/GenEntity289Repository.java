package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity289;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity289Repository extends JpaRepository<GenEntity289, UUID> {
    List<GenEntity289> findByName(String name);
    List<GenEntity289> findByStatus(String status);
    List<GenEntity289> findByType(String type);
    List<GenEntity289> findByIsActiveTrue();
}
