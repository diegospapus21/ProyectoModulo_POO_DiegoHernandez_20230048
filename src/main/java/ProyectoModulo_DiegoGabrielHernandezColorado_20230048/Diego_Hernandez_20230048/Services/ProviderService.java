package ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Services;

import ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Entities.ProveedorEntity;
import ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Exceptions.ExceptionProveedor;
import ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Models.DTO.ProveedorDTO;
import ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProviderService {
    @Autowired
    private ProveedorRepository providerRepository;

    public List<ProveedorDTO> getAllProviders() {
        List<ProveedorEntity> providers = providerRepository.findAll();
        return providers.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }



    public void deleteProvider(Long id) {
        if (!providerRepository.existsById(id)) {
            throw new ExceptionProveedor("Proveedor no encontrado con ID: " + id);
        }
        providerRepository.deleteById(id);
    }

    private ProveedorDTO convertToDTO(ProveedorEntity provider) {
        ProveedorDTO dto = new ProveedorDTO();
        dto.setProviderId(provider.getProviderID());
        dto.setProviderName(provider.getProviderName());
        dto.setProviderPhone(provider.getProviderPhone());
        dto.setProviderAddress(provider.getProviderAddress());
        dto.setProviderEmail(provider.getProviderEmail());
        dto.setProviderCode(provider.getProviderCode());
        dto.setProviderStatus(provider.getProviderStatus());
        dto.setProviderComments(provider.getProviderComments());
        return dto;
    }

    private ProveedorEntity convertToEntity(ProveedorDTO dto) {
        ProveedorEntity provider = new ProveedorEntity();
        provider.setProviderName(dto.getProviderName());
        provider.setProviderPhone(dto.getProviderPhone());
        provider.setProviderAddress(dto.getProviderAddress());
        provider.setProviderEmail(dto.getProviderEmail());
        provider.setProviderCode(dto.getProviderCode());
        provider.setProviderStatus(dto.getProviderStatus());
        provider.setProviderComments(dto.getProviderComments());
        return provider;
    }
}