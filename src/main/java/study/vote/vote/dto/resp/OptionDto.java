package study.vote.vote.dto.resp;

import lombok.Getter;
import study.vote.vote.entity.OptionList;

@Getter
public class OptionDto {
    private Long no;
    private String value;
    private int count;

    public OptionDto(OptionList option) {
        this.no = option.getNo();
        this.value = option.getValue();
        this.count = option.getCount();
    }
}
