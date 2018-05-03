package com.rob.devoloperops.backend.persistence.domain.backend;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;



@Entity
public class PasswordResetToken  implements Serializable {


    private static final long serialVersionUID = 1L;
    private static final Logger LOG = LoggerFactory.getLogger(PasswordResetToken.class);

    private final static int DEFAULT_TOKEN_LENGTH_IN_MINUTES = 120;



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private String token;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;


    @Column(name = "expiry_date")
    private Date expiryDate;


    public PasswordResetToken() {

    }


    /**
     * Full constructor.
     * @param token The user token. It must not be null.
     * @param user The user for which the token should be created It must not be null.
     * @param creationDateTime The date time when this request was created. It must not be null.
     * @param expirationInMinutes The length, in minutes, for which this token will be valid. If zero, it will be
     *                            assigned a default value of 120 (2 hours)
     * @throws IllegalArgumentException If the token, user or creation date time are null
     */
    public PasswordResetToken(String token, User user, Date creationDateTime, int expirationInMinutes) {
        if ((null == token) || (null == user) || (null == creationDateTime)) {
            throw new IllegalArgumentException("token, user and creation date time can't be null");
        }
        if (expirationInMinutes == 0) {
            LOG.warn("The token expiration length in minutes is zero. Assigning the default value {} ", DEFAULT_TOKEN_LENGTH_IN_MINUTES);
            expirationInMinutes = DEFAULT_TOKEN_LENGTH_IN_MINUTES;
        }
        this.token = token;
        this.user = user;
        creationDateTime.setTime(expirationInMinutes);
        expiryDate = creationDateTime;
    }


}
