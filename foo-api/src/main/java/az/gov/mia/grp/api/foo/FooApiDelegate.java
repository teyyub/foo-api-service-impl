package az.gov.mia.grp.api.foo;


import az.gov.mia.grp.foo.FooDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FooApiDelegate {
    default ResponseEntity<?> add(FooDTO dto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    default ResponseEntity<?> getAll() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    default ResponseEntity<FooDTO> show(long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    default ResponseEntity<?> update(long id, FooDTO dto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    default ResponseEntity<?> delete(long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}