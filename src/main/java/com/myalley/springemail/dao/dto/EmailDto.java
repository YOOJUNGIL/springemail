package com.myalley.springemail.dao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailDto {
    private String address;
    private String title;
    private String message;
    private MultipartFile file;
}
