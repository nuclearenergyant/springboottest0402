package www.diandian.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/5/21
 * \* Time: 16:10
 * \* Description: www.diandian.在线
 * \* 功能说明：
 * \
 */

/*自动填充get、set、构造方法等*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    //实体类在读取数据库的过程中，是不需要的
    private String username;
    private String password;
}