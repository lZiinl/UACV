package uacv.backend.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uacv.backend.member.domain.MemberRole;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupDto {
    //== 회원 가입시 사용하는 DTO ==//
    private String username;
    private String password1;
    private String password2;
    private MemberRole memberRole;
    private String rnk;
    private String m_id;
}
