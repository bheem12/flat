package com.cg.frs.ui;
import java.util.ArrayList;
import java.util.Scanner;
import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exceptions.WrongAmountException;
import com.cg.frs.service.FlatRegistrationServiceImpl;
import com.cg.frs.service.IFlatRegistrationService;
public class Client {
public static void main(String[] args) throws WrongAmountException  {
		Scanner sc=new Scanner(System.in);
		FlatRegistrationDTO flat= new FlatRegistrationDTO();
		//FlatRegistrationDTO flat1=null;
		IFlatRegistrationService serviceObj=new FlatRegistrationServiceImpl();
		System.out.println("1.Register Flat \n 2.Exit");
		while(true)
		{
			int ch=sc.nextInt();
			switch(ch)
			{case 1:if(serviceObj.getAllOwnerIds()!=null) {
				System.out.println("the existing owner id's are:{1,2,3}");
					System.out.println("enter the owner id from the above details");
					System.out.println("enter owner id");
					flat.setOwnerId(sc.nextInt());
	               System.out.println("enter the flat details");
			        System.out.println("select flat type{1-1 BHK,2-2 BHK}");
			         flat.setFlatType(sc.nextInt());
			         System.out.println("enter flat area");
			        flat.setFlatArea(sc.nextInt());
			         System.out.println("enter rent amount");
			         flat.setRentAmount(sc.nextInt());
			         System.out.println("enter deposit amount");
			         flat.setDepositAmount(sc.nextInt());
			        FlatRegistrationDTO  flat1 =serviceObj.registerFlat(flat);
			        System.out.println("flat registered successfully"+flat.getFlatRegNo());
			}else {
				System.out.println("owner does not exist");
			}
			             break;
			    default:System.exit(0);     
			            break;
			         
			
			}
		}
		
		

	}

}
