package com.example.ovningsuppgifter.controllers;

import com.example.ovningsuppgifter.models.Friend;
import com.example.ovningsuppgifter.repos.FriendDAO;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Vilma Couturier Kaijser
 * Date: 2021-04-09
 * Project: ovningsuppgifter
 * Copyright: MIT
 */
@RestController
public class FriendController {

 FriendDAO db = new FriendDAO();
 LinkedList<Friend> friends = db.getAllFriends();

 @RequestMapping("/friends")
 public List<Friend> friends(){
  return friends;
 }

 @RequestMapping("/randomkompis")
 public Friend getRandomKompis(){
  return friends.get(randomNumber(friends.size()));
 }

 //http://localhost:8080/kompis/1
 @RequestMapping("/friend/{id}")
 public Friend friendById(@PathVariable int id){
  for (Friend k : friends){
   if(k.getId() == id){
    return k;
   }
  }
  return null;
 }

 private int randomNumber(int bound){
  Random random = new Random();
  int number = random.nextInt(bound);
  return number;
 }



 @RequestMapping("/friend/{id}/delete")
 public String deleteFriendById(@PathVariable int id) {
  int indexToRemove = -1;

  for (int i = 0; i < friends.size(); i++){
   if (friends.get(i).getId() == id){
    indexToRemove = i;
   }
  }
  if(indexToRemove != -1) {
   friends.remove(indexToRemove);
   return "Kompisen med id "+id+"är borttagen";

  }
  return "Kompisen med id "+id+"kunde inte tas bort";
 }


 @PostMapping("/friend/add")
 public String addBook(@RequestBody Friend b){
  friends.add(b);
  return "friend added";
 }

 @PostMapping ("/friend/upsert")
 public String upsertFriend(@RequestBody Friend f){
  int indexToUpdate = -1;

  for (int i = 0; i < friends.size(); i++) {
   if (friends.get(i).getId() == f.getId()){
    indexToUpdate = i;
   }
  }
  if(indexToUpdate == -1){
   friends.add(f);
  } else {
   friends.set(indexToUpdate, f);
  }
  return "friend updated";
 }

}
