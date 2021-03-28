package com.jellyb3ar.book.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
    @CreatedDate // Entity가 생성되서 저장될 때 자동으로 저장
    private LocalDateTime createdDate;

    @LastModifiedDate // Entity가 변경될 때 자동으로 저장
    private LocalDateTime modifiedDate;
}
