package com.ua.sutty.springboot.transfer;

import com.ua.sutty.springboot.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String username;

    public static UserDTO from(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .username(user.getUsername())
                .build();
    }

    public static List<UserDTO> from(List<User> users) {
        return users.stream().map(UserDTO::from).collect(Collectors.toList());
    }

}
