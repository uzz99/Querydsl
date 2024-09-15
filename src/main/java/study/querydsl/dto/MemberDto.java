package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {

    private String username;
    private int age;

    @QueryProjection
    //Q파일 dto 생성 어노테이션
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }

}
