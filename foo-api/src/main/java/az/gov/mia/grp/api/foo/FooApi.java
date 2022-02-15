package az.gov.mia.grp.api.foo;
 
import az.gov.mia.grp.foo.FooDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * https://vabiss.atlassian.net/browse/GA-147
 * 1. Foolar soraqçası.
 * İnput adı - Fooın adı - string, required, unique, long text.
 */

@Validated
@Tag(name = "FooApi", description = "Foolar API")
public interface FooApi {
    default FooApiDelegate getDelegate() {
        return new FooApiDelegate() {
        };
    }

    @Operation(summary = "Fooları məlumatları listelemek",
            description = "Get all Foos",
            tags = {"FooApi"})
    @GetMapping("")
    default ResponseEntity<?> getAll() {
        return getDelegate().getAll();
    }

    @Operation(summary = "Foo məlumatını qaytarmaq",
            description = "Get Foo by ID",
            tags = {"FooApi"})
    @GetMapping("/{id}")
    default ResponseEntity<?> show(@PathVariable Long id) {
        return getDelegate().show(id);
    }

    @Operation(summary = "Foo məlumatını elave etmek",
            description = "Add new Foo",
            tags = {"FooApi"})
    @PostMapping(value = "", consumes = {"application/json"})
    default ResponseEntity<?> add(@Valid @RequestBody FooDTO dto) {
        return getDelegate().add(dto);
    }

    @Operation(summary = "Foo məlumatını yenilemek",
            description = "Update Foo by ID",
            operationId = "updateFooApi",
            tags = {"FooApi"})
    @PutMapping(value = "/{id}", consumes = {"application/json"})
    default ResponseEntity<?> update(
            @PathVariable(value = "id") Long id,
            @Valid @RequestBody FooDTO dto) {
    return getDelegate().update(id, dto);
    }

    @Operation(summary = "Foo məlumatını silmek",
            description = "Delete Foo by ID",
            tags = {"FooApi"})
    @DeleteMapping(value = "/{id}")
    default ResponseEntity<?> delete(@PathVariable("id") Long id) {
        return getDelegate().delete(id);
    }
}