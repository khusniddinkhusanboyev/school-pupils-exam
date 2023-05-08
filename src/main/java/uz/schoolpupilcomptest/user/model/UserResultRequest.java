package uz.schoolpupilcomptest.user.model;

import lombok.Data;

@Data
public class UserResultRequest {
    private Integer userId;
    private Integer correctAnswerCount;

}
