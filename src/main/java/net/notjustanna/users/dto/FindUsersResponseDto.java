package net.notjustanna.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.notjustanna.users.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FindUsersResponseDto {
    private List<UserResponseDto> users;
    private boolean hasNext;
    private boolean hasPrevious;
    private int totalPages;
    private int pageNumber;

    public FindUsersResponseDto(Page<User> page) {
        pageNumber = page.getNumber();
        users = page.stream().map(UserResponseDto::new).toList();
        hasNext = page.hasNext();
        hasPrevious = page.hasPrevious();
        totalPages = page.getTotalPages();
    }
}
