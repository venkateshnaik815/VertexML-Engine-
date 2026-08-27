package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity134;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity134Repository extends JpaRepository<EnterpriseBillingEntity134, UUID> {
    List<EnterpriseBillingEntity134> findByName(String name);
    List<EnterpriseBillingEntity134> findByStatus(String status);
    List<EnterpriseBillingEntity134> findByType(String type);
    List<EnterpriseBillingEntity134> findByIsActiveTrue();
}
