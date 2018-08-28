package com.itheima;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * Created by lemon on 2018/8/28.
 *
 * @author: lemon
 * @Description:
 * @Modified By:
 */
public class MpGenerator2 {


//    		<table schema="" tableName="tb_content"></table>
//		<table schema="" tableName="tb_content_category"></table>
//		<table schema="" tableName="tb_item"></table>
//		<table schema="" tableName="tb_item_cat"></table>
//		<table schema="" tableName="tb_item_desc"></table>
//		<table schema="" tableName="tb_item_param"></table>
//		<table schema="" tableName="tb_item_param_item"></table>
//		<table schema="" tableName="tb_order"></table>
//		<table schema="" tableName="tb_order_item"></table>
//		<table schema="" tableName="tb_order_shipping"></table>
//		<table schema="" tableName="tb_user"></table>


    @Test
    public void generateCode() {
        String tables[] = {"tb_content","tb_content_category","tb_item","tb_item_cat","tb_item_desc","tb_item_param","tb_item_param","tb_item_param_item","tb_order","tb_order_item","tb_order_shipping","tb_user"};
        String packageName = "com.itheima";
        boolean serviceNameStartWithI = false;//user -> UserService, 设置成true: user -> IUserService
        generateByTables(serviceNameStartWithI, packageName, tables);


    }

    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://localhost:3306/taotao";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();

        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("admin")
                .setDriverName("com.mysql.jdbc.Driver");

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(false)
                .setAuthor("K神带你飞")
                .setOutputDir("C:\\Users\\lemon\\Desktop\\myTaoTao\\generator\\src\\main\\java")
                .setFileOverride(true);
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity")
                ).execute();
    }

    private void generateByTables(String packageName, String... tableNames) {
        generateByTables(true, packageName, tableNames);
    }
}
