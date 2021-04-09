package com.example.ovningsuppgifter.repos;

import com.example.ovningsuppgifter.models.Friend;

import java.util.LinkedList;

/**
 * Created by Vilma Couturier Kaijser
 * Date: 2021-04-09
 * Project: ovningsuppgifter
 * Copyright: MIT
 */
public class FriendDAO {



 public LinkedList<Friend> getAllFriends(){
  Friend k1 = new Friend(1, "Ella", "0703333333", "S");
  Friend k2 = new Friend(2, "Niklas", "07000000", "E");
  Friend k3 = new Friend(3, "Elodie", "07055555", "K");
  Friend k4 = new Friend(4, "Cro", "070888888", "G");


  LinkedList<Friend> friends = new LinkedList<>();
  friends.add(k1);
  friends.add(k2);
  friends.add(k3);
  friends.add(k4);

  return friends;
 }


}
