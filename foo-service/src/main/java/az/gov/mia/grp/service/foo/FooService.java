package az.gov.mia.grp.service.foo;

import az.gov.mia.grp.api.foo.FooApiDelegate;
import az.gov.mia.grp.foo.FooDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FooService implements FooApiDelegate {
    @Override
    public ResponseEntity<?> add(FooDTO dto) {
        return FooApiDelegate.super.add(dto);
    }

    @Override
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok("Foo All");
    }

    @Override
    public ResponseEntity<FooDTO> show(long id) {
        return FooApiDelegate.super.show(id);
    }

    @Override
    public ResponseEntity<?> update(long id, FooDTO dto) {
        return FooApiDelegate.super.update(id, dto);
    }

    @Override
    public ResponseEntity<?> delete(long id) {
        return FooApiDelegate.super.delete(id);
    }
}
