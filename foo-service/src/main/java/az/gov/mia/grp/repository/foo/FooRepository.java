package az.gov.mia.grp.repository.foo;

import az.gov.mia.grp.entity.foo.FooEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FooRepository extends JpaRepository<FooEntity, Long> {

}
