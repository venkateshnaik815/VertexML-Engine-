package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity132;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity132Repository extends JpaRepository<EnterpriseBillingEntity132, UUID> {
    List<EnterpriseBillingEntity132> findByName(String name);
    List<EnterpriseBillingEntity132> findByStatus(String status);
    List<EnterpriseBillingEntity132> findByType(String type);
    List<EnterpriseBillingEntity132> findByIsActiveTrue();
}
