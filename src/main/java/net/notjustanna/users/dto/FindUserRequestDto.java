package net.notjustanna.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.notjustanna.users.model.UserProfile;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FindUserRequestDto {
    private String id;
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private UserProfile perfil;
}
