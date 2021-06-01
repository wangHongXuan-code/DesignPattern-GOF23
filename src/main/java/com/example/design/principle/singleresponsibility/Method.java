package com.example.design.principle.singleresponsibility;

public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "James";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "James";
    }

    private void updateUserName(String userName, String address) {
        userName = "James";
    }

    private void updateUserAddress(String userName, String address) {
        address = "beijing";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            // todo something1
        } else {
            // todo something2
        }
        userName = "James";
        address = "beijing";
    }
}
