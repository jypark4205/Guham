package devDevilz.Guham.Entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue
    private Long userId;
    private String userName;
    private String userNickname;
    private String userPw;
    private String userPwConfirm;
    private String userGender;
    private String userImage;
    private String userProfile;
    private String userEmail;
    private String userAdminmemo;
    private String userPhone;
    private String userPhoneAuthNum;
    private String userAddressSi;
    private String userAddressGu;
    private String userAddressDong;
    private String userZipcode;
    private String latitude;
    private String longitude;
    private String userBirth;
    private String userType;
    @CreationTimestamp
    private Date userRegDate;
}
