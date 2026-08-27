package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity193;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity193Repository extends JpaRepository<GenEntity193, UUID> {
    List<GenEntity193> findByName(String name);
    List<GenEntity193> findByStatus(String status);
    List<GenEntity193> findByType(String type);
    List<GenEntity193> findByIsActiveTrue();
}
