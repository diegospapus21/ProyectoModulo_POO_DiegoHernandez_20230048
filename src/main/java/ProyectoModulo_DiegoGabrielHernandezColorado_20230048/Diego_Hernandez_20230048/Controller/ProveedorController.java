package ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Controller;

import ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Exceptions.ExceptionProveedor;
import ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Models.ApiResponse.ApiResponse;
import ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Models.DTO.ProveedorDTO;
import ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/proveedores")
public class ProveedorController {
    @Autowired
    private ProviderService providerService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<ProveedorDTO>>> getAllProviders() {
        List<ProveedorDTO> providers = providerService.getAllProviders();
        return ResponseEntity.ok(new ApiResponse<>("success", providers));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> deleteProvider(@PathVariable Long id) {
        try {
            providerService.deleteProvider(id);
            return ResponseEntity.ok(new ApiResponse<>("success", "Proveedor eliminado correctamente"));
        } catch (ExceptionProveedor e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ApiResponse<>("error", e.getMessage()));
        }
    }
}
