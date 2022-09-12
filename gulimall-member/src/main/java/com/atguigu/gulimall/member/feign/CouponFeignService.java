package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    // 这里的路径要写完整，包括Controller的路径（/coupon/coupon）和Controller里面方法的路径（/member/list）
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
