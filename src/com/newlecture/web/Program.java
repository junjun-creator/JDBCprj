package com.newlecture.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.newlecture.web.entity.Member;
import com.newlecture.web.service.MemberService;

public class Program {
	public static void main(String[] args) {
		MemberService service = new MemberService();
		List<Member> list = service.getList();	
		
		for(Member m : list) {
			System.out.printf("nicname : %s, name : %s\n",m.getNicname(),m.getName());
		}
	}

}
