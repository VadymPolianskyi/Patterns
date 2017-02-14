package com.polyanski.mediator;

import java.util.Date;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 11:18
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
