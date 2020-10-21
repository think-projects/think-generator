package io.github.thinkframework.generator.swing.frame.sql;

import io.github.thinkframework.generator.swing.component.list.GeneratorList;
import io.github.thinkframework.generator.swing.frame.datasource.GeneratorDataSourcePanel;
import org.springframework.beans.factory.InitializingBean;

import javax.swing.*;

/**
 *
 * @author lixiaobin
 */
public class GeneratorSqlFrame extends JFrame implements InitializingBean {

	private GeneratorList generatorList;

    private GeneratorDataSourcePanel generatorDataSourcePanel;

    @Override
    public void afterPropertiesSet() {
        String TITLE = "新建/选择数据库连接";
        int WIDTH = 640;
        int HEIGHT = 480;
        setTitle(TITLE);
        setSize(WIDTH, HEIGHT);// 设置大小
        setLocationRelativeTo(null);//居中
        JSplitPane jSplitPane = new JSplitPane();
        jSplitPane.setLeftComponent(new JScrollPane(generatorList));
        jSplitPane.setRightComponent(new JScrollPane(generatorDataSourcePanel));

        jSplitPane.setOneTouchExpandable(true);
        jSplitPane.setContinuousLayout(true);

        add(jSplitPane);
    }

    public GeneratorList getGeneratorList() {
        return generatorList;
    }

    public void setGeneratorList(GeneratorList generatorList) {
        this.generatorList = generatorList;
    }

    public GeneratorDataSourcePanel getGeneratorConfigurePanel() {
        return generatorDataSourcePanel;
    }

    public void setGeneratorConfigurePanel(GeneratorDataSourcePanel generatorDataSourcePanel) {
        this.generatorDataSourcePanel = generatorDataSourcePanel;
    }
}