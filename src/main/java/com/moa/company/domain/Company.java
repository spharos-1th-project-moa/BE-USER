package com.moa.company.domain;


import com.moa.global.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)  // 기본 생성자의 접근 권한을 protected로 제한
@Table(name = "company")
public class Company extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "company_name", nullable = false)
	private String companyName;

	@Column(name = "company_email", nullable = true)
	private String companyEmail;

	@Column(name = "company_category", nullable = false)
	private CompanyCategory companyCategory;


	public Company(String companyName, CompanyCategory companyCategory) {
		this.companyName = companyName;
		this.companyCategory = companyCategory;
	}


	public Company(String companyName, String companyEmail, CompanyCategory companyCategory) {
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyCategory = companyCategory;
	}

}
