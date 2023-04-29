package uz.schoolpupilcomptest.security.util;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {
    @NotNull(message = "username is required")
    private String username;
    @NotNull(message = "password is required")
    private String password;
}
