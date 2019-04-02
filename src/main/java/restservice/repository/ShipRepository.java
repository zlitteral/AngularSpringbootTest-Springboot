package restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import restservice.entity.Shipwreck;

//@RepositoryRestResource(path = "/shipwrecks" )
public interface ShipRepository extends JpaRepository<Shipwreck, Integer> {
}
