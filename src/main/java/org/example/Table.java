package org.example;

public class Table {
    String tableName;
    String[] tableColumns;

    public Table(){

    }

    public Table(String tableName, String[] tableColumns) {
        this.tableName = tableName;
        this.tableColumns = tableColumns;
    }
}
