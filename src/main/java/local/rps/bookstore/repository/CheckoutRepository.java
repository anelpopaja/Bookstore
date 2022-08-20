package local.rps.bookstore.repository;

import local.rps.bookstore.model.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<Checkout, Integer> {
}
