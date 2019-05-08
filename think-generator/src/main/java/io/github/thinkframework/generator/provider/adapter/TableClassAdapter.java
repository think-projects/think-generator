package io.github.thinkframework.generator.provider.adapter;

import io.github.thinkframework.generator.lang.Clazz;
import io.github.thinkframework.generator.lang.ClazzPackage;
import io.github.thinkframework.generator.lang.annotation.ClazzAnnotations;
import io.github.thinkframework.generator.lang.impl.ClazzImpl;
import io.github.thinkframework.generator.lang.reflect.ClazzField;
import io.github.thinkframework.generator.lang.reflect.ClazzMethod;
import io.github.thinkframework.generator.sql.model.*;

import java.util.Collection;

/**
 * 适配数据库表和Java类
 * @author lixiaobin
 * @since 2017/5/12.
 */
public class TableClassAdapter implements Clazz, Table {
    private Clazz clazz;
    private Table table;

    /**
     * 基于表实现
     * @param table
     */
    public TableClassAdapter(Table table){
        this.table = table;
        this.clazz = TableClassBuild.buildClass(table);
    }

    /**
     * 基于类实现
     * @param clazz
     */
    public TableClassAdapter(Clazz clazz){
        this.clazz = clazz;
    }

    @Override
    public ClazzPackage getPackage() {
        return clazz.getPackage();
    }

    @Override
    public String getName() {
        return clazz.getName();
    }

    @Override
    public String getSimpleName() {
        return clazz.getSimpleName();
    }

    @Override
    public Collection<ClazzField> getFields() {
        return clazz.getFields();
    }

    @Override
    public Collection<ClazzMethod> getMethods() {
        return clazz.getMethods();
    }

    @Override
    public ClazzAnnotations getAnnotations() {
        return clazz.getAnnotations();
    }


    @Override
    public String getTableName() {
        return table.getTableName();
    }

    @Override
    public String getTableType() {
        return table.getTableType();
    }

    @Override
    public String getRemarks() {
        return table.getRemarks();
    }

    @Override
    public PrimaryKey getPrimaryKey() {
        return table.getPrimaryKey();
    }

    @Override
    public Collection<Column> getColumns() {
        return table.getColumns();
    }

    @Override
    public Collection<ExportedKey> getExportedKeys() {
        return table.getExportedKeys();
    }

    @Override
    public Collection<ImportedKey> getImportedKeys() {
        return table.getImportedKeys();
    }

    public Collection<ClazzField> getImportedFields() {
        return ((ClazzImpl)clazz).getImportedFields();
    }

    public Collection<ClazzField> getExportedFields() {
        return ((ClazzImpl)clazz).getExportedFields();
    }

    public Collection<ClazzMethod> getImportedMethods() {
        return ((ClazzImpl)clazz).getImportedMethods();
    }

    public Collection<ClazzMethod> getExportedMethods() {
        return ((ClazzImpl)clazz).getExportedMethods();
    }

    public Collection<IndexInfo> getIndexInfos() {
        return table.getIndexInfos();
    }
}