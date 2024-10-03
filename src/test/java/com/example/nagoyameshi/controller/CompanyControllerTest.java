package com.example.nagoyameshi.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class CompanyControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void 未ログインの場合は会員用の会社概要ページが正しく表示される() throws Exception {
        mockMvc.perform(get("/company"))
               .andExpect(status().isOk())
               .andExpect(view().name("company/index"));
    }

    @Test
    @WithUserDetails("taro.samurai@example.com")
    public void 一般ユーザーとしてログイン済みの場合は会員用の会社概要ページが正しく表示される() throws Exception {
        mockMvc.perform(get("/company"))
               .andExpect(status().isOk())
               .andExpect(view().name("company/index"));
    }

    @Test
    @WithUserDetails("hanako.samurai@example.com")
    public void 管理者としてログイン済みの場合は会員用の会社概要ページが表示されずに403エラーが発生する() throws Exception {
        mockMvc.perform(get("/company"))
               .andExpect(status().isForbidden());
    }
}

