package com.interface_;

public class OracleDB implements DBInterface {
    @Override
    public void close() {
        System.out.println("close oracle");
    }

    @Override
    public void connect() {
        System.out.println("connect oracle");
    }
}
