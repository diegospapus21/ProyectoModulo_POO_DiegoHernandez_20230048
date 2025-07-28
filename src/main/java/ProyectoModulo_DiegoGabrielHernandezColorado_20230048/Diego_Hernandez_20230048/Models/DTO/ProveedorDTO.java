package ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Models.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @EqualsAndHashCode
@Getter @Setter
public class ProveedorDTO {

    private Long ProviderId;

    @NotBlank(message = "El nombre es obligatorio")
    private String  ProviderName;

    @NotBlank(message = "El telefono es obligatorio")
    private String ProviderPhone;

    @NotBlank(message = "La dirrecion es obligaoria")
    private String ProviderAddress;

    @Email(message = "Debe ser un correo valido")
    private String ProviderEmail;

    
    private String ProviderCode;

    private String ProviderStatus;

    private String ProviderComments;
}
