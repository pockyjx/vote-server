package study.vote.vote.dto.req;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public class CreateVoteReqDto {
    @NotNull
    private String title;
    private String content;
    private List<String> options = new ArrayList<>();
    private int maxChoice;
    private boolean isOpen;
    private LocalDate expiration;
}
