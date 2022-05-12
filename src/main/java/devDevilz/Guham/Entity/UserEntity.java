package devDevilz.Guham.entity;

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
    private Long id;
    private String name;
    private String nickname;
    private String password;
    private String passwordConfirm;
    private String enabled;
    private String gender;
    private String image;
    private String profile;
    private String email;
    private String adminmemo;
    private String phone;
    private String phoneAuthNum;
    private String addressSi;
    private String addressGu;
    private String addressDong;
    private String zipcode;
    private String latitude;
    private String longitude;
    private String birth;
    private String type;
    @CreationTimestamp
    private Date regDate;
}
