package com.spring2go.bookmarker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Data
@Accessors(chain = true)
public class UserDto {
    private String id;
    @NotBlank(message = "名字不能为空")
    private String name;
    @NotBlank(message = "电子邮件地址不能为空")
    @Email(message = "电子邮件地址无效")
    private String email;
    //private String password;
    private Set<String> roleNames = new HashSet<>();
}
