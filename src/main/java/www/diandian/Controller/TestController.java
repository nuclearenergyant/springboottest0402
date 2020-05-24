package www.diandian.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import www.diandian.dao.AddressMapper;
import www.diandian.entity.Address;

import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/5/24
 * \* Time: 13:03
 * \* Description: www.diandian.在线
 * \* 功能说明：
 * \
 */
@Controller
public class TestController {

    @Autowired
    private AddressMapper addressMapper;


    @RequestMapping(value="/addAddress")
    @ResponseBody
    public Object addAddress(){
        Address address=new Address(4,"广西",121323);
        addressMapper.insert(address);
        Map map =new HashMap<String,Object>();
        map.put("code",2);
        map.put("massage","地址保存成功");
        return map;
    }
}