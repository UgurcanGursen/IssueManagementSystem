package com.ugurcangursen.issuemanagement.service;



import org.springframework.data.domain.Pageable;
import com.ugurcangursen.issuemanagement.dto.UserDto;
import com.ugurcangursen.issuemanagement.util.TPage;

public interface UserService {
	
	 UserDto save(UserDto user);

	    UserDto getById(Long id);

	    TPage<UserDto> getAllPageable(Pageable pageable);

	    UserDto getByUsername(String username);

}
