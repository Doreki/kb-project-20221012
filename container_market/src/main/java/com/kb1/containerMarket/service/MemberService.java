package com.kb1.containerMarket.service;

import com.kb1.containerMarket.web.dto.JoinReqDto;

public interface MemberService{
    void duplicate(JoinReqDto joinReqDto) throws Exception;

    void register(JoinReqDto joinReqDto) throws Exception;
}
