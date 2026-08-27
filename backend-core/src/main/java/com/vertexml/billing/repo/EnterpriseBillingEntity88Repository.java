package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity88;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity88Repository extends JpaRepository<EnterpriseBillingEntity88, UUID> {
    List<EnterpriseBillingEntity88> findByName(String name);
    List<EnterpriseBillingEntity88> findByStatus(String status);
    List<EnterpriseBillingEntity88> findByType(String type);
    List<EnterpriseBillingEntity88> findByIsActiveTrue();
}
