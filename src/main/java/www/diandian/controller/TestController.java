package www.diandian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import www.diandian.dao.AddressMapper;
import www.diandian.dao.UserinfoDao;
import www.diandian.entity.Address;
import www.diandian.entity.UserInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/5/23
 * \* Time: 17:52
 * \* Description: www.diandian.在线
 * \* 功能说明：
 * \
 */

@Controller
public class TestController {
    /*
    * @Autowired 是一个注释
    * 它可以对类成员变量、方法及构造函数进行标注，
    * 让 spring 完成 bean 自动装配的工作。
    *
    * @Autowired 默认是按照类去匹配，
    * 配合 @Qualifier 指定按照名称去装配 bean。
    * Spring 2.5 引入了 @Autowired 注释，
    * 它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。
    * 通过 @Autowired的使用来消除 set ，get方法。
    * */
    @Autowired
    private UserinfoDao userinfoDao;
    @Autowired
    private AddressMapper addressMapper;

    @RequestMapping("/saveUser")
    @ResponseBody
    public Object SaveUser(){
        System.out.println("======================================");
        UserInfo userInfo =new UserInfo(" 大时代","test2");
        userinfoDao.saveUserInfo(userInfo);
        Map map=new HashMap<String,Object>();
        map.put("code",0);
        map.put("message","保存成功");
        return map;
    }


    @RequestMapping("/delUser")
    @ResponseBody
    public Object delUser(){
        System.out.println("======================================");
        userinfoDao.delUserInfo("李一");
        Map map=new HashMap<String,Object>();
        map.put("code",0);
        map.put("message","删除成功");
        return map;
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public Object updateUser(){
        System.out.println("======================================");
        UserInfo userInfo =new UserInfo("xxx","test_again");
        userinfoDao.updateUserInfoByUsername(userInfo);
        Map map=new HashMap<String,Object>();
        map.put("code",0);
        map.put("message","修改成功");
        return map;
    }

    @RequestMapping("/selectAllUser")
    @ResponseBody
    public Object selectAllUser(){
        System.out.println("======================================");
        List<Map<String, Object>> allUser = userinfoDao.selectUserInfo();
        Map map=new HashMap<String,Object>();
        map.put("code",0);
        map.put("message","查看成功");
        map.put("result",allUser);
        return map;
    }


    /*
    * 根据id返回地址信息
    * */
    @RequestMapping("/getAddressByID")
    @ResponseBody
    public Address getAddressByID(int id){
        return addressMapper.selectByPrimaryKey(id);
    }

    /*
     * 根据id删除地址信息
     * */
    @RequestMapping("/delAddressByID")
    @ResponseBody
    public Object delAddressByID(int id){
        int i = addressMapper.deleteByPrimaryKey(id);
        Map map=new HashMap<String,Object>();
        if (i>0){
            map.put("code",0);
            map.put("message","删除成功");
        }else {
            map.put("code",1);
            map.put("message","删除失败");
        }
        System.out.println("输出测试");
        return map;
    }
}