package com.basic;

import java.util.ArrayList;
import java.util.List;

public class User {
		private int id;
		private String name;
		private List<Mobile> number=new ArrayList();
		public User(int id,String name,List<Mobile> list)
		{
			setId(id);
			setName(name);
			setNumber(list);
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
		public List<Mobile> getNumber() {
			return number;
		}
		public void setNumber(List<Mobile> number) {
			this.number = number;
		}
		@Override
		public String toString()
		{
			return id+"   "+getName()+"       "+getNumber();
		}
}
