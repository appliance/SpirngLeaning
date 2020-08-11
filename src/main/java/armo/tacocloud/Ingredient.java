/**
 * @author: jiecao
 * @description:
 *      引入lombok库， 运行时动态生成属性的set 、 get、 equals 等方法
 *
 * **/


package armo.tacocloud;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data   // @Data类注解 Lombok会为该类生成所有缺失的方法，同时生成所有以final属性作为参数的构造器
@RequiredArgsConstructor    //@RequiredArgsConstructor注解 生成带参或不带参的构造函数
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    /**
     * WARP 卷饼
     * PROTEIN 蛋白
     * VEGGIES 蔬菜
     * CHEESE 起司
     * SAUCE 酱
     * */
    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
