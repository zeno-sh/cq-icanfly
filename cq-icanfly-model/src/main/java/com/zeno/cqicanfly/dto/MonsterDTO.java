package com.zeno.cqicanfly.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MonsterDTO implements Serializable {
    private Integer monsterId;
    private String monsterName;
    private Integer dropGroupId;
}
