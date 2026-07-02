package com.interface_;

public class Interface03 {
    static void main(String[] args) {

        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);

    }

    public static void t(DBInterface dbInterface){
        dbInterface.connect();
        dbInterface.close();

    }

}
