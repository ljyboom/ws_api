package com.ws.api.controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.core.http.CommonResponse;
import com.ws.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ljy
 * @since 2020-01-02
 */
@RestController
@Slf4j
@CrossOrigin
@RequestMapping("/user")
public class UserController {

   @Autowired
   private UserService userService;

   @GetMapping("getAll")
   public CommonResponse getAll(
           @RequestParam(defaultValue = "0") Integer page,
           @RequestParam(defaultValue = "20") Integer size,
           @RequestParam(defaultValue = "ios", required = false) String platform,
           @RequestParam(defaultValue = "en", required = false)String hl,
           @RequestParam(defaultValue = "",required = false) String version){

      log.debug(hl);
      return CommonResponse.ok(userService.page(new Page<>(page + 1,size)));

   }

}
