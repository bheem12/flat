package com.cg.frs.service;
import  com.cg.frs.exceptions.*;
import java.util.ArrayList;
import com.cg.frs.dao.FlatRegistrationDAOImpl;
import com.cg.frs.dao.IFlatRegistrationDAO;
import com.cg.frs.dto.FlatRegistrationDTO;
public class FlatRegistrationServiceImpl implements IFlatRegistrationService{
	IFlatRegistrationDAO daoObj=new FlatRegistrationDAOImpl();
	boolean validate(FlatRegistrationDTO flat)  throws WrongAmountException{
		if(flat.getDepositAmount()>flat.getRentAmount()) {
			return true;
		}
		else {
			return false;
		}
		}
	boolean validateOwnerId(FlatRegistrationDTO flat) {
		if(flat.getOwnerId()>=1&&flat.getOwnerId()<=3) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean validateFlatType(FlatRegistrationDTO flat) {
		if(flat.getFlatType()==1||flat.getFlatType()==2) {
			return true;
		}
		else {
			return false;
		}
	}
	
public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) throws WrongAmountException {
				
				if(!validate(flat)) {
					try {
						throw new WrongAmountException();
					} catch (WrongAmountException e) {
					}
					return null;
				}
				if(!validateOwnerId(flat)) {
					try {
						throw new InvalidOwnerIdException();
					} catch (InvalidOwnerIdException e) {
						
						
					}
					return null;
				}
				
				else {
				 FlatRegistrationDTO  flat1 =daoObj.registerFlat(flat);
			        return flat1;
	}}
			
	public ArrayList<Integer> getAllOwnerIds() {
		 ArrayList<Integer> ownerIDs =daoObj.getAllOwnerIds();
			return ownerIDs;
	
	}

}
