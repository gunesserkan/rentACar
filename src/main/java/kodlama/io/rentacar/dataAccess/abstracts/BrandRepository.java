package kodlama.io.rentacar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentacar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	boolean existsByName(String name);
}
