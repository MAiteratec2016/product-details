package product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductDetailsRepository extends CrudRepository<ProductDetails, Long> {
	
	List<ProductDetails> findByName(@Param("name") String name);
}
