package com.rob.devoloperops.backend.persistence.domain.backend;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by obiero on 31/03/2016.
 */
public class Authority implements GrantedAuthority {

    private final String authority;

    public Authority(String authority) {

        this.authority = authority;
    }


    @Override
    public String getAuthority() {
        return authority;
    }
}