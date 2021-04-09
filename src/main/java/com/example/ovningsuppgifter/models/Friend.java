package com.example.ovningsuppgifter.models;

/**
 * Created by Vilma Couturier Kaijser
 * Date: 2021-04-09
 * Project: ovningsuppgifter
 * Copyright: MIT
 */
public class Friend {

 protected int id;
 protected String name;
 protected String phone;
 protected String address;


 public Friend(int id, String name, String phone, String address) {
  this.id = id;
  this.name = name;
  this.phone = phone;
  this.address = address;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

}
