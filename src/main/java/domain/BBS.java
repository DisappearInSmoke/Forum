package domain;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class BBS {
    private Integer bssId;
    private String bbsName;
    private String bbsPassword;
    private LocalDate bbsBirthday;
    private String bbsEmail;

    @Override
    public String toString() {
        return "BBS{" +
                "bssId=" + bssId +
                ", bbsName='" + bbsName + '\'' +
                ", bbsPassword='" + bbsPassword + '\'' +
                ", bbsBirthday=" + bbsBirthday +
                ", bbsEmail='" + bbsEmail + '\'' +
                '}';
    }

    public int getBssId() {
        return bssId;
    }

    public void setBssId(int bssId) {
        this.bssId = bssId;
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

    public BBS(int bssId, String bbsName, String bbsPassword, LocalDate bbsBirthday, String bbsEmail) {
        this.bssId = bssId;
        this.bbsName = bbsName;
        this.bbsPassword = bbsPassword;
        this.bbsBirthday = bbsBirthday;
        this.bbsEmail = bbsEmail;
    }

    public BBS() {
    }
}