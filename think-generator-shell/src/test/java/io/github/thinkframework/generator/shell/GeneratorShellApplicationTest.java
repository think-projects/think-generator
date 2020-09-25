package io.github.thinkframework.generator.shell;

/**
 * 命令行
 *
 * @author lixiaobin
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

/**
* 命令行运行类
*
* @author lixiaobin
*/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GeneratorShellApplication.class)
public class GeneratorShellApplicationTest {

    @Autowired
    GeneratorShell generatorShell;

    @Test
    public void test(){
        Assert.notNull(generatorShell,"不能为空");
    }
}
