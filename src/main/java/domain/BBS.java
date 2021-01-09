package domain;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class BBS {
    private String bbsName;
    private String bbsPassword;
    private LocalDate bbsBirthday;
    private String bbsEmail;
    private String bbs_cookie;

    @Override
    public String toString() {
        return "BBS{" +
                "bbsName='" + bbsName + '\'' +
                ", bbsPassword='" + bbsPassword + '\'' +
                ", bbsBirthday=" + bbsBirthday +
                ", bbsEmail='" + bbsEmail + '\'' +
                ", bbs_cookie='" + bbs_cookie + '\'' +
                '}';
    }

    public String getBbsName() {
        return bbsName;
    }

    public void setBbsName(String bbsName) {
        this.bbsName = bbsName;
    }

    public String getBbsPassword() {
        return bbsPassword;
    }

    public void setBbsPassword(String bbsPassword) {
        this.bbsPassword = bbsPassword;
    }

    public LocalDate getBbsBirthday() {
        return bbsBirthday;
    }

    public void setBbsBirthday(LocalDate bbsBirthday) {
        this.bbsBirthday = bbsBirthday;
    }

    public String getBbsEmail() {
        return bbsEmail;
    }

    public void setBbsEmail(String bbsEmail) {
        this.bbsEmail = bbsEmail;
    }

    public String getBbs_cookie() {
        return bbs_cookie;
    }

    public void setBbs_cookie(String bbs_cookie) {
        this.bbs_cookie = bbs_cookie;
    }

    public BBS(String bbsName, String bbsPassword, LocalDate bbsBirthday, String bbsEmail, String bbs_cookie) {
        this.bbsName = bbsName;
        this.bbsPassword = bbsPassword;
        this.bbsBirthday = bbsBirthday;
        this.bbsEmail = bbsEmail;
        this.bbs_cookie = bbs_cookie;
    }

    public BBS() {
    }
}