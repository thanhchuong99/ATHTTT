package org.ATHTTT.sbshoppingcart.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import org.ATHTTT.sbshoppingcart.model.User;
import org.ATHTTT.sbshoppingcart.web.dto.UserRegistrationDto;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
