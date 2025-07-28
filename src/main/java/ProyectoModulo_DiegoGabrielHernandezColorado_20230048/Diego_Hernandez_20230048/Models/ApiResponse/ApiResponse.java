package ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Models.ApiResponse;

import lombok.Data;

@Data
public class ApiResponse <t>{
    private final t data;
    private String status;
    private t Data;
    private String message;

    public ApiResponse(String status, t data){
        this.status = status;
        this.data = data;
    }

    public ApiResponse(t data, String status, String message){
        this.data = data;
        this.status = status;
        this.message = message;
    }
}
