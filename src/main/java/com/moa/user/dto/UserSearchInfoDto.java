package com.moa.user.dto;


import lombok.*;

import java.util.UUID;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSearchInfoDto {

	private UUID userUuid;
	private String nickname;
	private String profileImageUrl;

}
