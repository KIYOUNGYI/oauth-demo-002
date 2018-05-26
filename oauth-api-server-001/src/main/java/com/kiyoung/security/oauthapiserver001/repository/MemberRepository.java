package com.kiyoung.security.oauthapiserver001.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kiyoung.security.oauthapiserver001.domain.Member;

@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {}