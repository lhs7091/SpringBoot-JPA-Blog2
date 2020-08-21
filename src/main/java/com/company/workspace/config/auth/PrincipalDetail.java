package com.company.workspace.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import com.company.workspace.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import lombok.Getter;

// 1. spring security : login process
// 2. UserDetails object : make save in session
@Getter
public class PrincipalDetail implements UserDetails{

    private User user; // composition

    public PrincipalDetail(User user) {
        this.user = user;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // password expired check
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    // return role list of account
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collectors = new ArrayList<>();
//		collectors.add(new GrantedAuthority() {
//
//			@Override
//			public String getAuthority() {
//				return "ROLE_"+user.getRole();
//			}
//
//		});

        collectors.add(()->{return "ROLE_"+user.getRole();});

        return collectors;
    }

}