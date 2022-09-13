package com.macro.ob.service;


import com.macro.ob.pojo.Menu;

import java.util.Map;

/**
* @author huangguo
* @description 针对表【menu(菜单表)】的数据库操作Service
* @createDate 2022-09-05 17:10:33
*/
public interface MenuService {

    /*
     * OB运营后台：菜单管理,查询所有菜单信息
     */
    Map<String,Object> selectAllByMenuName(Menu menu);

}
